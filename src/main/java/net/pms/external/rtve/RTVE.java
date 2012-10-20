/*
 * Copyright (c) 2011 "Dani Chaves <danichaves@gmail.com>"
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.pms.external.rtve;

import java.io.InputStream;
import javax.swing.JComponent;
import net.pms.dlna.DLNAResource;
import net.pms.dlna.virtual.VirtualFolder;
import net.pms.external.AdditionalFolderAtRoot;

public class RTVE implements AdditionalFolderAtRoot {

    public enum Type {

        AGRUPADORES("Categorías"),
        CHANNELS("Canales"),
        LATEST_VIDEOS("Últimos videos"),
        LATEST_PROGRAMS("Últimos programas"),
        FAVORITES("Favoritos");
        private String name;

        private Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    private static final String NAME = "RTVE";

    @Override
    public DLNAResource getChild() {
        VirtualFolder mainFolder = new VirtualFolder(NAME, "") {
            @Override
            public InputStream getThumbnailInputStream() {
                try {
                    return RTVE.class.getResourceAsStream("/images/rtve.png");
                } catch (Exception e) {
                    return super.getThumbnailInputStream();
                }
            }
        };
        mainFolder.addChild(new MainFolder(Type.AGRUPADORES, Type.AGRUPADORES.getName()));
        mainFolder.addChild(new MainFolder(Type.CHANNELS, Type.CHANNELS.getName()));
        mainFolder.addChild(new MainFolder(Type.LATEST_VIDEOS, Type.LATEST_VIDEOS.getName()));
        mainFolder.addChild(new MainFolder(Type.LATEST_PROGRAMS, Type.LATEST_PROGRAMS.getName()));
        mainFolder.addChild(new MainFolder(Type.FAVORITES, Type.FAVORITES.getName()));
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
