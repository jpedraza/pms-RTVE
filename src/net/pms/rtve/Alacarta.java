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

import java.io.IOException;
import net.pms.network.HTTPResource;

public class Alacarta extends HTTPResource {

    private String originalUrl;
    Video video;

    public Alacarta(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Video getVideoLink() throws IOException {
        byte data[];
        String source;
        String url;

        url = "http://www.rtve.es/swf/data/es/videos/video/";
        String aux[] = originalUrl.split("/");
        String id = aux[aux.length - 1];

        url = url + id.charAt(id.length() - 1) + "/" + id.charAt(id.length() - 2)
                + "/" + id.charAt(id.length() - 3) + "/" + id.charAt(id.length() - 4)
                + "/" + id + ".xml";

        data = downloadAndSendBinary(url);
        source = new String(data, "UTF-8");

        String duration = source.split("<duration>")[1].split("</duration>")[0];
        String logo = source.split("<image>")[1].split("</image>")[0];
        String title = source.split("<title>")[1].split("</title>")[0];

        String auxId = source.split("assetDataId::")[1];
        String assetId = auxId.split("\"")[0];
        url = "http://www.rtve.es/scd/CONTENTS/ASSET_DATA_VIDEO/";
        url = url + assetId.charAt(assetId.length() - 1) + "/"
                + assetId.charAt(assetId.length() - 2) + "/"
                + assetId.charAt(assetId.length() - 3) + "/"
                + assetId.charAt(assetId.length() - 4) + "/ASSET_DATA_VIDEO-"
                + assetId + ".xml";

        data = downloadAndSendBinary(url);
        source = new String(data, "UTF-8");

        String location = source.split("defaultLocation=\"/deliverty/demo/resources/")[1].split("\"")[0];
        String link = "http://www.rtve.es/resources/TE_NGVA/" + location;
        video = new Video();
        video.setUrl(link);
        video.setDuration(Long.parseLong(duration) / 1000);
        video.setLogo(logo);
        video.setTitle(title);
        return video;
    }
}
