package com.irtve.plataforma.rest.model.dto.programgroup;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.irtve.plataforma.rest.model.dto.programgroup package. <p>An ObjectFactory
 * allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can
 * consist of schema derived interfaces and classes representing the binding of
 * schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _AudiosRef_QNAME = new QName("", "audiosRef");
    private final static QName _HtmlUrl_QNAME = new QName("", "htmlUrl");
    private final static QName _HtmlShortUrl_QNAME = new QName("", "htmlShortUrl");
    private final static QName _MultimediasRef_QNAME = new QName("", "multimediasRef");
    private final static QName _VideosRef_QNAME = new QName("", "videosRef");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _ProgramsRef_QNAME = new QName("", "programsRef");
    private final static QName _Uri_QNAME = new QName("", "uri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.irtve.plataforma.rest.model.dto.programgroup
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgrProgramaDTO }
     *
     */
    public AgrProgramaDTO createAgrProgramaDTO() {
        return new AgrProgramaDTO();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "id")
    public JAXBElement<BigInteger> createId(BigInteger value) {
        return new JAXBElement<BigInteger>(_Id_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "audiosRef")
    public JAXBElement<String> createAudiosRef(String value) {
        return new JAXBElement<String>(_AudiosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "htmlUrl")
    public JAXBElement<String> createHtmlUrl(String value) {
        return new JAXBElement<String>(_HtmlUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "htmlShortUrl")
    public JAXBElement<String> createHtmlShortUrl(String value) {
        return new JAXBElement<String>(_HtmlShortUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "multimediasRef")
    public JAXBElement<String> createMultimediasRef(String value) {
        return new JAXBElement<String>(_MultimediasRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "videosRef")
    public JAXBElement<String> createVideosRef(String value) {
        return new JAXBElement<String>(_VideosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "programsRef")
    public JAXBElement<String> createProgramsRef(String value) {
        return new JAXBElement<String>(_ProgramsRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }
}
