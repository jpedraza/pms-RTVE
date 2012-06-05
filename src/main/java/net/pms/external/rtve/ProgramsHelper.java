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

import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;

public class ProgramsHelper {

    private static final Integer SIZE = 50;
    private int page;
    private String title;
    private ProgramDTO programDTO;
    private SectionDTO sectionDTO;
    private SeasonDTO seasonDTO;

    public ProgramsHelper(ProgramDTO programDTO, SectionDTO sectionDTO, SeasonDTO seasonDTO, int page) {
        if (sectionDTO != null && seasonDTO == null) {
            this.sectionDTO = sectionDTO;
            title = sectionDTO.getTitle();
        }
        if (seasonDTO != null && sectionDTO == null) {
            title = seasonDTO.getTitle();
            this.seasonDTO = seasonDTO;
        }
        if (seasonDTO == null && sectionDTO == null) {
            title = "Todo";
        }
        this.programDTO = programDTO;
        this.page = page;
    }

    public ProgramsHelper(ProgramDTO programDTO, SectionDTO sectionDTO, SeasonDTO seasonDTO) {
        if (sectionDTO != null && seasonDTO == null) {
            title = sectionDTO.getTitle();
            this.sectionDTO = sectionDTO;
        }
        if (seasonDTO != null && sectionDTO == null) {
            title = seasonDTO.getTitle();
            this.seasonDTO = seasonDTO;
        }
        this.programDTO = programDTO;
        page = 1;
    }

    public ProgramsHelper(ProgramDTO programDTO, String title) {
        this.title = title;
        this.programDTO = programDTO;
        sectionDTO = null;
        seasonDTO = null;
    }

    public static int getSIZE() {
        return SIZE.intValue();
    }

    public int getPage() {
        return page;
    }

    public void setPag(int page) {
        this.page = page;
    }

    public ProgramDTO getProgram() {
        return programDTO;
    }

    public void setProgram(ProgramDTO programDTO) {
        this.programDTO = programDTO;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SeasonDTO getSeason() {
        return seasonDTO;
    }

    public void setSeason(SeasonDTO seasonDTO) {
        this.seasonDTO = seasonDTO;
    }

    public SectionDTO getSection() {
        return sectionDTO;
    }

    public void setSection(SectionDTO sectionDTO) {
        this.sectionDTO = sectionDTO;
    }

    @Override
    public String toString() {
        String st = "";
        if (seasonDTO != null && sectionDTO == null) {
            st += seasonDTO.getUri() + "/videos";
        }
        if (sectionDTO != null && seasonDTO == null) {
            st += sectionDTO.getUri() + "/videos";
        }
        if (sectionDTO == null && seasonDTO == null) {
            st += st + programDTO.getUri() + "/videos";
        }
        st += "?size=" + SIZE;
        if (page != 0) {
            st += "&page=" + page;
        }
        return st;
    }
}
