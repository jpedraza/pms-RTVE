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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import net.pms.dlna.DLNAResource;
import net.pms.dlna.virtual.VirtualFolder;
import net.pms.external.AdditionalFolderAtRoot;
import net.pms.network.HTTPResource;

public class RTVE extends HTTPResource implements AdditionalFolderAtRoot {

    private static final String ICON = "http://www.rtve.es/static/css/i/logo.png";
    private static final String NAME = "RTVE";
    private static final String CATEGORY_URL = "http://www.rtve.es/alacarta/programas/todos/todos/1/";

    @Override
    public DLNAResource getChild() {
        VirtualFolder mainFolder = new VirtualFolder(NAME, null) {

            @Override
            public InputStream getThumbnailInputStream() {
                try {
                    return downloadAndSend(ICON, true);
                } catch (IOException e) {
                    return super.getThumbnailInputStream();
                }
            }
        };

        byte data[] = null;
        String source = null;
        try {
            data = downloadAndSendBinary(CATEGORY_URL);
            source = new String(data, "UTF-8");
        } catch (IOException e) {
        }
        if (source != null) {
            String pattern = "<div class=\"SlideList\">(.*?)<ul class=\"families\">";
            Matcher m = Pattern.compile(pattern, Pattern.DOTALL).matcher(source);
            if (m.find()) {
                pattern = "<li><a title.*?href=\"(.*?)\"><span>(.*?)</span></a></li>";
                m = Pattern.compile(pattern, Pattern.DOTALL).matcher(m.group(1));
                while (m.find()) {
                    mainFolder.addChild(new Category(m.group(2), "", m.group(1)));
                }
            }
        }
        return mainFolder;
    }

    @Override
    public JComponent config() {
        return null;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public void shutdown() {
    }
}
