package com.irtve.plataforma.rest.model.dto.program;

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
    "videosRef",
    "audiosRef",
    "multimediasRef"
})
@XmlRootElement(name = "links")
public class Links {

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
}
