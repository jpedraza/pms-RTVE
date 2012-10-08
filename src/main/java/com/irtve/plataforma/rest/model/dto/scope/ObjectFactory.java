package com.irtve.plataforma.rest.model.dto.scope;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.irtve.plataforma.rest.model.dto.scope
 * package. <p>An ObjectFactory allows you to programatically construct new
 * instances of the Java representation for XML content. The Java representation
 * of XML content can consist of schema derived interfaces and classes
 * representing the binding of schema type definitions, element declarations and
 * model groups. Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Uid_QNAME = new QName("", "uid");
    private final static QName _AudiosRef_QNAME = new QName("", "audiosRef");
    private final static QName _VideosPopularesRef_QNAME = new QName("", "videosPopularesRef");
    private final static QName _HtmlShortUrl_QNAME = new QName("", "htmlShortUrl");
    private final static QName _AgrupadoresRef_QNAME = new QName("", "agrupadoresRef");
    private final static QName _DirectosProximosRef_QNAME = new QName("", "directosProximosRef");
    private final static QName _CadenasRef_QNAME = new QName("", "cadenasRef");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _VideosVistosRef_QNAME = new QName("", "videosVistosRef");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _HtmlUrl_QNAME = new QName("", "htmlUrl");
    private final static QName _ProgramasRef_QNAME = new QName("", "programasRef");
    private final static QName _DirectosTodosProximosRef_QNAME = new QName("", "directosTodosProximosRef");
    private final static QName _MultimediasPopularesRef_QNAME = new QName("", "multimediasPopularesRef");
    private final static QName _DirectosTodosAhoraRef_QNAME = new QName("", "directosTodosAhoraRef");
    private final static QName _DirectosAhoraRef_QNAME = new QName("", "directosAhoraRef");
    private final static QName _MultimediasVistosRef_QNAME = new QName("", "multimediasVistosRef");
    private final static QName _AudiosVistosRef_QNAME = new QName("", "audiosVistosRef");
    private final static QName _Uri_QNAME = new QName("", "uri");
    private final static QName _MultimediasRef_QNAME = new QName("", "multimediasRef");
    private final static QName _Permalink_QNAME = new QName("", "permalink");
    private final static QName _DirectosEnvivoProximosRef_QNAME = new QName("", "directosEnvivoProximosRef");
    private final static QName _AudiosPopularesRef_QNAME = new QName("", "audiosPopularesRef");
    private final static QName _VideosRef_QNAME = new QName("", "videosRef");
    private final static QName _DirectosEnvivoAhoraRef_QNAME = new QName("", "directosEnvivoAhoraRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.irtve.plataforma.rest.model.dto.scope
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MedioDTO }
     *
     */
    public MedioDTO createMedioDTO() {
        return new MedioDTO();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "uid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "videosPopularesRef")
    public JAXBElement<String> createVideosPopularesRef(String value) {
        return new JAXBElement<String>(_VideosPopularesRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "agrupadoresRef")
    public JAXBElement<String> createAgrupadoresRef(String value) {
        return new JAXBElement<String>(_AgrupadoresRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "directosProximosRef")
    public JAXBElement<String> createDirectosProximosRef(String value) {
        return new JAXBElement<String>(_DirectosProximosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "cadenasRef")
    public JAXBElement<String> createCadenasRef(String value) {
        return new JAXBElement<String>(_CadenasRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "videosVistosRef")
    public JAXBElement<String> createVideosVistosRef(String value) {
        return new JAXBElement<String>(_VideosVistosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "title")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "programasRef")
    public JAXBElement<String> createProgramasRef(String value) {
        return new JAXBElement<String>(_ProgramasRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "directosTodosProximosRef")
    public JAXBElement<String> createDirectosTodosProximosRef(String value) {
        return new JAXBElement<String>(_DirectosTodosProximosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "multimediasPopularesRef")
    public JAXBElement<String> createMultimediasPopularesRef(String value) {
        return new JAXBElement<String>(_MultimediasPopularesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "directosTodosAhoraRef")
    public JAXBElement<String> createDirectosTodosAhoraRef(String value) {
        return new JAXBElement<String>(_DirectosTodosAhoraRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "directosAhoraRef")
    public JAXBElement<String> createDirectosAhoraRef(String value) {
        return new JAXBElement<String>(_DirectosAhoraRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "multimediasVistosRef")
    public JAXBElement<String> createMultimediasVistosRef(String value) {
        return new JAXBElement<String>(_MultimediasVistosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "audiosVistosRef")
    public JAXBElement<String> createAudiosVistosRef(String value) {
        return new JAXBElement<String>(_AudiosVistosRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "permalink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPermalink(String value) {
        return new JAXBElement<String>(_Permalink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "directosEnvivoProximosRef")
    public JAXBElement<String> createDirectosEnvivoProximosRef(String value) {
        return new JAXBElement<String>(_DirectosEnvivoProximosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "audiosPopularesRef")
    public JAXBElement<String> createAudiosPopularesRef(String value) {
        return new JAXBElement<String>(_AudiosPopularesRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "directosEnvivoAhoraRef")
    public JAXBElement<String> createDirectosEnvivoAhoraRef(String value) {
        return new JAXBElement<String>(_DirectosEnvivoAhoraRef_QNAME, String.class, null, value);
    }
}
