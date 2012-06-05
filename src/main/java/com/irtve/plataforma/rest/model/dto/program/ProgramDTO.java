package com.irtve.plataforma.rest.model.dto.program;

import com.irtve.plataforma.rest.model.dto.Channel;
import java.math.BigInteger;
import javax.xml.bind.annotation.*;
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
 *         &lt;element ref="{}htmlUrl"/>
 *         &lt;element ref="{}htmlShortUrl"/>
 *         &lt;element ref="{}id"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}uid"/>
 *           &lt;element ref="{}name"/>
 *           &lt;element ref="{}permalink"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}language"/>
 *         &lt;element ref="{}longTitle"/>
 *         &lt;element ref="{}shortTitle"/>
 *         &lt;element ref="{}description" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}longDescription"/>
 *           &lt;element ref="{}showMan"/>
 *         &lt;/choice>
 *         &lt;element ref="{}director" minOccurs="0"/>
 *         &lt;element ref="{}emission" minOccurs="0"/>
 *         &lt;element ref="{}thumbnail"/>
 *         &lt;element ref="{}logo"/>
 *         &lt;element ref="{}outOfEmission"/>
 *         &lt;element ref="{}channel" minOccurs="0"/>
 *         &lt;element ref="{}fanBoxID"/>
 *         &lt;element ref="{}seccionesRef"/>
 *         &lt;element ref="{}temporadasRef"/>
 *         &lt;element ref="{}agrupadoresRef"/>
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
    "uid",
    "name",
    "permalink",
    "language",
    "longTitle",
    "shortTitle",
    "description",
    "longDescription",
    "showMan",
    "director",
    "emission",
    "thumbnail",
    "logo",
    "outOfEmission",
    "channel",
    "fanBoxID",
    "seccionesRef",
    "temporadasRef",
    "agrupadoresRef"
})
public class ProgramDTO implements Comparable<ProgramDTO> {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String htmlUrl;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String htmlShortUrl;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String uid;
    protected String name;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String permalink;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String language;
    @XmlElement(required = true)
    protected String longTitle;
    @XmlElement(required = true)
    protected String shortTitle;
    protected String description;
    protected String longDescription;
    protected String showMan;
    protected String director;
    protected String emission;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String thumbnail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String logo;
    protected boolean outOfEmission;
    protected Channel channel;
    @XmlElement(required = true)
    protected BigInteger fanBoxID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String seccionesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String temporadasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String agrupadoresRef;

    /**
     * Gets the value of the uri property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the htmlUrl property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Sets the value of the htmlUrl property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setHtmlUrl(String value) {
        this.htmlUrl = value;
    }

    /**
     * Gets the value of the htmlShortUrl property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getHtmlShortUrl() {
        return htmlShortUrl;
    }

    /**
     * Sets the value of the htmlShortUrl property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setHtmlShortUrl(String value) {
        this.htmlShortUrl = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *     {@link BigInteger }
     *
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the permalink property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * Sets the value of the permalink property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setPermalink(String value) {
        this.permalink = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the longTitle property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getLongTitle() {
        return longTitle;
    }

    /**
     * Sets the value of the longTitle property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setLongTitle(String value) {
        this.longTitle = value;
    }

    /**
     * Gets the value of the shortTitle property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * Sets the value of the shortTitle property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setShortTitle(String value) {
        this.shortTitle = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the longDescription property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the showMan property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getShowMan() {
        return showMan;
    }

    /**
     * Sets the value of the showMan property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setShowMan(String value) {
        this.showMan = value;
    }

    /**
     * Gets the value of the director property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the emission property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getEmission() {
        return emission;
    }

    /**
     * Sets the value of the emission property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setEmission(String value) {
        this.emission = value;
    }

    /**
     * Gets the value of the thumbnail property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setThumbnail(String value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the logo property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the outOfEmission property.
     *
     */
    public boolean isOutOfEmission() {
        return outOfEmission;
    }

    /**
     * Sets the value of the outOfEmission property.
     *
     */
    public void setOutOfEmission(boolean value) {
        this.outOfEmission = value;
    }

    /**
     * Gets the value of the channel property.
     *
     * @return possible object is
     *     {@link Channel }
     *
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value allowed object is
     *     {@link Channel }
     *
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the fanBoxID property.
     *
     * @return possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getFanBoxID() {
        return fanBoxID;
    }

    /**
     * Sets the value of the fanBoxID property.
     *
     * @param value allowed object is
     *     {@link BigInteger }
     *
     */
    public void setFanBoxID(BigInteger value) {
        this.fanBoxID = value;
    }

    /**
     * Gets the value of the seccionesRef property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getSeccionesRef() {
        return seccionesRef;
    }

    /**
     * Sets the value of the seccionesRef property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setSeccionesRef(String value) {
        this.seccionesRef = value;
    }

    /**
     * Gets the value of the temporadasRef property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getTemporadasRef() {
        return temporadasRef;
    }

    /**
     * Sets the value of the temporadasRef property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setTemporadasRef(String value) {
        this.temporadasRef = value;
    }

    /**
     * Gets the value of the agrupadoresRef property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getAgrupadoresRef() {
        return agrupadoresRef;
    }

    /**
     * Sets the value of the agrupadoresRef property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setAgrupadoresRef(String value) {
        this.agrupadoresRef = value;
    }

    @Override
    public int compareTo(ProgramDTO p) {
        return this.getName().compareToIgnoreCase(p.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProgramDTO)) {
            return false;
        }
        ProgramDTO program = (ProgramDTO) o;
        return uri.equals(program.getUri()) && uid.equals(program.getUid()) && name.equals(program.getName())
                && longTitle.equals(program.getLongTitle()) && shortTitle.equals(program.getShortTitle());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.uri != null ? this.uri.hashCode() : 0);
        hash = 29 * hash + (this.uid != null ? this.uid.hashCode() : 0);
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + (this.longTitle != null ? this.longTitle.hashCode() : 0);
        hash = 29 * hash + (this.shortTitle != null ? this.shortTitle.hashCode() : 0);
        return hash;
    }
}
