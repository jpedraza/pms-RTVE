package com.irtve.plataforma.rest.model.dto.multimedia;

import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityAudioDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice>
 *         &lt;element ref="{}QualityAudioDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}QualityVideoDTO" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "qualityAudioDTO",
    "qualityVideoDTO"
})
@XmlRootElement(name = "qualities")
public class Qualities {

    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityAudioDTO")
    protected List<QualityAudioDTO> qualityAudioDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO")
    protected List<QualityVideoDTO> qualityVideoDTO;

    /**
     * Gets the value of the qualityAudioDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the qualityAudioDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getQualityAudios().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link QualityAudioDTO }
     *
     *
     */
    public List<QualityAudioDTO> getQualityAudios() {
        if (qualityAudioDTO == null) {
            qualityAudioDTO = new ArrayList<QualityAudioDTO>();
        }
        return this.qualityAudioDTO;
    }

    /**
     * Gets the value of the qualityVideoDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the qualityVideoDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getQualityVideos().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link QualityVideoDTO }
     *
     *
     */
    public List<QualityVideoDTO> getQualityVideos() {
        if (qualityVideoDTO == null) {
            qualityVideoDTO = new ArrayList<QualityVideoDTO>();
        }
        return this.qualityVideoDTO;
    }
}
