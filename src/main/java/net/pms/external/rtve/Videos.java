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

import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO;
import java.io.IOException;
import java.io.InputStream;
import net.pms.configuration.RendererConfiguration;
import net.pms.dlna.Range;
import net.pms.dlna.WebVideoStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Videos extends WebVideoStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(Videos.class);
    private VideoDTO videoDTO;
    private Boolean videoUrl;
    private Alacarta alacarta;
    private QualityVideoDTO qualityVideoDTO;

    public Videos(VideoDTO videoDTO, Boolean videoUrl) {
        super(videoDTO.getLongTitle(), videoDTO.getUri(), videoDTO.getThumbnail());
        this.videoDTO = videoDTO;
        this.videoUrl = videoUrl;
        QualitiesVideo qualitiesVideo = new QualitiesVideo(videoDTO.getQualities().getQualities());
        qualityVideoDTO = qualitiesVideo.getBestQuality();
    }

    @Override
    public String getName() {
        if (videoDTO.getShortTitle() != null) {
            return videoDTO.getShortTitle();
        }
        return super.getName();
    }

    @Override
    public InputStream getInputStream(Range range, RendererConfiguration mediarenderer) throws IOException {
        if (qualityVideoDTO != null) {
            if (!videoUrl && alacarta == null) {
                String assetId = qualityVideoDTO.getIdentifier().toString();
                String lang = qualityVideoDTO.getLanguage();
                String mediatype = "video";
                alacarta = new Alacarta(assetId, lang, mediatype);
                try {
                    this.setUrl(alacarta.getVideoLink());
                } catch (Exception e) {
                    LOGGER.info("RTVE: Error discovering video: " + videoDTO.getLongTitle());
                }
            }
        }
        return super.getInputStream(range, mediarenderer);
    }
}
