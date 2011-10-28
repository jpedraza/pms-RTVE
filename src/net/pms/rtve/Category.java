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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pms.dlna.virtual.VirtualFolder;
import org.apache.commons.lang.StringEscapeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Category extends VirtualFolder {

    private static final long REFRESH_TIME = 86400000; // one day
    private static final Logger LOGGER = LoggerFactory.getLogger(Category.class);
    private String url;

    public Category(String name, String thumbnailIcon, String url) {
        super(name, thumbnailIcon);
        this.url = url;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void discoverChildren() {
        byte data[] = null;
        String source = null;
        String lastSeason = "";
        String season = "";
        boolean completed = false;
        int count = 1;
        while (completed == false) {
            String programmUrl = "http://www.rtve.es";
            programmUrl += url.replace(url.substring(url.lastIndexOf("/") - 1), "");
            programmUrl += count + "/?emissionFilter=all";
            try {
                data = downloadAndSendBinary(programmUrl);
                source = new String(data, "UTF-8");
            } catch (Exception e) {
                LOGGER.error("RTVE: Error retrieving data." + e.getMessage());
            }
            String pattern = "<span class=\"col_tit\".*?id=\"(.*?)\".*?href=\"(.*?)\".*?>(.*?)<.*?</a>";
            Matcher m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
            while (m.find()) {
                if (m.group(2).contains("/alacarta/videos") || m.group(2).contains("/infantil/series/")) {
                    season = m.group(1);
                    addChild(new Section(m.group(1), StringEscapeUtils.unescapeHtml(m.group(3))));
                }
            }
            count = count + 1;
            if (lastSeason.equals(season)) {
                completed = true;
            }
            lastSeason = season;
        }
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
            LOGGER.info("RTVE: Refreshing programs of " + getName());
            discoverChildren();
            this.setLastRefreshTime(System.currentTimeMillis());
        } catch (Exception e) {
            LOGGER.error("RTVE: Could not refresh programs. " + e.getMessage());
        }
    }
}