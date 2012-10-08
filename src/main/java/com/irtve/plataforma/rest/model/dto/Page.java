package com.irtve.plataforma.rest.model.dto;

import java.math.BigInteger;
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
 *         &lt;element ref="{}items"/>
 *         &lt;element ref="{}number"/>
 *         &lt;element ref="{}size"/>
 *         &lt;element ref="{}offset"/>
 *         &lt;element ref="{}total"/>
 *         &lt;element ref="{}totalPages"/>
 *         &lt;element ref="{}numElements"/>
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
    "items",
    "number",
    "size",
    "offset",
    "total",
    "totalPages",
    "numElements"
})
@XmlRootElement(name = "page")
public class Page {

    @XmlElement(required = true)
    protected Items items;
    @XmlElement(required = true)
    protected BigInteger number;
    @XmlElement(required = true)
    protected BigInteger size;
    @XmlElement(required = true)
    protected BigInteger offset;
    @XmlElement(required = true)
    protected BigInteger total;
    @XmlElement(required = true)
    protected BigInteger totalPages;
    @XmlElement(required = true)
    protected BigInteger numElements;

    /**
     * Gets the value of the items property.
     *
     * @return possible object is {@link Items }
     *
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     *
     * @param value allowed object is {@link Items }
     *
     */
    public void setItems(Items value) {
        this.items = value;
    }

    /**
     * Gets the value of the number property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the size property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the offset property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    /**
     * Gets the value of the total property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    /**
     * Gets the value of the totalPages property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setTotalPages(BigInteger value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the numElements property.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getNumElements() {
        return numElements;
    }

    /**
     * Sets the value of the numElements property.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setNumElements(BigInteger value) {
        this.numElements = value;
    }
}
