package com.irtve.plataforma.rest.model.dto.programgroup;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}programsRef"/>
 *         &lt;element ref="{}videosRef"/>
 *         &lt;element ref="{}audiosRef"/>
 *         &lt;element ref="{}multimediasRef"/>
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
    "name",
    "programsRef",
    "videosRef",
    "audiosRef",
    "multimediasRef"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.programgroup.AgrProgramaDTO")
public class AgrProgramaDTO implements Comparable<AgrProgramaDTO> {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String htmlUrl;
    @XmlElement(required = true)
    protected String htmlShortUrl;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
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

    @Override
    public int compareTo(AgrProgramaDTO a) {
        return this.getName().compareToIgnoreCase(a.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgrProgramaDTO)) {
            return false;
        }
        AgrProgramaDTO agrAgrupador = (AgrProgramaDTO) o;
        return uri.equals(agrAgrupador.getUri())
                && id.equals(agrAgrupador.getId())
                && name.equals(agrAgrupador.getName());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.uri != null ? this.uri.hashCode() : 0);
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}
