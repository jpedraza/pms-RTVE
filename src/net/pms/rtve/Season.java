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
package net.pms.rtve;

public class Season {

    public enum Type {

        SEASON,
        SEASONS,
        SECTION,
        SECTIONS,
        ALL;
    }
    private static final Integer PAGESIZE = 150;
    private String idProgram;
    private String id;
    private String name;
    private Integer pag;
    private Type type;

    public Season(String idProgram, String id, String name, Type type) {
        this.idProgram = idProgram;
        this.id = id;
        this.name = name;
        this.type = type;
        this.pag = 1;
    }

    public Season(String idProgram, String id, String name, Integer pag, Type type) {
        this.idProgram = idProgram;
        this.id = id;
        this.name = name;
        this.pag = pag;
        this.type = type;
    }

    public static int getPAGESIZE() {
        return PAGESIZE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(String idProgram) {
        this.idProgram = idProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPag() {
        return pag;
    }

    public void setPag(Integer pag) {
        this.pag = pag;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String st = "";
        st += "&ctx=" + idProgram;
        st += "&pageSize=" + PAGESIZE;
        if (pag != 1) {
            st += "&pbq=" + pag;
        }
        if (Type.SEASON.equals(this.getType())) {
            st += "&seasonFilter=" + id;
        }
        if (Type.SEASONS.equals(this.getType())) {
            st += "&seasonFilter=-1";
        }
        if (Type.SECTION.equals(this.getType())) {
            st += "&sectionFilter=" + id;
        }
        if (Type.SECTIONS.equals(this.getType())) {
            st += "&sectionFilter=-1";
        }
        if (Type.ALL.equals(this.getType())) {
            st += "&resetFilter=true";
        }
        return st;
    }
}
