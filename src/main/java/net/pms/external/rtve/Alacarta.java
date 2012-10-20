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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.JAXBContext;
import net.pms.PMS;
import net.pms.external.rtve.response.Response;
import net.pms.external.rtve.response.Url;
import net.pms.network.HTTPResource;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Alacarta extends HTTPResource {

    private static final String KEY_FILE = "pms-RTVE.properties";
    private static final String URL_REST = "http://ztnr.rtve.es/ztnr/res/";
    private static String KEY;
    private String assetId;
    private String lang;
    private String mediatype;
    private static final Logger LOGGER = LoggerFactory.getLogger(Alacarta.class);

    public Alacarta(String assetId, String lang, String mediatype) {
        this.assetId = assetId;
        this.lang = lang;
        this.mediatype = mediatype;
        readKey();
    }

    public String getVideoLink() throws Exception {
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
        SecretKeySpec ks = new SecretKeySpec(KEY.getBytes(), "Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, ks);
        String cleartext = assetId + "_" + mediatype + "_" + lang;
        String b64textReq = Base64.encodeBase64String(cipher.doFinal(cleartext.getBytes()));
        byte data[] = downloadAndSendBinary(URL_REST + b64textReq);
        String b64textRes = new String(data, "UTF-8");
        byte[] ciphertext = Base64.decodeBase64(b64textRes.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, ks);
        InputStream xml = new ByteArrayInputStream(cipher.doFinal(ciphertext));
        JAXBContext jc = JAXBContext.newInstance(Response.class);
        Response response = (Response) jc.createUnmarshaller().unmarshal(xml);
        if (response != null && response.getCode().equalsIgnoreCase("OK")) {
            Url url = (Url) CollectionUtils.find(response.getUrl(), new Predicate() {
                @Override
                public boolean evaluate(Object o) {
                    Url u = (Url) o;
                    return u.getTipo().equals("failover");
                }
            });
            return url.getValue();
        }
        return null;
    }

    private void readKey() {
        try {
            Properties prop = new Properties();
            String dir = PMS.getConfiguration().getPluginDirectory();
            String file = dir + File.separator + KEY_FILE;
            prop.load(new FileInputStream(file));
            KEY = prop.getProperty("rtve.key");
        } catch (IOException ex) {
            LOGGER.error("RTVE: Error getting key for decryption: " + ex.getMessage());
        }
    }
}
