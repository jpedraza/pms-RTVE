package com.irtve.plataforma.rest.model.dto.channel;

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
 *         &lt;element ref="{}medioRef"/>
 *         &lt;element ref="{}uid"/>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}permalink"/>
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
    "permalink"
})
public class CadenaDTO implements Comparable<CadenaDTO> {

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
    @XmlSchemaType(name = "NMTOKEN")
    protected String permalink;

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
     * Gets the value of the medioRef property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getMedioRef() {
        return medioRef;
    }

    /**
     * Sets the value of the medioRef property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setMedioRef(String value) {
        this.medioRef = value;
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
     * Gets the value of the title property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
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
        return uri.equals(cadena.getUri()) && uid.equals(cadena.getUid()) && title.equals(cadena.getTitle());
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
