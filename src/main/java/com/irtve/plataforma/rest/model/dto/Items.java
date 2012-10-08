package com.irtve.plataforma.rest.model.dto;

import com.irtve.plataforma.rest.model.dto.advertising.AdvertisingDTO;
import com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO;
import com.irtve.plataforma.rest.model.dto.channel.CadenaDTO;
import com.irtve.plataforma.rest.model.dto.live.DirectoDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.AudioDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;
import com.irtve.plataforma.rest.model.dto.programgroup.AgrProgramaDTO;
import com.irtve.plataforma.rest.model.dto.scope.MedioDTO;
import com.irtve.plataforma.rest.model.dto.topic.TopicDTO;
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
 *       &lt;sequence>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.advertising.AdvertisingDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.programgroup.AgrProgramaDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.multimedia.AudioDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.channel.CadenaDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.live.DirectoDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.scope.MedioDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.program.ProgramDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.program.section.SectionDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.topic.TopicDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO" maxOccurs="unbounded"/>
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
    "advertisingDTO",
    "agrProgramaDTO",
    "agrupadorDTO",
    "audioDTO",
    "cadenaDTO",
    "directoDTO",
    "medioDTO",
    "programDTO",
    "seasonDTO",
    "sectionDTO",
    "topicDTO",
    "videoDTO"
})
@XmlRootElement(name = "items")
public class Items {

    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.advertising.AdvertisingDTO", required = true)
    protected List<AdvertisingDTO> advertisingDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.programgroup.AgrProgramaDTO", required = true)
    protected List<AgrProgramaDTO> agrProgramaDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO", required = true)
    protected List<AgrupadorDTO> agrupadorDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.AudioDTO", required = true)
    protected List<AudioDTO> audioDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.channel.CadenaDTO", required = true)
    protected List<CadenaDTO> cadenaDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.live.DirectoDTO", required = true)
    protected List<DirectoDTO> directoDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.scope.MedioDTO", required = true)
    protected List<MedioDTO> medioDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.program.ProgramDTO", required = true)
    protected List<ProgramDTO> programDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO", required = true)
    protected List<SeasonDTO> seasonDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.program.section.SectionDTO", required = true)
    protected List<SectionDTO> sectionDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.topic.TopicDTO", required = true)
    protected List<TopicDTO> topicDTO;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO", required = true)
    protected List<VideoDTO> videoDTO;

    /**
     * Gets the value of the advertisingDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the advertisingDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAdvertisings().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link AdvertisingDTO }
     *
     *
     */
    public List<AdvertisingDTO> getAdvertisings() {
        if (advertisingDTO == null) {
            advertisingDTO = new ArrayList<AdvertisingDTO>();
        }
        return this.advertisingDTO;
    }

    /**
     * Gets the value of the agrProgramaDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the agrProgramaDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAgrProgramas().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link AgrProgramaDTO }
     *
     *
     */
    public List<AgrProgramaDTO> getAgrProgramas() {
        if (agrProgramaDTO == null) {
            agrProgramaDTO = new ArrayList<AgrProgramaDTO>();
        }
        return this.agrProgramaDTO;
    }

    /**
     * Gets the value of the agrupadorDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the agrupadorDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAgrupadores().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link AgrupadorDTO }
     *
     *
     */
    public List<AgrupadorDTO> getAgrupadores() {
        if (agrupadorDTO == null) {
            agrupadorDTO = new ArrayList<AgrupadorDTO>();
        }
        return this.agrupadorDTO;
    }

    /**
     * Gets the value of the audioDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the audioDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAudios().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link AudioDTO }
     *
     *
     */
    public List<AudioDTO> getAudios() {
        if (audioDTO == null) {
            audioDTO = new ArrayList<AudioDTO>();
        }
        return this.audioDTO;
    }

    /**
     * Gets the value of the cadenaDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cadenaDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getCadenas().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link CadenaDTO }
     *
     *
     */
    public List<CadenaDTO> getCadenas() {
        if (cadenaDTO == null) {
            cadenaDTO = new ArrayList<CadenaDTO>();
        }
        return this.cadenaDTO;
    }

    /**
     * Gets the value of the directoDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the directoDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getDirectos().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link DirectoDTO }
     *
     *
     */
    public List<DirectoDTO> getDirectos() {
        if (directoDTO == null) {
            directoDTO = new ArrayList<DirectoDTO>();
        }
        return this.directoDTO;
    }

    /**
     * Gets the value of the medioDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the medioDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getMedios().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link MedioDTO }
     *
     *
     */
    public List<MedioDTO> getMedios() {
        if (medioDTO == null) {
            medioDTO = new ArrayList<MedioDTO>();
        }
        return this.medioDTO;
    }

    /**
     * Gets the value of the programDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the programDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getPrograms().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link ProgramDTO }
     *
     *
     */
    public List<ProgramDTO> getPrograms() {
        if (programDTO == null) {
            programDTO = new ArrayList<ProgramDTO>();
        }
        return this.programDTO;
    }

    /**
     * Gets the value of the seasonDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the seasonDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSeasons().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link SeasonDTO }
     *
     *
     */
    public List<SeasonDTO> getSeasons() {
        if (seasonDTO == null) {
            seasonDTO = new ArrayList<SeasonDTO>();
        }
        return this.seasonDTO;
    }

    /**
     * Gets the value of the sectionDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sectionDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link SectionDTO }
     *
     *
     */
    public List<SectionDTO> getSections() {
        if (sectionDTO == null) {
            sectionDTO = new ArrayList<SectionDTO>();
        }
        return this.sectionDTO;
    }

    /**
     * Gets the value of the topicDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the topicDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getTopics().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link TopicDTO }
     *
     *
     */
    public List<TopicDTO> getTopics() {
        if (topicDTO == null) {
            topicDTO = new ArrayList<TopicDTO>();
        }
        return this.topicDTO;
    }

    /**
     * Gets the value of the videoDTO property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the videoDTO property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getVideos().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link VideoDTO }
     *
     *
     */
    public List<VideoDTO> getVideos() {
        if (videoDTO == null) {
            videoDTO = new ArrayList<VideoDTO>();
        }
        return this.videoDTO;
    }
}
