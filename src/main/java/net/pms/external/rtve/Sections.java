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
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;
import java.io.IOException;
import java.io.InputStream;
import net.pms.dlna.virtual.VirtualFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sections extends VirtualFolder {

    private static final long REFRESH_TIME = 86400000; // one day;
    private static final Logger logger = LoggerFactory.getLogger(Sections.class);
    private ProgramDTO programDTO;
    private int nextPage;

    public Sections(ProgramDTO programDTO) {
        super(programDTO.getName(), programDTO.getThumbnail());
        this.programDTO = programDTO;
    }

    @Override
    public InputStream getThumbnailInputStream() {
        try {
            return downloadAndSend(programDTO.getThumbnail(), true);
        } catch (IOException e) {
            return super.getThumbnailInputStream();
        }
    }

    @Override
    public void discoverChildren() {
        addChild(new FavoritesFolder(programDTO));
        nextPage = 1;
        getAllSeasons();
        nextPage = 1;
        getAllSections();
        addChild(new Programs(new ProgramsHelper(programDTO, "Todo")));
        this.setLastmodified(System.currentTimeMillis());
        this.setLastRefreshTime(this.getLastmodified());
    }

    @Override
    public boolean isRefreshNeeded() {
        if (System.currentTimeMillis() - this.getLastmodified() > REFRESH_TIME
                && !programDTO.isOutOfEmission()) {
            return true;
        }
        return false;
    }

    @Override
    public void doRefreshChildren() {
        try {
            this.getChildren().clear();
            logger.info("RTVE: Refreshing seasons and sections of " + programDTO.getName());
            discoverChildren();
        } catch (Exception e) {
            logger.error("RTVE: Could not refresh seasons and sections. " + e.getMessage());
        }
    }

    private void getAllSections() {
        String uri = programDTO.getSeccionesRef() + "?page=" + nextPage;
        ViewDTO response = RtveRestClient.getResponse(uri);
        if (response != null && response.getPage().getTotal().intValue() > 0) {
            int totalPages = response.getPage().getTotalPages().intValue();
            int currentPage = response.getPage().getNumber().intValue();
            for (SectionDTO sectionDTO : response.getPage().getItems().getSections()) {
                addChild(new Programs(new ProgramsHelper(programDTO, sectionDTO, null)));
            }
            if (totalPages > currentPage) {
                nextPage = currentPage + 1;
                getAllSections();
            }
        }
    }

    private void getAllSeasons() {
        String uri = programDTO.getTemporadasRef() + "?page=" + nextPage;
        ViewDTO response = RtveRestClient.getResponse(uri);
        if (response != null && response.getPage().getTotal().intValue() > 0) {
            int totalPages = response.getPage().getTotalPages().intValue();
            int currentPage = response.getPage().getNumber().intValue();
            for (SeasonDTO seasonDTO : response.getPage().getItems().getSeasons()) {
                addChild(new Programs(new ProgramsHelper(programDTO, null, seasonDTO)));
            }
            if (totalPages > currentPage) {
                nextPage = currentPage + 1;
                getAllSeasons();
            }
        }
    }
}
