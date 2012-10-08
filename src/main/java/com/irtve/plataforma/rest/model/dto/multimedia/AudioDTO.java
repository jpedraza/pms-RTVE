package com.irtve.plataforma.rest.model.dto.multimedia;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}language"/>
 *         &lt;element ref="{}longTitle"/>
 *         &lt;element ref="{}shortTitle" minOccurs="0"/>
 *         &lt;element ref="{}mainCategoryRef"/>
 *         &lt;element ref="{}popularity"/>
 *         &lt;element ref="{}numVisits"/>
 *         &lt;element ref="{}publicationDate"/>
 *         &lt;element ref="{}pubState"/>
 *         &lt;element ref="{}shortDescription"/>
 *         &lt;element ref="{}description"/>
 *         &lt;element ref="{}otherTopicsRefs"/>
 *         &lt;element ref="{}qualities"/>
 *         &lt;element ref="{}qualitiesRef"/>
 *         &lt;element ref="{}mainTopic"/>
 *         &lt;element ref="{}topicsName"/>
 *         &lt;element ref="{}dateOfEmission"/>
 *         &lt;element ref="{}thumbnail"/>
 *         &lt;element ref="{}cuePointsRef"/>
 *         &lt;element ref="{}configPlayerRef"/>
 *         &lt;element ref="{}transcriptionRef"/>
 *         &lt;element ref="{}temporadasRef"/>
 *         &lt;element ref="{}type" minOccurs="0"/>
 *         &lt;element ref="{}programRef"/>
 *         &lt;element ref="{}relacionadosRef"/>
 *         &lt;element ref="{}relManualesRef"/>
 *         &lt;element ref="{}publicidadRef"/>
 *         &lt;element ref="{}comentariosRef"/>
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
    "language",
    "longTitle",
    "shortTitle",
    "mainCategoryRef",
    "popularity",
    "numVisits",
    "publicationDate",
    "pubState",
    "shortDescription",
    "description",
    "otherTopicsRefs",
    "qualities",
    "qualitiesRef",
    "mainTopic",
    "topicsName",
    "dateOfEmission",
    "thumbnail",
    "cuePointsRef",
    "configPlayerRef",
    "transcriptionRef",
    "temporadasRef",
    "type",
    "programRef",
    "relacionadosRef",
    "relManualesRef",
    "publicidadRef",
    "comentariosRef"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.multimedia.AudioDTO")
public class AudioDTO implements Comparable<AudioDTO> {

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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String language;
    @XmlElement(required = true)
    protected String longTitle;
    protected String shortTitle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String mainCategoryRef;
    @XmlElement(required = true)
    protected BigDecimal popularity;
    @XmlElement(required = true)
    protected BigInteger numVisits;
    @XmlElement(required = true)
    protected String publicationDate;
    @XmlElement(required = true)
    protected PubState pubState;
    @XmlElement(required = true)
    protected String shortDescription;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String otherTopicsRefs;
    @XmlElement(required = true)
    protected Qualities qualities;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String qualitiesRef;
    @XmlElement(required = true)
    protected String mainTopic;
    @XmlElement(required = true)
    protected TopicsName topicsName;
    @XmlElement(required = true)
    protected String dateOfEmission;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String thumbnail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String cuePointsRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String configPlayerRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String transcriptionRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String temporadasRef;
    protected Type type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String programRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String relacionadosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String relManualesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String publicidadRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String comentariosRef;

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
     * Gets the value of the longTitle property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLongTitle() {
        return longTitle;
    }

    /**
     * Sets the value of the longTitle property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLongTitle(String value) {
        this.longTitle = value;
    }

    /**
     * Gets the value of the shortTitle property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * Sets the value of the shortTitle property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setShortTitle(String value) {
        this.shortTitle = value;
    }

    /**
     * Gets the value of the mainCategoryRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMainCategoryRef() {
        return mainCategoryRef;
    }

    /**
     * Sets the value of the mainCategoryRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMainCategoryRef(String value) {
        this.mainCategoryRef = value;
    }

    /**
     * Gets the value of the popularity property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPopularity() {
        return popularity;
    }

    /**
     * Sets the value of the popularity property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPopularity(BigDecimal value) {
        this.popularity = value;
    }

    /**
     * Gets the value of the numVisits property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getNumVisits() {
        return numVisits;
    }

    /**
     * Sets the value of the numVisits property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setNumVisits(BigInteger value) {
        this.numVisits = value;
    }

    /**
     * Gets the value of the publicationDate property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the pubState property.
     *
     * @return possible object is {@link PubState }
     *
     */
    public PubState getPubState() {
        return pubState;
    }

    /**
     * Sets the value of the pubState property.
     *
     * @param value allowed object is {@link PubState }
     *
     */
    public void setPubState(PubState value) {
        this.pubState = value;
    }

