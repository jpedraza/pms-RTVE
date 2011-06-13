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
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import net.pms.dlna.virtual.VirtualFolder;

public class Program extends VirtualFolder {

    private SyndFeed feed;
    private String icon;
    private String rss;

    public Program(String rss, String name) {
        super(name, "");
        this.rss = rss;
    }

    @Override
    public InputStream getThumbnailInputStream() {
        try {
            icon = "http://www.rtve.es" + feed.getImage().getUrl();
            return downloadAndSend(icon, true);
        } catch (Exception e) {
            return super.getThumbnailInputStream();
        }
    }

    @Override
    public void discoverChildren() {
        try {
            URL url = new URL(rss);
            XmlReader reader = new XmlReader(url);
            feed = new SyndFeedInput().build(reader);
            icon = "http://www.rtve.es" + feed.getImage().getUrl();
            List<SyndEntry> entries = feed.getEntries();
            for(SyndEntry entry: entries) {
                addChild(new ProgramStream(entry, icon));
            }
        } catch (Exception e) {
        }
    }
}
