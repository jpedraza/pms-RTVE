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
import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO;
import com.irtve.plataforma.rest.model.dto.topic.TopicDTO;
import java.io.IOException;
import java.io.InputStream;
import net.pms.dlna.virtual.VirtualFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VideoContainer extends VirtualFolder {

    private static final Logger LOGGER = LoggerFactory.getLogger(VideoContainer.class);
    private VideoDTO videoDTO;

    public VideoContainer(VideoDTO videoDTO) {
        super(videoDTO.getLongTitle(), videoDTO.getThumbnail());
        this.videoDTO = videoDTO;
    }

    @Override
    public String getName() {
        if (videoDTO.getShortTitle() != null) {
            return videoDTO.getShortTitle();
        }
        return super.getName();
    }

    @Override
    public InputStream getThumbnailInputStream() {
        try {
            return downloadAndSend(videoDTO.getThumbnail(), true);
        } catch (IOException e) {
            return super.getThumbnailInputStream();
        }
    }

    @Override
    public void discoverChildren() {
        getAllVideoTopics();
        this.setLastmodified(System.currentTimeMillis());
        this.setLastRefreshTime(this.getLastmodified());
    }

    private void getAllVideoTopics() {
        try {
            QualitiesVideo qualitiesVideo = new QualitiesVideo(videoDTO.getQualities().getQualityVideos());
            QualityVideoDTO qualityVideoDTO = qualitiesVideo.getBestQuality();
            String assetId = qualityVideoDTO.getIdentifier().toString();
            String lang = qualityVideoDTO.getLanguage();
            String mediatype = "video";
            Alacarta alacarta = new Alacarta(assetId, lang, mediatype);
            videoDTO.setUri(alacarta.getVideoLink());
            addChild(new Videos(videoDTO, true));
            ViewDTO response = RtveRestClient.getResponse(videoDTO.getMainCategoryRef());
            if (response != null && response.getPage().getTotal().intValue() > 0) {
                for (TopicDTO topicDTO : response.getPage().getItems().getTopics()) {
                    addChild(new Topics(topicDTO, 1));
                }
            }
            response = RtveRestClient.getResponse(videoDTO.getOtherTopicsRefs());
            if (response != null && response.getPage().getTotal().intValue() > 0) {
                for (TopicDTO topicDTO : response.getPage().getItems().getTopics()) {
                    addChild(new Topics(topicDTO, 1));
                }
            }
        } catch (Exception ex) {
            LOGGER.error("RTVE: Error discovering video: " + videoDTO.getLongTitle());
        }
    }
}
