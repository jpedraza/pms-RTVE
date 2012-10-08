/*
 * Copyright (c) 2011 "Dani Chaves <danichaves@gmail.com>"
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.pms.external.rtve;

import com.irtve.plataforma.rest.model.dto.ViewDTO;
import com.irtve.plataforma.rest.model.dto.channel.CadenaDTO;
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.pms.dlna.virtual.VirtualFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cadenas extends VirtualFolder {

    private static final long REFRESH_TIME = 86400000; // one day
    private static final Logger logger = LoggerFactory.getLogger(Cadenas.class);
    private CadenaDTO cadenaDTO;
    private List<ProgramDTO> programsDTO;
    private int nextPage;

    public Cadenas(CadenaDTO cadenaDTO) {
        super(cadenaDTO.getTitle(), "");
        this.cadenaDTO = cadenaDTO;
        programsDTO = new ArrayList<ProgramDTO>();
    }

    @Override
    public void discoverChildren() {
        nextPage = 1;
        getAllPrograms();
        Collections.sort(programsDTO);
        for (ProgramDTO programDTO : programsDTO) {
            addChild(new Sections(programDTO));
        }
        this.setLastmodified(System.currentTimeMillis());
        this.setLastRefreshTime(this.getLastmodified());
    }

    @Override
    public boolean isRefreshNeeded() {
        if (System.currentTimeMillis() - this.getLastmodified() > REFRESH_TIME) {
            return true;
        }
        return false;
    }

    @Override
    public void doRefreshChildren() {
        try {
            this.getChildren().clear();
            logger.info("RTVE: Refreshing programs of " + cadenaDTO.getTitle());
            discoverChildren();
        } catch (Exception e) {
            logger.error("RTVE: Could not refresh programs. " + e.getMessage());
        }
    }

    private void getAllPrograms() {
        String uri = cadenaDTO.getProgramsRef() + "?page=" + nextPage;
        ViewDTO response = RtveRestClient.getResponse(uri);
        if (response != null && response.getPage().getTotal().intValue() > 0) {
            int totalPages = response.getPage().getTotalPages().intValue();
            int currentPage = response.getPage().getNumber().intValue();
            for (ProgramDTO programDTO : response.getPage().getItems().getPrograms()) {
                if (programDTO.getChannel() == null || !programDTO.getChannel().getUid().startsWith("CRN")) {
                    if (!programsDTO.contains(programDTO)) {
                        programsDTO.add(programDTO);
                    }
                }
            }
            if (totalPages > currentPage) {
                nextPage = currentPage + 1;
                getAllPrograms();
            }
        }
    }
}
