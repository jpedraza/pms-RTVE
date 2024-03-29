package com.irtve.plataforma.rest.model.dto.topic;

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
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}uid"/>
 *         &lt;element ref="{}title"/>
 *         &lt;element ref="{}parentRef"/>
 *         &lt;element ref="{}childrenRef"/>
 *         &lt;element ref="{}descendantsRef"/>
 *         &lt;element ref="{}permalink"/>
 *         &lt;element ref="{}videosRef"/>
 *         &lt;element ref="{}audiosRef"/>
 *         &lt;element ref="{}multimediasRef"/>
 *         &lt;element ref="{}multimediasVistosRef"/>
 *         &lt;element ref="{}videosVistosRef"/>
 *         &lt;element ref="{}audiosVistosRef"/>
 *         &lt;element ref="{}multimediasPopularesRef"/>
 *         &lt;element ref="{}videosPopularesRef"/>
 *         &lt;element ref="{}audiosPopularesRef"/>
 *         &lt;element ref="{}noticiasRef"/>
 *         &lt;element ref="{}noticiasTickerRef"/>
 *         &lt;element ref="{}noticiasTickerNoticiasRef"/>
 *         &lt;element ref="{}noticiasTickerDeportesRef"/>
 *         &lt;element ref="{}noticiasVistasRef"/>
 *         &lt;element ref="{}noticiasPopularesRef"/>
 *         &lt;element ref="{}publicidadRef"/>
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
    "id",
    "uid",
    "title",
    "parentRef",
    "childrenRef",
    "descendantsRef",
    "permalink",
    "videosRef",
    "audiosRef",
    "multimediasRef",
    "multimediasVistosRef",
    "videosVistosRef",
    "audiosVistosRef",
    "multimediasPopularesRef",
    "videosPopularesRef",
    "audiosPopularesRef",
    "noticiasRef",
    "noticiasTickerRef",
    "noticiasTickerNoticiasRef",
    "noticiasTickerDeportesRef",
    "noticiasVistasRef",
    "noticiasPopularesRef",
    "publicidadRef"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.topic.TopicDTO")
public class TopicDTO implements Comparable<TopicDTO> {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String uid;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String parentRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String childrenRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String descendantsRef;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String permalink;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String videosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audiosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String multimediasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String multimediasVistosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String videosVistosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audiosVistosRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String multimediasPopularesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String videosPopularesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audiosPopularesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noticiasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noticiasTickerRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noticiasTickerNoticiasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noticiasTickerDeportesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noticiasVistasRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String noticiasPopularesRef;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String publicidadRef;

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
     * Gets the value of the uid property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the parentRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setParentRef(String value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the childrenRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getChildrenRef() {
        return childrenRef;
    }

    /**
     * Sets the value of the childrenRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setChildrenRef(String value) {
        this.childrenRef = value;
    }

    /**
     * Gets the value of the descendantsRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescendantsRef() {
        return descendantsRef;
    }

    /**
     * Sets the value of the descendantsRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescendantsRef(String value) {
        this.descendantsRef = value;
    }

    /**
     * Gets the value of the permalink property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * Sets the value of the permalink property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPermalink(String value) {
        this.permalink = value;
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

    /**
     * Gets the value of the multimediasVistosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMultimediasVistosRef() {
        return multimediasVistosRef;
    }

    /**
     * Sets the value of the multimediasVistosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMultimediasVistosRef(String value) {
        this.multimediasVistosRef = value;
    }

    /**
     * Gets the value of the videosVistosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVideosVistosRef() {
        return videosVistosRef;
    }

    /**
     * Sets the value of the videosVistosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVideosVistosRef(String value) {
        this.videosVistosRef = value;
    }

    /**
     * Gets the value of the audiosVistosRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAudiosVistosRef() {
        return audiosVistosRef;
    }

    /**
     * Sets the value of the audiosVistosRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAudiosVistosRef(String value) {
        this.audiosVistosRef = value;
    }

    /**
     * Gets the value of the multimediasPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMultimediasPopularesRef() {
        return multimediasPopularesRef;
    }

    /**
     * Sets the value of the multimediasPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMultimediasPopularesRef(String value) {
        this.multimediasPopularesRef = value;
    }

    /**
     * Gets the value of the videosPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getVideosPopularesRef() {
        return videosPopularesRef;
    }

    /**
     * Sets the value of the videosPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setVideosPopularesRef(String value) {
        this.videosPopularesRef = value;
    }

    /**
     * Gets the value of the audiosPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAudiosPopularesRef() {
        return audiosPopularesRef;
    }

    /**
     * Sets the value of the audiosPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAudiosPopularesRef(String value) {
        this.audiosPopularesRef = value;
    }

    /**
     * Gets the value of the noticiasRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNoticiasRef() {
        return noticiasRef;
    }

    /**
     * Sets the value of the noticiasRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNoticiasRef(String value) {
        this.noticiasRef = value;
    }

    /**
     * Gets the value of the noticiasTickerRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNoticiasTickerRef() {
        return noticiasTickerRef;
    }

    /**
     * Sets the value of the noticiasTickerRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNoticiasTickerRef(String value) {
        this.noticiasTickerRef = value;
    }

    /**
     * Gets the value of the noticiasTickerNoticiasRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNoticiasTickerNoticiasRef() {
        return noticiasTickerNoticiasRef;
    }

    /**
     * Sets the value of the noticiasTickerNoticiasRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNoticiasTickerNoticiasRef(String value) {
        this.noticiasTickerNoticiasRef = value;
    }

    /**
     * Gets the value of the noticiasTickerDeportesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNoticiasTickerDeportesRef() {
        return noticiasTickerDeportesRef;
    }

    /**
     * Sets the value of the noticiasTickerDeportesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNoticiasTickerDeportesRef(String value) {
        this.noticiasTickerDeportesRef = value;
    }

    /**
     * Gets the value of the noticiasVistasRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNoticiasVistasRef() {
        return noticiasVistasRef;
    }

    /**
     * Sets the value of the noticiasVistasRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNoticiasVistasRef(String value) {
        this.noticiasVistasRef = value;
    }

    /**
     * Gets the value of the noticiasPopularesRef property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNoticiasPopularesRef() {
        return noticiasPopularesRef;
    }

    /**
     * Sets the value of the noticiasPopularesRef property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNoticiasPopularesRef(String value) {
        this.noticiasPopularesRef = value;
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

    @Override
    public int compareTo(TopicDTO t) {
        return this.getTitle().compareToIgnoreCase(t.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopicDTO)) {
            return false;
        }
        TopicDTO topic = (TopicDTO) o;
        return uri.equals(topic.getUri())
                && uid.equals(topic.getUid())
                && title.equals(topic.getTitle());
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
