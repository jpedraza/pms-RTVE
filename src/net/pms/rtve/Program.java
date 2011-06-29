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

public class Program extends VirtualFolder {

    private static final String PROGRAM_URL = "http://www.rtve.es/alacarta/interno/contenttable.shtml?";
    private Season season;

    public Program(Season season) {
        super(season.getName(), "");
        this.season = season;
    }

    @Override
    public void discoverChildren() {
        byte data[] = null;
        String source = null;
        String pattern;
        Matcher m;
        Integer total = null;

        try {
            data = downloadAndSendBinary(PROGRAM_URL + season.toString());
            source = new String(data, "UTF-8");
        } catch (Exception e) {
        }

        pattern = "<h2>(.*?)</h2>";
        m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
        if (m.find()) {
            total = Integer.parseInt(m.group(1).trim().substring(0, 24).replaceAll("[^0-9]", ""));
        }

        pattern = "<span class=\"col_tit\".*?id=\"(.*?)\".*?href=\"(.*?)\".*?>(.*?)</a>";
        m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
        while (m.find()) {
            String programName = null;
            programName = StringEscapeUtils.unescapeHtml(m.group(3)).replaceAll("\\<[^>]*>", "");
            addChild(new ProgramStream("http://www.rtve.es" + m.group(2), programName));
        }

        if (total >= (season.getPag() * Season.getPAGESIZE())) {
            addChild(new Program(new Season(season.getIdProgram(), season.getId(), "Más", season.getPag() + 1, season.getType())));
        }
    }
}