    /**
     * Gets the value of the shortDescription property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the otherTopicsRefs property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOtherTopicsRefs() {
        return otherTopicsRefs;
    }

    /**
     * Sets the value of the otherTopicsRefs property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOtherTopicsRefs(String value) {
        this.otherTopicsRefs = value;
    }

    /**
     * Gets the value of the qualities property.
     *
     * @return possible object is {@link Qualities }
     *
     */
    public Qualities getQualities() {
        return qualities;
    }

    /**
     * Sets the value of the qualities property.
     *
     * @param value allowed object is {@link Qualities }
     *
     */
    public void setQualities(Qualities value) {
        this.qualities = value;
    }

    /**
     * Gets the value of the qualitiesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getQualitiesRef() {
        return qualitiesRef;
    }

    /**
     * Sets the value of the qualitiesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setQualitiesRef(String value) {
        this.qualitiesRef = value;
    }

    /**
     * Gets the value of the mainTopic property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMainTopic() {
        return mainTopic;
    }

    /**
     * Sets the value of the mainTopic property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMainTopic(String value) {
        this.mainTopic = value;
    }

    /**
     * Gets the value of the topicsName property.
     *
     * @return possible object is {@link TopicsName }
     *
     */
    public TopicsName getTopicsName() {
        return topicsName;
    }

    /**
     * Sets the value of the topicsName property.
     *
     * @param value allowed object is {@link TopicsName }
     *
     */
    public void setTopicsName(TopicsName value) {
        this.topicsName = value;
    }

    /**
     * Gets the value of the dateOfEmission property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDateOfEmission() {
        return dateOfEmission;
    }

    /**
     * Sets the value of the dateOfEmission property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDateOfEmission(String value) {
        this.dateOfEmission = value;
    }

    /**
     * Gets the value of the thumbnail property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setThumbnail(String value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the cuePointsRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCuePointsRef() {
        return cuePointsRef;
    }

    /**
     * Sets the value of the cuePointsRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCuePointsRef(String value) {
        this.cuePointsRef = value;
    }

    /**
     * Gets the value of the configPlayerRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getConfigPlayerRef() {
        return configPlayerRef;
    }

    /**
     * Sets the value of the configPlayerRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setConfigPlayerRef(String value) {
        this.configPlayerRef = value;
    }

    /**
     * Gets the value of the transcriptionRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTranscriptionRef() {
        return transcriptionRef;
    }

    /**
     * Sets the value of the transcriptionRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTranscriptionRef(String value) {
        this.transcriptionRef = value;
    }

    /**
     * Gets the value of the temporadasRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTemporadasRef() {
        return temporadasRef;
    }

    /**
     * Sets the value of the temporadasRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTemporadasRef(String value) {
        this.temporadasRef = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is {@link Type }
     *
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is {@link Type }
     *
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the programRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getProgramRef() {
        return programRef;
    }

    /**
     * Sets the value of the programRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setProgramRef(String value) {
        this.programRef = value;
    }

    /**
     * Gets the value of the relacionadosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRelacionadosRef() {
        return relacionadosRef;
    }

    /**
     * Sets the value of the relacionadosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRelacionadosRef(String value) {
        this.relacionadosRef = value;
    }

    /**
     * Gets the value of the relManualesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRelManualesRef() {
        return relManualesRef;
    }

    /**
     * Sets the value of the relManualesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRelManualesRef(String value) {
        this.relManualesRef = value;
    }

    /**
     * Gets the value of the publicidadRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPublicidadRef() {
        return publicidadRef;
    }

    /**
     * Sets the value of the publicidadRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPublicidadRef(String value) {
        this.publicidadRef = value;
    }

    /**
     * Gets the value of the comentariosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getComentariosRef() {
        return comentariosRef;
    }

    /**
     * Sets the value of the comentariosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setComentariosRef(String value) {
        this.comentariosRef = value;
    }

    @Override
    public int compareTo(AudioDTO a) {
        return this.getDateOfEmission().compareTo(a.getDateOfEmission());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AudioDTO)) {
            return false;
        }
        AudioDTO audio = (AudioDTO) o;
        return uri.equals(audio.getUri())
                && dateOfEmission.equals(audio.getDateOfEmission())
                && publicationDate.equals(audio.getPublicationDate())
                && longTitle.equals(audio.getLongTitle())
                && shortTitle.equals(audio.getShortTitle());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.uri != null ? this.uri.hashCode() : 0);
        hash = 29 * hash + (this.publicationDate != null ? this.publicationDate.hashCode() : 0);
        hash = 29 * hash + (this.dateOfEmission != null ? this.dateOfEmission.hashCode() : 0);
        hash = 29 * hash + (this.longTitle != null ? this.longTitle.hashCode() : 0);
        hash = 29 * hash + (this.shortTitle != null ? this.shortTitle.hashCode() : 0);
        return hash;
    }
}
