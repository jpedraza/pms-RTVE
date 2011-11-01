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

import java.io.IOException;
import net.pms.network.HTTPResource;

public class Alacarta extends HTTPResource {

    private String assetId;

    public Alacarta(String assetId) {
        this.assetId = assetId;
    }

    public String getVideoLink() throws IOException {
        String url = "http://www.rtve.es/ztnr/preset.jsp?idpreset=" + assetId + "&lenguaje=es&tipo=video";
        byte data[] = downloadAndSendBinary(url);
        String source = new String(data, "UTF-8");
        String location = source.split("<li><em>File Name</em>&nbsp;<span class=\"titulo\">")[1].split("</span></li>")[0];
        return "http://www.rtve.es/resources/TE_NGVA/" + location;
    }
}
