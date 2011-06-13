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

public class Category extends VirtualFolder {

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
        int count = 1;
        while (true) { // Fucking infinite loop
            int find = 0;
            String programmUrl = "http://www.rtve.es";
            programmUrl += url.replace(url.substring(url.lastIndexOf("/") - 1), "");
            programmUrl += count + "/?emissionFilter=all";
            try {
                data = downloadAndSendBinary(programmUrl);
                source = new String(data, "UTF-8");
            } catch (Exception e) {
            }
            String pattern = "<span class=\"col_tit\".*?id=\"(.*?)\".*?href=\"(.*?)\".*?>(.*?)<.*?</a>";
            Matcher m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
            while (m.find()) {
                if (m.group(2).contains("/alacarta/videos") || m.group(2).contains("/infantil/series/")) {
                    String rss = "http://www.rtve.es/api/programas/" + m.group(1) + "/contents.mrss";
                    addChild(new Program(rss, m.group(3)));
                }
                find = find + 1;
            }
            count = count + 1;
            if (find < 40) {
                break; //Fucking break.
            }
        }
    }
}