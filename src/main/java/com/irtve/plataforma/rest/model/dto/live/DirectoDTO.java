package com.irtve.plataforma.rest.model.dto.live;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}uri"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}htmlUrl"/>
 *           &lt;element ref="{}htmlShortUrl"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}language"/>
 *         &lt;element ref="{}longTitle"/>
 *         &lt;element ref="{}shortTitle"/>
 *         &lt;element ref="{}mainCategoryRef"/>
 *         &lt;element ref="{}publicationDate"/>
 *         &lt;element ref="{}expirationDate" minOccurs="0"/>
 *         &lt;element ref="{}pubState"/>
 *         &lt;element ref="{}infoUrl" minOccurs="0"/>
 *         &lt;element ref="{}liveUrl"/>
 *         &lt;element ref="{}iphoneUrl" minOccurs="0"/>
 *         &lt;element ref="{}outstanding"/>
 *         &lt;element ref="{}startDate"/>
 *         &lt;element ref="{}endDate"/>
 *         &lt;element ref="{}image" minOccurs="0"/>
 *         &lt;element ref="{}channelRef"/>
 *         &lt;element ref="{}programRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uri",
    "htmlUrl",
    "htmlShortUrl",
    "id",
    "language",
    "longTitle",
    "shortTitle",
    "mainCategoryRef",
    "publicationDate",
    "expirationDate",
    "pubState",
    "infoUrl",
    "liveUrl",
    "iphoneUrl",
    "outstanding",
    "startDate",
    "endDate",
    "image",
    "channelRef",
    "programRef"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.live.DirectoDTO")
public class DirectoDTO implements Comparable<DirectoDTO> {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlSchemaType(name = "anyURI")
    protected String htmlUrl;
    @XmlSchemaType(name = "anyURI")
    protected String htmlShortUrl;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String language;
    @XmlElement(required = true)
    protected String longTitle;
    @XmlElement(required = true)
    protected String shortTitle;
    @XmlElement(required = true)
    protected String mainCategoryRef;
    @XmlElement(required = true)
    protected String publicationDate;
    protected String expirationDate;
    @XmlElement(required = true)
    protected PubState pubState;
    @XmlSchemaType(name = "anyURI")
    protected String infoUrl;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String liveUrl;
    @XmlSchemaType(name = "anyURI")
    protected String iphoneUrl;
    protected boolean outstanding;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String endDate;
    @XmlSchemaType(name = "anyURI")
    protected String image;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String channelRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String programRef;

    /**
     * Gets the value of the uri property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the htmlUrl property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Sets the value of the htmlUrl property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHtmlUrl(String value) {
        this.htmlUrl = value;
    }

    /**
     * Gets the value of the htmlShortUrl property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHtmlShortUrl() {
        return htmlShortUrl;
    }

    /**
     * Sets the value of the htmlShortUrl property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHtmlShortUrl(String value) {
        this.htmlShortUrl = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the longTitle property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLongTitle() {
        return longTitle;
    }

    /**
     * Sets the value of the longTitle property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLongTitle(String value) {
        this.longTitle = value;
    }

    /**
     * Gets the value of the shortTitle property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * Sets the value of the shortTitle property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setShortTitle(String value) {
        this.shortTitle = value;
    }

    /**
     * Gets the value of the mainCategoryRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMainCategoryRef() {
        return mainCategoryRef;
    }

    /**
     * Sets the value of the mainCategoryRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMainCategoryRef(String value) {
        this.mainCategoryRef = value;
    }

    /**
     * Gets the value of the publicationDate property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the pubState property.
     *
     * @return possible object is {@link PubState }
     *
     */
    public PubState getPubState() {
        return pubState;
    }

    /**
     * Sets the value of the pubState property.
     *
     * @param value allowed object is {@link PubState }
     *
     */
    public void setPubState(PubState value) {
        this.pubState = value;
    }

    /**
     * Gets the value of the infoUrl property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
     * Sets the value of the infoUrl property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setInfoUrl(String value) {
        this.infoUrl = value;
    }

    /**
     * Gets the value of the liveUrl property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLiveUrl() {
        return liveUrl;
    }

    /**
     * Sets the value of the liveUrl property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLiveUrl(String value) {
        this.liveUrl = value;
    }

    /**
     * Gets the value of the iphoneUrl property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIphoneUrl() {
        return iphoneUrl;
    }

    /**
     * Sets the value of the iphoneUrl property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIphoneUrl(String value) {
        this.iphoneUrl = value;
    }

    /**
     * Gets the value of the outstanding property.
     *
     */
    public boolean isOutstanding() {
        return outstanding;
    }

    /**
     * Sets the value of the outstanding property.
     *
     */
    public void setOutstanding(boolean value) {
        this.outstanding = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the image property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the channelRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getChannelRef() {
        return channelRef;
    }

    /**
     * Sets the value of the channelRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setChannelRef(String value) {
        this.channelRef = value;
    }

    /**
     * Gets the value of the programRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProgramRef() {
        return programRef;
    }

    /**
     * Sets the value of the programRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProgramRef(String value) {
        this.programRef = value;
    }

    @Override
    public int compareTo(DirectoDTO d) {
        return this.getId().compareTo(d.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DirectoDTO)) {
            return false;
        }
        DirectoDTO direct = (DirectoDTO) o;
        return uri.equals(direct.getUri())
                && id.equals(direct.getId())
                && publicationDate.equals(direct.getPublicationDate())
                && longTitle.equals(direct.getLongTitle());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.uri != null ? this.uri.hashCode() : 0);
        hash = 29 * hash + (this.publicationDate != null ? this.publicationDate.hashCode() : 0);
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.longTitle != null ? this.longTitle.hashCode() : 0);
        return hash;
    }
}
