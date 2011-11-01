package com.irtve.plataforma.rest.model.dto;

import com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO;
import com.irtve.plataforma.rest.model.dto.channel.CadenaDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;
import com.irtve.plataforma.rest.model.dto.scope.MedioDTO;
import com.irtve.plataforma.rest.model.dto.topic.TopicDTO;
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
 *       &lt;choice>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.program.section.SectionDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.program.ProgramDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.channel.CadenaDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.scope.MedioDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO" maxOccurs="unbounded"/>
 *         &lt;element ref="{}com.irtve.plataforma.rest.model.dto.topic.TopicDTO" maxOccurs="unbounded"/>
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
    "Sections",
    "Videos",
    "Programs",
    "Seasons",
    "Cadenas",
    "Medios",
    "Agrupadores",
    "Topics"
})
@XmlRootElement(name = "items")
public class Items {

    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.program.section.SectionDTO")
    protected List<SectionDTO> Sections;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO")
    protected List<VideoDTO> Videos;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.program.ProgramDTO")
    protected List<ProgramDTO> Programs;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO")
    protected List<SeasonDTO> Seasons;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.channel.CadenaDTO")
    protected List<CadenaDTO> Cadenas;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.scope.MedioDTO")
    protected List<MedioDTO> Medios;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO")
    protected List<AgrupadorDTO> Agrupadores;
    @XmlElement(name = "com.irtve.plataforma.rest.model.dto.topic.TopicDTO")
    protected List<TopicDTO> Topics;

    /**
     * Gets the value of the Sections property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Sections property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Section }
     *
     *
     */
    public List<SectionDTO> getSections() {
        if (Sections == null) {
            Sections = new ArrayList<SectionDTO>();
        }
        return this.Sections;
    }

    /**
     * Gets the value of the Videos property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Videos property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getVideos().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Video }
     *
     *
     */
    public List<VideoDTO> getVideos() {
        if (Videos == null) {
            Videos = new ArrayList<VideoDTO>();
        }
        return this.Videos;
    }

    /**
     * Gets the value of the Programs property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Programs property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getPrograms().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Program }
     *
     *
     */
    public List<ProgramDTO> getPrograms() {
        if (Programs == null) {
            Programs = new ArrayList<ProgramDTO>();
        }
        return this.Programs;
    }

    /**
     * Gets the value of the Seasons property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Seasons property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSeasons().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Season }
     *
     *
     */
    public List<SeasonDTO> getSeasons() {
        if (Seasons == null) {
            Seasons = new ArrayList<SeasonDTO>();
        }
        return this.Seasons;
    }

    /**
     * Gets the value of the Cadenas property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Cadenas property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getCadenas().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Cadena }
     *
     *
     */
    public List<CadenaDTO> getCadenas() {
        if (Cadenas == null) {
            Cadenas = new ArrayList<CadenaDTO>();
        }
        return this.Cadenas;
    }

    /**
     * Gets the value of the Medios property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Medios property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getMedios().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Medio }
     *
     *
     */
    public List<MedioDTO> getMedios() {
        if (Medios == null) {
            Medios = new ArrayList<MedioDTO>();
        }
        return this.Medios;
    }

    /**
     * Gets the value of the Agrupadores property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Agrupadores property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getAgrupadores().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Agrupador }
     *
     *
     */
    public List<AgrupadorDTO> getAgrupadores() {
        if (Agrupadores == null) {
            Agrupadores = new ArrayList<AgrupadorDTO>();
        }
        return this.Agrupadores;
    }

    /**
     * Gets the value of the Topics property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the Topics property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getTopics().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list
     * {@link Topic }
     *
     *
     */
    public List<TopicDTO> getTopics() {
        if (Topics == null) {
            Topics = new ArrayList<TopicDTO>();
        }
        return this.Topics;
    }
}
