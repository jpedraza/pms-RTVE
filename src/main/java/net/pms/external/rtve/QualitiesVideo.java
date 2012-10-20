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

import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QualitiesVideo {

    private static final Logger LOGGER = LoggerFactory.getLogger(QualitiesVideo.class);
    private List<QualityVideoDTO> qualityVideosDTO;

    public QualitiesVideo(List<QualityVideoDTO> qualityVideosDTO) {
        this.qualityVideosDTO = qualityVideosDTO;
    }

    public QualityVideoDTO getBestQuality() {
        if (qualityVideosDTO == null || qualityVideosDTO.isEmpty()) {
            LOGGER.error("RTVE: No video qualities.");
            return null;
        }
        if (qualityVideosDTO.size() == 1) {
            return qualityVideosDTO.get(0);
        }
        QualityVideoDTO q;
        if ((q = getQuality("HIGH")) != null) {
            return q;
        } else if ((q = getQuality("MED")) != null) {
            return q;
        } else {
            return getQuality("LOW");
        }
    }

    private QualityVideoDTO getQuality(final String quality) {
        QualityVideoDTO q = (QualityVideoDTO) CollectionUtils.find(qualityVideosDTO, new Predicate() {
            @Override
            public boolean evaluate(Object o) {
                QualityVideoDTO p = (QualityVideoDTO) o;
                return p.getPreset().equals(quality);
            }
        });
        return q;
    }
}
