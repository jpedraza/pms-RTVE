package com.irtve.plataforma.rest.model.dto.advertising;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.irtve.plataforma.rest.model.dto.advertising package. <p>An ObjectFactory
 * allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can
 * consist of schema derived interfaces and classes representing the binding of
 * schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Duration_QNAME = new QName("", "duration");
    private final static QName _Interval_QNAME = new QName("", "interval");
    private final static QName _Start_QNAME = new QName("", "start");
    private final static QName _Provider_QNAME = new QName("", "provider");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Url_QNAME = new QName("", "url");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.irtve.plataforma.rest.model.dto.advertising
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdvertisingDTO }
     *
     */
    public AdvertisingDTO createAdvertisingDTO() {
        return new AdvertisingDTO();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "duration")
    public JAXBElement<BigInteger> createDuration(BigInteger value) {
        return new JAXBElement<BigInteger>(_Duration_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "interval")
    public JAXBElement<BigInteger> createInterval(BigInteger value) {
        return new JAXBElement<BigInteger>(_Interval_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "start")
    public JAXBElement<BigInteger> createStart(BigInteger value) {
        return new JAXBElement<BigInteger>(_Start_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "provider")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProvider(String value) {
        return new JAXBElement<String>(_Provider_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }
}
