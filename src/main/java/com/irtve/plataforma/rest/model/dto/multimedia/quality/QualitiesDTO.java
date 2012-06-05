package com.irtve.plataforma.rest.model.dto.multimedia.quality;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

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
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO" maxOccurs="unbounded"/>
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
    "Qualities"
})
@XmlRootElement(name = "qualities")
public class QualitiesDTO {

    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO", required = true)
    protected List<QualityVideoDTO> Qualities;

    /**
     * Gets the value of the Qualities property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Qualities property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getQualities().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link QualityVideo }
     *
     *
     */
    public List<QualityVideoDTO> getQualities() {
        if (Qualities == null) {
            Qualities = new ArrayList<QualityVideoDTO>();
        }
        return this.Qualities;
    }
}
