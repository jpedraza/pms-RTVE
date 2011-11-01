package com.irtve.plataforma.rest.model.dto;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for com.irtve.plataforma.rest.model.dto.ViewDTO element
 * declaration.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;element name="com.irtve.plataforma.rest.model.dto.ViewDTO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{}page"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "page"
})
@XmlRootElement(name = "com.irtve.plataforma.rest.model.dto.ViewDTO")
public class ViewDTO {

    @XmlElement(required = true)
    protected Page page;

    /**
     * Gets the value of the page property.
     *
     * @return possible object is
     *     {@link Page }
     *
     */
    public Page getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     *
     * @param value allowed object is
     *     {@link Page }
     *
     */
    public void setPage(Page value) {
        this.page = value;
    }
}
