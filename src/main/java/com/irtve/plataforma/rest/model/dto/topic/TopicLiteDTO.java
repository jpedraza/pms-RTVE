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
    "descendantsRef"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.topic.TopicLiteDTO")
public class TopicLiteDTO implements Comparable<TopicLiteDTO> {

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

    @Override
    public int compareTo(TopicLiteDTO t) {
        return this.getTitle().compareToIgnoreCase(t.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopicLiteDTO)) {
            return false;
        }
        TopicLiteDTO topic = (TopicLiteDTO) o;
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
