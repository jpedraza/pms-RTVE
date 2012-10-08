package com.irtve.plataforma.rest.model.dto.live;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.irtve.plataforma.rest.model.dto.live
 * package. <p>An ObjectFactory allows you to programatically construct new
 * instances of the Java representation for XML content. The Java representation
 * of XML content can consist of schema derived interfaces and classes
 * representing the binding of schema type definitions, element declarations and
 * model groups. Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StartDate_QNAME = new QName("", "startDate");
    private final static QName _HtmlShortUrl_QNAME = new QName("", "htmlShortUrl");
    private final static QName _ExpirationDate_QNAME = new QName("", "expirationDate");
    private final static QName _IphoneUrl_QNAME = new QName("", "iphoneUrl");
    private final static QName _Image_QNAME = new QName("", "image");
    private final static QName _EndDate_QNAME = new QName("", "endDate");
    private final static QName _Code_QNAME = new QName("", "code");
    private final static QName _Uri_QNAME = new QName("", "uri");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _HtmlUrl_QNAME = new QName("", "htmlUrl");
    private final static QName _ShortTitle_QNAME = new QName("", "shortTitle");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _ProgramRef_QNAME = new QName("", "programRef");
    private final static QName _LongTitle_QNAME = new QName("", "longTitle");
    private final static QName _MainCategoryRef_QNAME = new QName("", "mainCategoryRef");
    private final static QName _LiveUrl_QNAME = new QName("", "liveUrl");
    private final static QName _Language_QNAME = new QName("", "language");
    private final static QName _ChannelRef_QNAME = new QName("", "channelRef");
    private final static QName _InfoUrl_QNAME = new QName("", "infoUrl");
    private final static QName _Outstanding_QNAME = new QName("", "outstanding");
    private final static QName _PublicationDate_QNAME = new QName("", "publicationDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.irtve.plataforma.rest.model.dto.live
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DirectoDTO }
     *
     */
    public DirectoDTO createDirectoDTO() {
        return new DirectoDTO();
    }

    /**
     * Create an instance of {@link PubState }
     *
     */
    public PubState createPubState() {
        return new PubState();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "startDate")
    public JAXBElement<String> createStartDate(String value) {
        return new JAXBElement<String>(_StartDate_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "expirationDate")
    public JAXBElement<String> createExpirationDate(String value) {
        return new JAXBElement<String>(_ExpirationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "iphoneUrl")
    public JAXBElement<String> createIphoneUrl(String value) {
        return new JAXBElement<String>(_IphoneUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "image")
    public JAXBElement<String> createImage(String value) {
        return new JAXBElement<String>(_Image_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "endDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "htmlUrl")
    public JAXBElement<String> createHtmlUrl(String value) {
        return new JAXBElement<String>(_HtmlUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "shortTitle")
    public JAXBElement<String> createShortTitle(String value) {
        return new JAXBElement<String>(_ShortTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "description")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "programRef")
    public JAXBElement<String> createProgramRef(String value) {
        return new JAXBElement<String>(_ProgramRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "longTitle")
    public JAXBElement<String> createLongTitle(String value) {
        return new JAXBElement<String>(_LongTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "mainCategoryRef")
    public JAXBElement<String> createMainCategoryRef(String value) {
        return new JAXBElement<String>(_MainCategoryRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "liveUrl")
    public JAXBElement<String> createLiveUrl(String value) {
        return new JAXBElement<String>(_LiveUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "channelRef")
    public JAXBElement<String> createChannelRef(String value) {
        return new JAXBElement<String>(_ChannelRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "infoUrl")
    public JAXBElement<String> createInfoUrl(String value) {
        return new JAXBElement<String>(_InfoUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "outstanding")
    public JAXBElement<Boolean> createOutstanding(Boolean value) {
        return new JAXBElement<Boolean>(_Outstanding_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "publicationDate")
    public JAXBElement<String> createPublicationDate(String value) {
        return new JAXBElement<String>(_PublicationDate_QNAME, String.class, null, value);
    }
}
