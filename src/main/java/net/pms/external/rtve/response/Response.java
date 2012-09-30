package net.pms.external.rtve.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}url" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GMTDisabled" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GMTEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="geolocalizado" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "url"
})
@XmlRootElement(name = "response")
public class Response {

    @XmlElement(required = true)
    protected List<Url> url;
    @XmlAttribute(name = "GMTDisabled", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String gmtDisabled;
    @XmlAttribute(name = "GMTEnabled", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String gmtEnabled;
    @XmlAttribute(name = "code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String code;
    @XmlAttribute(name = "geolocalizado", required = true)
    protected boolean geolocalizado;

    /**
     * Gets the value of the url property.
     *
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the url property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link Url }
     *
     *
     */
    public List<Url> getUrl() {
        if (url == null) {
            url = new ArrayList<Url>();
        }
        return this.url;
    }

    /**
     * Gets the value of the gmtDisabled property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGMTDisabled() {
        return gmtDisabled;
    }

    /**
     * Sets the value of the gmtDisabled property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGMTDisabled(String value) {
        this.gmtDisabled = value;
    }

    /**
     * Gets the value of the gmtEnabled property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGMTEnabled() {
        return gmtEnabled;
    }

    /**
     * Sets the value of the gmtEnabled property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGMTEnabled(String value) {
        this.gmtEnabled = value;
    }

    /**
     * Gets the value of the code property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the geolocalizado property.
     *
     */
    public boolean isGeolocalizado() {
        return geolocalizado;
    }

    /**
     * Sets the value of the geolocalizado property.
     *
     */
    public void setGeolocalizado(boolean value) {
        this.geolocalizado = value;
    }
}
