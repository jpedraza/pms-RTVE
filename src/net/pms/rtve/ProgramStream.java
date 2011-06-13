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

import com.sun.syndication.feed.synd.SyndEntry;
import java.io.IOException;
import java.io.InputStream;
import net.pms.configuration.RendererConfiguration;
import net.pms.dlna.WebVideoStream;

public class ProgramStream extends WebVideoStream {

    SyndEntry entry;
    Video video;

    public ProgramStream(SyndEntry entry, String icon) {
        super(entry.getTitle(), entry.getLink(), icon);
        this.entry = entry;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public InputStream getInputStream(long low, long high, double timeseek, RendererConfiguration mediarenderer) throws IOException {
        if (video == null) {
            try {
                Alacarta alacarta = new Alacarta(entry.getLink());
                video = alacarta.getVideoLink();
                this.URL = video.getUrl();
            } catch (IOException e) {
            }
        }
        return super.getInputStream(low, high, timeseek, mediarenderer);
    }
}
