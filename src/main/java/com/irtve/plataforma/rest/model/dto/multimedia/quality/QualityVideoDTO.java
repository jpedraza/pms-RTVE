package com.irtve.plataforma.rest.model.dto.multimedia.quality;

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
 *         &lt;element ref="{}identifier"/>
 *         &lt;element ref="{}filePath"/>
 *         &lt;element ref="{}preset"/>
 *         &lt;element ref="{}filesize"/>
 *         &lt;element ref="{}type"/>
 *         &lt;element ref="{}duration"/>
 *         &lt;element ref="{}bitRate"/>
 *         &lt;element ref="{}bitRateUnit"/>
 *         &lt;element ref="{}language"/>
 *         &lt;element ref="{}previewPath" minOccurs="0"/>
 *         &lt;element ref="{}height"/>
 *         &lt;element ref="{}width"/>
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
    "identifier",
    "filePath",
    "preset",
    "filesize",
    "type",
    "duration",
    "bitRate",
    "bitRateUnit",
    "language",
    "previewPath",
    "height",
    "width"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO")
public class QualityVideoDTO implements Comparable<QualityVideoDTO> {

    @XmlElement(required = true)
    protected BigInteger identifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String filePath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String preset;
    @XmlElement(required = true)
    protected BigInteger filesize;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected BigInteger duration;
    @XmlElement(required = true)
    protected BigInteger bitRate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String bitRateUnit;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String language;
    @XmlSchemaType(name = "anyURI")
    protected String previewPath;
    @XmlElement(required = true)
    protected BigInteger height;
    @XmlElement(required = true)
    protected BigInteger width;

    /**
     * Gets the value of the identifier property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setIdentifier(BigInteger value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the filePath property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the preset property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPreset() {
        return preset;
    }

    /**
     * Sets the value of the preset property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPreset(String value) {
        this.preset = value;
    }

    /**
     * Gets the value of the filesize property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getFilesize() {
        return filesize;
    }

    /**
     * Sets the value of the filesize property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setFilesize(BigInteger value) {
        this.filesize = value;
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
     * Gets the value of the bitRate property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setBitRate(BigInteger value) {
        this.bitRate = value;
    }

    /**
     * Gets the value of the bitRateUnit property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBitRateUnit() {
        return bitRateUnit;
    }

    /**
     * Sets the value of the bitRateUnit property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBitRateUnit(String value) {
        this.bitRateUnit = value;
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
     * Gets the value of the previewPath property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPreviewPath() {
        return previewPath;
    }

    /**
     * Sets the value of the previewPath property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPreviewPath(String value) {
        this.previewPath = value;
    }

    /**
     * Gets the value of the height property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    @Override
    public int compareTo(QualityVideoDTO q) {
        return this.getIdentifier().compareTo(q.getIdentifier());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QualityVideoDTO)) {
            return false;
        }
        QualityVideoDTO quality = (QualityVideoDTO) o;
        return identifier.equals(quality.getIdentifier())
                && filePath.equals(quality.getFilePath())
                && filesize.equals(quality.getFilesize());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.identifier != null ? this.identifier.hashCode() : 0);
        hash = 29 * hash + (this.filePath != null ? this.filePath.hashCode() : 0);
        hash = 29 * hash + (this.filesize != null ? this.filesize.hashCode() : 0);
        return hash;
    }
}
