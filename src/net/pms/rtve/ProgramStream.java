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
import java.io.InputStream;
import net.pms.configuration.RendererConfiguration;
import net.pms.dlna.WebVideoStream;

public class ProgramStream extends WebVideoStream {

    String urlAlacarta;
    Video video;

    public ProgramStream(String urlAlacarta, String name) {
        super(name, urlAlacarta, "");
        this.urlAlacarta = urlAlacarta;
    }

    @Override
    public InputStream getInputStream(long low, long high, double timeseek, RendererConfiguration mediarenderer) throws IOException {
        if (video == null) {
            try {
                Alacarta alacarta = new Alacarta(urlAlacarta);
                video = alacarta.getVideoLink();
                this.URL = video.getUrl();
            } catch (IOException e) {
            }
        }
        return super.getInputStream(0, high, timeseek, mediarenderer);
    }
}
