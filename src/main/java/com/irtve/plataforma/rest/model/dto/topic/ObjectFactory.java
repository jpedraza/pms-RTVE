package com.irtve.plataforma.rest.model.dto.topic;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.irtve.plataforma.rest.model.dto.topic
 * package. <p>An ObjectFactory allows you to programatically construct new
 * instances of the Java representation for XML content. The Java representation
 * of XML content can consist of schema derived interfaces and classes
 * representing the binding of schema type definitions, element declarations and
 * model groups. Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NoticiasVistasRef_QNAME = new QName("", "noticiasVistasRef");
    private final static QName _Uid_QNAME = new QName("", "uid");
    private final static QName _ParentRef_QNAME = new QName("", "parentRef");
    private final static QName _AudiosRef_QNAME = new QName("", "audiosRef");
    private final static QName _VideosPopularesRef_QNAME = new QName("", "videosPopularesRef");
    private final static QName _MultimediasVistosRef_QNAME = new QName("", "multimediasVistosRef");
    private final static QName _NoticiasTickerNoticiasRef_QNAME = new QName("", "noticiasTickerNoticiasRef");
    private final static QName _AudiosVistosRef_QNAME = new QName("", "audiosVistosRef");
    private final static QName _NoticiasRef_QNAME = new QName("", "noticiasRef");
    private final static QName _Uri_QNAME = new QName("", "uri");
    private final static QName _DescendantsRef_QNAME = new QName("", "descendantsRef");
    private final static QName _NoticiasTickerRef_QNAME = new QName("", "noticiasTickerRef");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _VideosVistosRef_QNAME = new QName("", "videosVistosRef");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _ChildrenRef_QNAME = new QName("", "childrenRef");
    private final static QName _NoticiasTickerDeportesRef_QNAME = new QName("", "noticiasTickerDeportesRef");
    private final static QName _MultimediasRef_QNAME = new QName("", "multimediasRef");
    private final static QName _Permalink_QNAME = new QName("", "permalink");
    private final static QName _AudiosPopularesRef_QNAME = new QName("", "audiosPopularesRef");
    private final static QName _VideosRef_QNAME = new QName("", "videosRef");
    private final static QName _MultimediasPopularesRef_QNAME = new QName("", "multimediasPopularesRef");
    private final static QName _NoticiasPopularesRef_QNAME = new QName("", "noticiasPopularesRef");
    private final static QName _PublicidadRef_QNAME = new QName("", "publicidadRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.irtve.plataforma.rest.model.dto.topic
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TopicDTO }
     *
     */
    public TopicDTO createTopicDTO() {
        return new TopicDTO();
    }

    /**
     * Create an instance of {@link TopicLiteDTO }
     *
     */
    public TopicLiteDTO createTopicLiteDTO() {
        return new TopicLiteDTO();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "noticiasVistasRef")
    public JAXBElement<String> createNoticiasVistasRef(String value) {
        return new JAXBElement<String>(_NoticiasVistasRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "parentRef")
    public JAXBElement<String> createParentRef(String value) {
        return new JAXBElement<String>(_ParentRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "multimediasVistosRef")
    public JAXBElement<String> createMultimediasVistosRef(String value) {
        return new JAXBElement<String>(_MultimediasVistosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "noticiasTickerNoticiasRef")
    public JAXBElement<String> createNoticiasTickerNoticiasRef(String value) {
        return new JAXBElement<String>(_NoticiasTickerNoticiasRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "noticiasRef")
    public JAXBElement<String> createNoticiasRef(String value) {
        return new JAXBElement<String>(_NoticiasRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "descendantsRef")
    public JAXBElement<String> createDescendantsRef(String value) {
        return new JAXBElement<String>(_DescendantsRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "noticiasTickerRef")
    public JAXBElement<String> createNoticiasTickerRef(String value) {
        return new JAXBElement<String>(_NoticiasTickerRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "childrenRef")
    public JAXBElement<String> createChildrenRef(String value) {
        return new JAXBElement<String>(_ChildrenRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "noticiasTickerDeportesRef")
    public JAXBElement<String> createNoticiasTickerDeportesRef(String value) {
        return new JAXBElement<String>(_NoticiasTickerDeportesRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "multimediasPopularesRef")
    public JAXBElement<String> createMultimediasPopularesRef(String value) {
        return new JAXBElement<String>(_MultimediasPopularesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "noticiasPopularesRef")
    public JAXBElement<String> createNoticiasPopularesRef(String value) {
        return new JAXBElement<String>(_NoticiasPopularesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "publicidadRef")
    public JAXBElement<String> createPublicidadRef(String value) {
        return new JAXBElement<String>(_PublicidadRef_QNAME, String.class, null, value);
    }
}
