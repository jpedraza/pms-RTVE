/*
 * Copyright (c) 2011 "Dani Chaves <danichaves@gmail.com>"
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.pms.external.rtve;

import com.irtve.plataforma.rest.model.dto.ViewDTO;
import com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO;
import com.irtve.plataforma.rest.model.dto.channel.CadenaDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.pms.dlna.virtual.VirtualFolder;
import net.pms.external.rtve.RTVE.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainFolder extends VirtualFolder {

    private static final long REFRESH_TIME = 86400000; // one day
    private static final long REFRESH_TIME_LATEST_VIDEOS = 900000; // 15 minutes
    private static final String URI = "http://www.rtve.es/api/";
    private static final Integer SIZE = 50;
    private static final Logger logger = LoggerFactory.getLogger(MainFolder.class);
    private List<AgrupadorDTO> agrupadoresDTO;
    private List<CadenaDTO> cadenasDTO;
    private Favorites favorites;
    private Type type;

    public MainFolder(Type type, String name) {
        super(name, "");
        this.type = type;
        agrupadoresDTO = new ArrayList<AgrupadorDTO>();
        cadenasDTO = new ArrayList<CadenaDTO>();
    }

    @Override
    public void discoverChildren() {
        getContent();
        Collections.sort(agrupadoresDTO);
        Collections.sort(cadenasDTO);
        for (AgrupadorDTO agrupadorDTO : agrupadoresDTO) {
            addChild(new Agrupadores(agrupadorDTO));
        }
        for (CadenaDTO cadenaDTO : cadenasDTO) {
            addChild(new Cadenas(cadenaDTO));
        }
        this.setLastmodified(System.currentTimeMillis());
        this.setLastRefreshTime(this.getLastmodified());
    }

    @Override
    public boolean isRefreshNeeded() {
        long time;
        if (type.equals(Type.LATEST_VIDEOS)) {
            time = REFRESH_TIME_LATEST_VIDEOS;
        } else if (type.equals(Type.FAVORITES)) {
            time = 30000;
        } else {
            time = REFRESH_TIME;
        }
        if (System.currentTimeMillis() - this.getLastmodified() > time) {
            return true;
        }
        return false;
    }

    @Override
    public void doRefreshChildren() {
        try {
            this.getChildren().clear();
            logger.info("RTVE: Refreshing RTVE main content (" + name + ").");
            discoverChildren();
        } catch (Exception e) {
            logger.error("RTVE: Could not refresh RTVE main content(" + name + "). " + e.getMessage());
        }
    }

    private void getContent() {
        if (type.equals(Type.AGRUPADORES)) {
            String uri = URI + "agrupadores";
            ViewDTO response = RtveRestClient.getResponse(uri);
            if (response != null && response.getPage().getTotal().intValue() > 0) {
                for (AgrupadorDTO agrupadorDTO : response.getPage().getItems().getAgrupadores()) {
                    if (!agrupadoresDTO.contains(agrupadorDTO)) {
                        agrupadoresDTO.add(agrupadorDTO);
                    }
                }
            }
        }
        if (type.equals(Type.CHANNELS)) {
            String uri = URI + "cadenas";
            ViewDTO response = RtveRestClient.getResponse(uri);
            if (response != null && response.getPage().getTotal().intValue() > 0) {
                for (CadenaDTO cadenaDTO : response.getPage().getItems().getCadenas()) {
                    if (!cadenaDTO.getUid().startsWith("CRN")) {
                        if (!cadenasDTO.contains(cadenaDTO)) {
                            cadenasDTO.add(cadenaDTO);
                        }
                    }
                }
            }
        }
        if (type.equals(Type.LATEST_VIDEOS)) {
            String uri = URI + "videos" + "?size=" + SIZE;
            ViewDTO response = RtveRestClient.getResponse(uri);
            if (response != null && response.getPage().getTotal().intValue() > 0) {
                for (VideoDTO videoDTO : response.getPage().getItems().getVideos()) {
                    addChild(new VideoContainer(videoDTO));
                }
            }
        }
        if (type.equals(Type.LATEST_PROGRAMS)) {
            String uri = URI + "programas" + "?size=" + SIZE;
            ViewDTO response = RtveRestClient.getResponse(uri);
            if (response != null && response.getPage().getTotal().intValue() > 0) {
                for (ProgramDTO programDTO : response.getPage().getItems().getPrograms()) {
                    if (programDTO.getChannel() == null || !programDTO.getChannel().getUid().startsWith("CRN")) {
                        addChild(new Sections(programDTO));
                    }
                }
            }
        }
        if (type.equals(Type.FAVORITES)) {
            favorites = new Favorites();
            List<String> programs = favorites.getFavorites();
            for (String program : programs) {
                if (!program.trim().isEmpty()) {
                    String uri = URI + "programas/" + program;
                    ViewDTO response = RtveRestClient.getResponse(uri);
                    if (response != null && response.getPage().getTotal().intValue() > 0) {
                        for (ProgramDTO programDTO : response.getPage().getItems().getPrograms()) {
                            addChild(new Sections(programDTO));
                        }
                    }
                }
            }
        }
    }
}