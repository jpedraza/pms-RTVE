package com.irtve.plataforma.rest.model.dto.advertising;

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
 *         &lt;element ref="{}provider"/>
 *         &lt;element ref="{}type"/>
 *         &lt;element ref="{}url"/>
 *         &lt;element ref="{}duration"/>
 *         &lt;element ref="{}start"/>
 *         &lt;element ref="{}interval"/>
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
    "provider",
    "type",
    "url",
    "duration",
    "start",
    "interval"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.advertising.AdvertisingDTO")
public class AdvertisingDTO implements Comparable<AdvertisingDTO> {
    
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String provider;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected BigInteger duration;
    @XmlElement(required = true)
    protected BigInteger start;
    @XmlElement(required = true)
    protected BigInteger interval;

    /**
     * Gets the value of the provider property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the duration property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the start property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the interval property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setInterval(BigInteger value) {
        this.interval = value;
    }
    
    @Override
    public int compareTo(AdvertisingDTO a) {
        return this.getUrl().compareToIgnoreCase(a.getUrl());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdvertisingDTO)) {
            return false;
        }
        AdvertisingDTO advertising = (AdvertisingDTO) o;
        return provider.equals(advertising.getProvider())
                && url.equals(advertising.getUrl())
                && type.equals(advertising.getType());
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.provider != null ? this.provider.hashCode() : 0);
        hash = 29 * hash + (this.url != null ? this.url.hashCode() : 0);
        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;
    }
}
