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
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import net.pms.PMS;
import net.pms.util.PropertiesUtil;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RtveRestClient {

    public enum Format {

        XML,
        JSON,
        RSS,
        PLIST
    }
    private static final Logger LOGGER = LoggerFactory.getLogger(RtveRestClient.class);

    public static ViewDTO getResponse(String uri) {
        return getResponse(uri, Format.XML);
    }

    public static ViewDTO getResponse(String uri, Format format) {
        try {
            HttpClient client = new HttpClient();
            GetMethod method = new GetMethod(uri);
            method.setRequestHeader("Accept", "application/" + format.toString().toLowerCase());
            method.setRequestHeader("User-agent", PropertiesUtil.getProjectProperties().get("project.name") + " " + PMS.getVersion());
            LOGGER.info("RTVE: Retrieving " + uri);
            if (client.executeMethod(method) == 200) {
                InputStream xml = method.getResponseBodyAsStream();
                JAXBContext jc = JAXBContext.newInstance(ViewDTO.class);
                ViewDTO response = (ViewDTO) jc.createUnmarshaller().unmarshal(xml);
                method.releaseConnection();
                return response;
            } else {
                LOGGER.error("RTVE: Method failed: ", method.getStatusLine());
            }
        } catch (JAXBException ex) {
            LOGGER.error(ex.getMessage());
        } catch (HttpException ex) {
            LOGGER.error(ex.getMessage());
        } catch (IOException ex) {
            LOGGER.error(ex.getMessage());
        }
        return null;
    }

    public static ViewDTO getResponseJava(String uri) {
        return getResponseJava(uri, Format.XML);
    }

    public static ViewDTO getResponseJava(String uri, Format format) {
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/" + format.toString().toLowerCase());
            connection.setRequestProperty("User-agent", PropertiesUtil.getProjectProperties().get("project.name") + " " + PMS.getVersion());
            LOGGER.info("RTVE: Retrieving " + uri);
            InputStream xml = connection.getInputStream();
            JAXBContext jc = JAXBContext.newInstance(ViewDTO.class);
            ViewDTO response = (ViewDTO) jc.createUnmarshaller().unmarshal(xml);
            connection.disconnect();
            return response;
        } catch (JAXBException ex) {
            LOGGER.error(ex.getMessage());
        } catch (MalformedURLException ex) {
            LOGGER.error(ex.getMessage());
        } catch (IOException ex) {
            LOGGER.error(ex.getMessage());
        }
        return null;
    }
}
