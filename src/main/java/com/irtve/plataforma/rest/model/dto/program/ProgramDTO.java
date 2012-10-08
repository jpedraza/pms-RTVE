package com.irtve.plataforma.rest.model.dto.program;

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
 *         &lt;element ref="{}htmlUrl"/>
 *         &lt;element ref="{}htmlShortUrl"/>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}uid"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}permalink"/>
 *         &lt;element ref="{}language"/>
 *         &lt;element ref="{}longTitle"/>
 *         &lt;element ref="{}shortTitle"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}emission"/>
 *         &lt;element ref="{}orden"/>
 *         &lt;element ref="{}thumbnail"/>
 *         &lt;element ref="{}logo"/>
 *         &lt;element ref="{}imgPoster"/>
 *         &lt;element ref="{}outOfEmission"/>
 *         &lt;element ref="{}channel"/>
 *         &lt;element ref="{}ageRangeUid"/>
 *         &lt;element ref="{}ageRange"/>
 *         &lt;element ref="{}seccionesRef"/>
 *         &lt;element ref="{}temporadasRef"/>
 *         &lt;element ref="{}agrupadoresRef"/>
 *         &lt;element ref="{}videosRef"/>
 *         &lt;element ref="{}audiosRef"/>
 *         &lt;element ref="{}multimediasRef"/>
 *         &lt;element ref="{}relacionadosRef"/>
 *         &lt;element ref="{}otherChannelsRef"/>
 *         &lt;element ref="{}webRtve"/>
 *         &lt;element ref="{}webOficial"/>
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
    "emission",
    "orden",
    "thumbnail",
    "logo",
    "imgPoster",
    "outOfEmission",
    "channel",
    "ageRangeUid",
    "ageRange",
    "seccionesRef",
    "temporadasRef",
    "agrupadoresRef",
    "videosRef",
    "audiosRef",
    "multimediasRef",
    "relacionadosRef",
    "otherChannelsRef",
    "webRtve",
    "webOficial"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.program.ProgramDTO")
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
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String uid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String permalink;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String language;
    @XmlElement(required = true)
    protected String longTitle;
    @XmlElement(required = true)
    protected String shortTitle;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String emission;
    @XmlElement(required = true)
    protected BigInteger orden;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String thumbnail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String logo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imgPoster;
    protected boolean outOfEmission;
    @XmlElement(required = true)
    protected Channel channel;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String ageRangeUid;
    @XmlElement(required = true)
    protected String ageRange;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String seccionesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String temporadasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String agrupadoresRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String videosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audiosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String multimediasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String relacionadosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String otherChannelsRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String webRtve;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String webOficial;

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
     * Gets the value of the uid property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the permalink property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * Sets the value of the permalink property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPermalink(String value) {
        this.permalink = value;
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
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the emission property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEmission() {
        return emission;
    }

    /**
     * Sets the value of the emission property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEmission(String value) {
        this.emission = value;
    }

    /**
     * Gets the value of the orden property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getOrden() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setOrden(BigInteger value) {
        this.orden = value;
    }

    /**
     * Gets the value of the thumbnail property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setThumbnail(String value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the logo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the imgPoster property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getImgPoster() {
        return imgPoster;
    }

    /**
     * Sets the value of the imgPoster property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setImgPoster(String value) {
        this.imgPoster = value;
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
     * @return possible object is {@link Channel }
     *
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value allowed object is {@link Channel }
     *
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the ageRangeUid property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAgeRangeUid() {
        return ageRangeUid;
    }

    /**
     * Sets the value of the ageRangeUid property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAgeRangeUid(String value) {
        this.ageRangeUid = value;
    }

    /**
     * Gets the value of the ageRange property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAgeRange() {
        return ageRange;
    }

    /**
     * Sets the value of the ageRange property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAgeRange(String value) {
        this.ageRange = value;
    }

    /**
     * Gets the value of the seccionesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSeccionesRef() {
        return seccionesRef;
    }

    /**
     * Sets the value of the seccionesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSeccionesRef(String value) {
        this.seccionesRef = value;
    }

    /**
     * Gets the value of the temporadasRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTemporadasRef() {
        return temporadasRef;
    }

    /**
     * Sets the value of the temporadasRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTemporadasRef(String value) {
        this.temporadasRef = value;
    }

    /**
     * Gets the value of the agrupadoresRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAgrupadoresRef() {
        return agrupadoresRef;
    }

    /**
     * Sets the value of the agrupadoresRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAgrupadoresRef(String value) {
        this.agrupadoresRef = value;
    }

    /**
     * Gets the value of the videosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVideosRef() {
        return videosRef;
    }

    /**
     * Sets the value of the videosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVideosRef(String value) {
        this.videosRef = value;
    }

    /**
     * Gets the value of the audiosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAudiosRef() {
        return audiosRef;
    }

    /**
     * Sets the value of the audiosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAudiosRef(String value) {
        this.audiosRef = value;
    }

    /**
     * Gets the value of the multimediasRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMultimediasRef() {
        return multimediasRef;
    }

    /**
     * Sets the value of the multimediasRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMultimediasRef(String value) {
        this.multimediasRef = value;
    }

    /**
     * Gets the value of the relacionadosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRelacionadosRef() {
        return relacionadosRef;
    }

    /**
     * Sets the value of the relacionadosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRelacionadosRef(String value) {
        this.relacionadosRef = value;
    }

    /**
     * Gets the value of the otherChannelsRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOtherChannelsRef() {
        return otherChannelsRef;
    }

    /**
     * Sets the value of the otherChannelsRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOtherChannelsRef(String value) {
        this.otherChannelsRef = value;
    }

    /**
     * Gets the value of the webRtve property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getWebRtve() {
        return webRtve;
    }

    /**
     * Sets the value of the webRtve property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setWebRtve(String value) {
        this.webRtve = value;
    }

    /**
     * Gets the value of the webOficial property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getWebOficial() {
        return webOficial;
    }

    /**
     * Sets the value of the webOficial property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setWebOficial(String value) {
        this.webOficial = value;
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
        return uri.equals(program.getUri())
                && uid.equals(program.getUid())
                && name.equals(program.getName())
                && longTitle.equals(program.getLongTitle())
                && shortTitle.equals(program.getShortTitle());
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
