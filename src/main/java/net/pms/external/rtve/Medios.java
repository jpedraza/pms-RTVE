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

import com.irtve.plataforma.rest.model.dto.ViewDTO;
import com.irtve.plataforma.rest.model.dto.scope.MedioDTO;
import java.util.ArrayList;
import java.util.List;

public class Medios {

    private static final String URI = "http://www.rtve.es/api/medios";
    private List<MedioDTO> mediosDTO;

    public Medios() {
        mediosDTO = new ArrayList<MedioDTO>();
        getAllMedios();
    }

    public List<MedioDTO> getMedios() {
        return mediosDTO;
    }

    public void setMedios(List<MedioDTO> mediosDTO) {
        this.mediosDTO = mediosDTO;
    }

    public boolean isTv(MedioDTO medioDTO) {
        return !medioDTO.getUid().equals("CAD_TELE");
    }

    public boolean isRadio(MedioDTO medioDTO) {
        return !medioDTO.getUid().equals("CAD_RADI");
    }

    private void getAllMedios() {
        String uri = URI;
        ViewDTO response = RtveRestClient.getResponse(uri);
        if (response != null && response.getPage().getTotal().intValue() > 0) {
            for (MedioDTO medioDTO : response.getPage().getItems().getMedios()) {
                mediosDTO.add(medioDTO);
            }
        }
    }
}
