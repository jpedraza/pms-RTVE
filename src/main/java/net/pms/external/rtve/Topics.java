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
import com.irtve.plataforma.rest.model.dto.topic.TopicDTO;
import net.pms.dlna.virtual.VirtualFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Topics extends VirtualFolder {

    private static final long REFRESH_TIME = 86400000; // one day;
    private static final Integer SIZE = 50;
    private static final Logger logger = LoggerFactory.getLogger(Topics.class);
    private TopicDTO topicDTO;
    private int nextPage;

    public Topics(TopicDTO topicDTO, int page) {
        super("Videos relacionados con " + topicDTO.getTitle(), "");
        this.topicDTO = topicDTO;
        this.nextPage = page;
    }

    @Override
    public void discoverChildren() {
        getAllVideos();
        this.setLastmodified(System.currentTimeMillis());
        this.setLastRefreshTime(this.getLastmodified());
    }

    @Override
    public boolean isRefreshNeeded() {
        if (System.currentTimeMillis() - this.getLastmodified() > REFRESH_TIME) {
            return true;
        }
        return false;
    }

    @Override
    public void doRefreshChildren() {
        try {
            this.getChildren().clear();
            logger.info("RTVE: Refreshing topic " + topicDTO.getTitle());
            discoverChildren();
        } catch (Exception e) {
            logger.error("RTVE: Could not refresh topics. " + e.getMessage());
        }
    }

    private void getAllVideos() {
        String uri = topicDTO.getVideosRef() + "?page=" + nextPage + "&size=" + SIZE;
        ViewDTO response = RtveRestClient.getResponse(uri);
        if (response != null && response.getPage().getTotal().intValue() > 0) {
            int totalPages = response.getPage().getTotalPages().intValue();
            int currentPage = response.getPage().getNumber().intValue();
            for (VideoDTO videoDTO : response.getPage().getItems().getVideos()) {
                addChild(new Videos(videoDTO, false));
            }
            if (totalPages > currentPage) {
                nextPage++;
                addChild(new Topics(topicDTO, nextPage));
            }
        }
    }
}
