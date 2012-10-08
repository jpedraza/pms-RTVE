package com.irtve.plataforma.rest.model.dto.channel;

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
 *         &lt;element ref="{}medioRef"/>
 *         &lt;element ref="{}uid"/>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}permalink"/>
 *         &lt;element ref="{}programsRef"/>
 *         &lt;element ref="{}videosRef"/>
 *         &lt;element ref="{}audiosRef"/>
 *         &lt;element ref="{}multimediasRef"/>
 *         &lt;element ref="{}directosAhoraRef"/>
 *         &lt;element ref="{}directosEnvivoAhoraRef"/>
 *         &lt;element ref="{}directosTodosAhoraRef"/>
 *         &lt;element ref="{}directosProximosRef"/>
 *         &lt;element ref="{}directosEnvivoProximosRef"/>
 *         &lt;element ref="{}directosTodosProximosRef"/>
 *         &lt;element ref="{}agrupadoresRef"/>
 *         &lt;element ref="{}videosVistosRef"/>
 *         &lt;element ref="{}audiosVistosRef"/>
 *         &lt;element ref="{}multimediasVistosRef"/>
 *         &lt;element ref="{}videosPopularesRef"/>
 *         &lt;element ref="{}audiosPopularesRef"/>
 *         &lt;element ref="{}multimediasPopularesRef"/>
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
    "medioRef",
    "uid",
    "title",
    "permalink",
    "programsRef",
    "videosRef",
    "audiosRef",
    "multimediasRef",
    "directosAhoraRef",
    "directosEnvivoAhoraRef",
    "directosTodosAhoraRef",
    "directosProximosRef",
    "directosEnvivoProximosRef",
    "directosTodosProximosRef",
    "agrupadoresRef",
    "videosVistosRef",
    "audiosVistosRef",
    "multimediasVistosRef",
    "videosPopularesRef",
    "audiosPopularesRef",
    "multimediasPopularesRef"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.channel.CadenaDTO")
public class CadenaDTO implements Comparable<CadenaDTO> {
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    protected String htmlUrl;
    @XmlElement(required = true)
    protected String htmlShortUrl;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String medioRef;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String uid;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String permalink;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String programsRef;
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
    protected String directosAhoraRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String directosEnvivoAhoraRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String directosTodosAhoraRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String directosProximosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String directosEnvivoProximosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String directosTodosProximosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String agrupadoresRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String videosVistosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audiosVistosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String multimediasVistosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String videosPopularesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audiosPopularesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String multimediasPopularesRef;

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
     * Gets the value of the medioRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMedioRef() {
        return medioRef;
    }

    /**
     * Sets the value of the medioRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMedioRef(String value) {
        this.medioRef = value;
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
     * Gets the value of the title property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the programsRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProgramsRef() {
        return programsRef;
    }

    /**
     * Sets the value of the programsRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProgramsRef(String value) {
        this.programsRef = value;
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
     * Gets the value of the directosAhoraRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirectosAhoraRef() {
        return directosAhoraRef;
    }

    /**
     * Sets the value of the directosAhoraRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirectosAhoraRef(String value) {
        this.directosAhoraRef = value;
    }

    /**
     * Gets the value of the directosEnvivoAhoraRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirectosEnvivoAhoraRef() {
        return directosEnvivoAhoraRef;
    }

    /**
     * Sets the value of the directosEnvivoAhoraRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirectosEnvivoAhoraRef(String value) {
        this.directosEnvivoAhoraRef = value;
    }

    /**
     * Gets the value of the directosTodosAhoraRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirectosTodosAhoraRef() {
        return directosTodosAhoraRef;
    }

    /**
     * Sets the value of the directosTodosAhoraRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirectosTodosAhoraRef(String value) {
        this.directosTodosAhoraRef = value;
    }

    /**
     * Gets the value of the directosProximosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirectosProximosRef() {
        return directosProximosRef;
    }

    /**
     * Sets the value of the directosProximosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirectosProximosRef(String value) {
        this.directosProximosRef = value;
    }

    /**
     * Gets the value of the directosEnvivoProximosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirectosEnvivoProximosRef() {
        return directosEnvivoProximosRef;
    }

    /**
     * Sets the value of the directosEnvivoProximosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirectosEnvivoProximosRef(String value) {
        this.directosEnvivoProximosRef = value;
    }

    /**
     * Gets the value of the directosTodosProximosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDirectosTodosProximosRef() {
        return directosTodosProximosRef;
    }

    /**
     * Sets the value of the directosTodosProximosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDirectosTodosProximosRef(String value) {
        this.directosTodosProximosRef = value;
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
     * Gets the value of the videosVistosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVideosVistosRef() {
        return videosVistosRef;
    }

    /**
     * Sets the value of the videosVistosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVideosVistosRef(String value) {
        this.videosVistosRef = value;
    }

    /**
     * Gets the value of the audiosVistosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAudiosVistosRef() {
        return audiosVistosRef;
    }

    /**
     * Sets the value of the audiosVistosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAudiosVistosRef(String value) {
        this.audiosVistosRef = value;
    }

    /**
     * Gets the value of the multimediasVistosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMultimediasVistosRef() {
        return multimediasVistosRef;
    }

    /**
     * Sets the value of the multimediasVistosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMultimediasVistosRef(String value) {
        this.multimediasVistosRef = value;
    }

    /**
     * Gets the value of the videosPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVideosPopularesRef() {
        return videosPopularesRef;
    }

    /**
     * Sets the value of the videosPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVideosPopularesRef(String value) {
        this.videosPopularesRef = value;
    }

    /**
     * Gets the value of the audiosPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAudiosPopularesRef() {
        return audiosPopularesRef;
    }

    /**
     * Sets the value of the audiosPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAudiosPopularesRef(String value) {
        this.audiosPopularesRef = value;
    }

    /**
     * Gets the value of the multimediasPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMultimediasPopularesRef() {
        return multimediasPopularesRef;
    }

    /**
     * Sets the value of the multimediasPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMultimediasPopularesRef(String value) {
        this.multimediasPopularesRef = value;
    }
    
    @Override
    public int compareTo(CadenaDTO c) {
        return this.getTitle().compareToIgnoreCase(c.getTitle());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CadenaDTO)) {
            return false;
        }
        CadenaDTO cadena = (CadenaDTO) o;
        return uri.equals(cadena.getUri())
                && uid.equals(cadena.getUid())
                && title.equals(cadena.getTitle());
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.uri != null ? this.uri.hashCode() : 0);
        hash = 29 * hash + (this.uid != null ? this.uid.hashCode() : 0);
        hash = 29 * hash + (this.title != null ? this.title.hashCode() : 0);
        return hash;
    }
}
