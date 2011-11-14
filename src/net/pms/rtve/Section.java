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

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pms.dlna.virtual.VirtualFolder;
import org.apache.commons.lang.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Section extends VirtualFolder {

    private static final String SECTION_URL = "http://www.rtve.es/alacarta/interno/contenttable.shtml?ctx=";
    private static final long REFRESH_TIME = 86400000; // one day
    private static final Logger LOGGER = LoggerFactory.getLogger(Section.class);
    private String idProgram;

    public Section(String idProgram, String name) {
        super(name, "");
        this.idProgram = idProgram;
    }

    @Override
    public void discoverChildren() {
        byte data[] = null;
        String source = null;
        String lastSeason;
        String season;
        boolean completed;
        String pattern;
        Matcher m;

        lastSeason = "";
        season = "";
        completed = false;
        Map<String, String> seasonList = new LinkedHashMap<String, String>();
        while (completed == false) {
            try {
                data = downloadAndSendBinary(SECTION_URL + idProgram + "&seasonFilter=" + season);
                source = new String(data, "UTF-8");
            } catch (Exception e) {
                LOGGER.error("RTVE: Error retrieving data." + e.getMessage());
            }
            pattern = "<ul id=\"theseasons\">.*?<li class=\"items\">(.*?)</li>";
            m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
            if (m.find()) {
                pattern = "<a.*?seasonFilter=(.*?)\"><span>(.*?)</span>";
                m = Pattern.compile(pattern, Pattern.DOTALL).matcher(m.group(1));
                while (m.find()) {
                    season = m.group(1);
                    String title = m.group(2);
                    if (!"-1".equals(season)) {
                        if (!seasonList.containsKey(season)) {
                            seasonList.put(season, title);
                        }
                    }
                }
            }
            if (lastSeason.equals(season)) {
                completed = true;
            }
            lastSeason = season;
            if (seasonList.size() < 9) {
                completed = true;
            }
        }
        for (Map.Entry<String, String> entry : seasonList.entrySet()) {
            addChild(new Program(new Season(idProgram, entry.getKey(), StringEscapeUtils.unescapeHtml(entry.getValue()), Season.Type.SEASON)));
        }
        if (!seasonList.isEmpty()) {
            addChild(new Program(new Season(idProgram, null, "Todos los capítulos", Season.Type.SEASONS)));
        }

        lastSeason = "";
        season = "";
        completed = false;
        Map<String, String> sectionList = new LinkedHashMap<String, String>();
        while (completed == false) {
            try {
                data = downloadAndSendBinary(SECTION_URL + idProgram + "&seasonFilter=" + season);
                source = new String(data, "UTF-8");
            } catch (Exception e) {
                LOGGER.error("RTVE: Error retrieving data." + e.getMessage());
            }
            pattern = "<ul id=\"thesections\">.*?<li class=\"items\">(.*?)</li>";
            m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
            if (m.find()) {
                pattern = "<a.*?sectionFilter=(.*?)\"><span>(.*?)</span>";
                m = Pattern.compile(pattern, Pattern.DOTALL).matcher(m.group(1));
                while (m.find()) {
                    season = m.group(1);
                    String title = m.group(2);
                    if (!"-1".equals(season)) {
                        if (!sectionList.containsKey(season)) {
                            sectionList.put(season, title);
                        }
                    }
                }
            }
            if (lastSeason.equals(season)) {
                completed = true;
            }
            lastSeason = season;
            if (sectionList.size() < 9) {
                completed = true;
            }
        }
        for (Map.Entry<String, String> entry : sectionList.entrySet()) {
            addChild(new Program(new Season(idProgram, entry.getKey(), StringEscapeUtils.unescapeHtml(entry.getValue()), Season.Type.SECTION)));
        }
        if (!seasonList.isEmpty()) {
            addChild(new Program(new Season(idProgram, null, "Todas las secciones", Season.Type.SECTIONS)));
        }

        addChild(new Program(new Season(idProgram, null, "Todo", Season.Type.ALL)));
        this.setLastmodified(System.currentTimeMillis());
    }

    @Override
    public boolean isRefreshNeeded() {
        if (System.currentTimeMillis() - this.getLastmodified() > REFRESH_TIME) {
            return true;
        }
        return false;
    }

    @Override
    public void refreshChildren() {
        try {
            this.getChildren().clear();
            LOGGER.info("RTVE: Refreshing seasons and sections of " + getName());
            discoverChildren();
            this.setLastRefreshTime(System.currentTimeMillis());
        } catch (Exception e) {
            LOGGER.error("RTVE: Could not refresh seasons and sections. " + e.getMessage());
        }
    }
}
