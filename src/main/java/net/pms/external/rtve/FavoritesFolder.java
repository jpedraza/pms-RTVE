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

import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import net.pms.dlna.virtual.VirtualFolder;

public class FavoritesFolder extends VirtualFolder {

    private ProgramDTO programDTO;
    private Favorites favorites;

    public FavoritesFolder(ProgramDTO programDTO) {
        super("" + programDTO.getShortTitle(), programDTO.getThumbnail());
        this.programDTO = programDTO;
        favorites = new Favorites();
    }

    @Override
    public String getName() {
        if (favorites.exists(programDTO.getId().toString())) {
            return "Borrar " + programDTO.getShortTitle() + " de favoritos.";
        }
        return "Añadir " + programDTO.getShortTitle() + " a favoritos.";
    }

    @Override
    public void discoverChildren() {
        if (favorites.exists(programDTO.getId().toString())) {
            favorites.delFavorite(programDTO);
        } else {
            favorites.addFavorite(programDTO);
        }
    }
}
