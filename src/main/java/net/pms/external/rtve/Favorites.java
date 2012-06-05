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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.pms.PMS;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Favorites {

    private static final String RTVE_FAVORITES = "rtve.favorites";
    private List<String> favorites;
    private static final Logger LOGGER = LoggerFactory.getLogger(Favorites.class);

    public Favorites() {
        refresh();
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public void addFavorite(ProgramDTO programDTO) {
        try {
            favorites.add(0, programDTO.getId().toString());
            PMS.getConfiguration().setCustomProperty(RTVE_FAVORITES, StringUtils.join(favorites, ", "));
            LOGGER.info("RTVE: Adding program " + programDTO.getName() + " to favorites.");
            PMS.getConfiguration().save();
        } catch (ConfigurationException e) {
            LOGGER.error("RTVE: Error adding program " + programDTO.getName() + " to favorites. " + e.getMessage());
        }
    }

    public void delFavorite(ProgramDTO programDTO) {
        try {
            favorites.remove(programDTO.getId().toString());
            PMS.getConfiguration().setCustomProperty(RTVE_FAVORITES, StringUtils.join(favorites, ", "));
            LOGGER.info("RTVE: Removing program " + programDTO.getName() + " of favorites.");
            PMS.getConfiguration().save();
        } catch (ConfigurationException e) {
            LOGGER.error("RTVE: Error removing program " + programDTO.getName() + " of favorites. " + e.getMessage());
        }
    }

    public boolean exists(String idProgram) {
        refresh();
        if (favorites != null && favorites.contains(idProgram)) {
            return true;
        }
        return false;
    }

    private void refresh() {
        try {
            String conf = (String) PMS.getConfiguration().getCustomProperty(RTVE_FAVORITES);
            if (conf == null) {
                LOGGER.info("RTVE: Adding favorites property to configurarion file.");
                PMS.getConfiguration().setCustomProperty(RTVE_FAVORITES, "");
                PMS.getConfiguration().save();
                favorites = new ArrayList<String>();
            } else {
                favorites = new ArrayList<String>(Arrays.asList(conf.split(", ")));
            }
        } catch (ConfigurationException e) {
            LOGGER.error("RTVE: Could not get favorites list. " + e.getMessage());
        }
    }
}
