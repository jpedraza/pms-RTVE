

package com.irtve.plataforma.rest.model.dto.program;

import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.irtve.plataforma.rest.model.dto.program package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Uid_QNAME = new QName("", "uid");
    private final static QName _AudiosRef_QNAME = new QName("", "audiosRef");
    private final static QName _VideosPopularesRef_QNAME = new QName("", "videosPopularesRef");
    private final static QName _HtmlShortUrl_QNAME = new QName("", "htmlShortUrl");
    private final static QName _Emission_QNAME = new QName("", "emission");
    private final static QName _AgrupadoresRef_QNAME = new QName("", "agrupadoresRef");
    private final static QName _TemporadasRef_QNAME = new QName("", "temporadasRef");
    private final static QName _WebOficial_QNAME = new QName("", "webOficial");
    private final static QName _DirectosProximosRef_QNAME = new QName("", "directosProximosRef");
    private final static QName _AgeRange_QNAME = new QName("", "ageRange");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _Orden_QNAME = new QName("", "orden");
    private final static QName _VideosVistosRef_QNAME = new QName("", "videosVistosRef");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _HtmlUrl_QNAME = new QName("", "htmlUrl");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _DirectosTodosProximosRef_QNAME = new QName("", "directosTodosProximosRef");
    private final static QName _MultimediasPopularesRef_QNAME = new QName("", "multimediasPopularesRef");
    private final static QName _DirectosTodosAhoraRef_QNAME = new QName("", "directosTodosAhoraRef");
    private final static QName _OutOfEmission_QNAME = new QName("", "outOfEmission");
    private final static QName _DirectosAhoraRef_QNAME = new QName("", "directosAhoraRef");
    private final static QName _WebRtve_QNAME = new QName("", "webRtve");
    private final static QName _Logo_QNAME = new QName("", "logo");
    private final static QName _MultimediasVistosRef_QNAME = new QName("", "multimediasVistosRef");
    private final static QName _AudiosVistosRef_QNAME = new QName("", "audiosVistosRef");
    private final static QName _RelacionadosRef_QNAME = new QName("", "relacionadosRef");
    private final static QName _MedioRef_QNAME = new QName("", "medioRef");
    private final static QName _Uri_QNAME = new QName("", "uri");
    private final static QName _ImgPoster_QNAME = new QName("", "imgPoster");
    private final static QName _Thumbnail_QNAME = new QName("", "thumbnail");
    private final static QName _MultimediasRef_QNAME = new QName("", "multimediasRef");
    private final static QName _DirectosEnvivoProximosRef_QNAME = new QName("", "directosEnvivoProximosRef");
    private final static QName _Permalink_QNAME = new QName("", "permalink");
    private final static QName _AudiosPopularesRef_QNAME = new QName("", "audiosPopularesRef");
    private final static QName _ShortTitle_QNAME = new QName("", "shortTitle");
    private final static QName _VideosRef_QNAME = new QName("", "videosRef");
    private final static QName _SeccionesRef_QNAME = new QName("", "seccionesRef");
    private final static QName _OtherChannelsRef_QNAME = new QName("", "otherChannelsRef");
    private final static QName _LongTitle_QNAME = new QName("", "longTitle");
    private final static QName _ProgramsRef_QNAME = new QName("", "programsRef");
    private final static QName _Language_QNAME = new QName("", "language");
    private final static QName _AgeRangeUid_QNAME = new QName("", "ageRangeUid");
    private final static QName _DirectosEnvivoAhoraRef_QNAME = new QName("", "directosEnvivoAhoraRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.irtve.plataforma.rest.model.dto.program
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramDTO }
     * 
     */
    public ProgramDTO createProgramDTO() {
        return new ProgramDTO();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link SectionDTO }
     * 
     */
    public SectionDTO createSectionDTO() {
        return new SectionDTO();
    }

    /**
     * Create an instance of {@link Links }
     * 
     */
    public Links createLinks() {
        return new Links();
    }

    /**
     * Create an instance of {@link SeasonDTO }
     * 
     */
    public SeasonDTO createSeasonDTO() {
        return new SeasonDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUid(String value) {
        return new JAXBElement<String>(_Uid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "audiosRef")
    public JAXBElement<String> createAudiosRef(String value) {
        return new JAXBElement<String>(_AudiosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "videosPopularesRef")
    public JAXBElement<String> createVideosPopularesRef(String value) {
        return new JAXBElement<String>(_VideosPopularesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "htmlShortUrl")
    public JAXBElement<String> createHtmlShortUrl(String value) {
        return new JAXBElement<String>(_HtmlShortUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "emission")
    public JAXBElement<String> createEmission(String value) {
        return new JAXBElement<String>(_Emission_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agrupadoresRef")
    public JAXBElement<String> createAgrupadoresRef(String value) {
        return new JAXBElement<String>(_AgrupadoresRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "temporadasRef")
    public JAXBElement<String> createTemporadasRef(String value) {
        return new JAXBElement<String>(_TemporadasRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "webOficial")
    public JAXBElement<String> createWebOficial(String value) {
        return new JAXBElement<String>(_WebOficial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directosProximosRef")
    public JAXBElement<String> createDirectosProximosRef(String value) {
        return new JAXBElement<String>(_DirectosProximosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ageRange")
    public JAXBElement<String> createAgeRange(String value) {
        return new JAXBElement<String>(_AgeRange_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id")
    public JAXBElement<BigInteger> createId(BigInteger value) {
        return new JAXBElement<BigInteger>(_Id_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "orden")
    public JAXBElement<BigInteger> createOrden(BigInteger value) {
        return new JAXBElement<BigInteger>(_Orden_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "videosVistosRef")
    public JAXBElement<String> createVideosVistosRef(String value) {
        return new JAXBElement<String>(_VideosVistosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "htmlUrl")
    public JAXBElement<String> createHtmlUrl(String value) {
        return new JAXBElement<String>(_HtmlUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directosTodosProximosRef")
    public JAXBElement<String> createDirectosTodosProximosRef(String value) {
        return new JAXBElement<String>(_DirectosTodosProximosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "multimediasPopularesRef")
    public JAXBElement<String> createMultimediasPopularesRef(String value) {
        return new JAXBElement<String>(_MultimediasPopularesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directosTodosAhoraRef")
    public JAXBElement<String> createDirectosTodosAhoraRef(String value) {
        return new JAXBElement<String>(_DirectosTodosAhoraRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "outOfEmission")
    public JAXBElement<Boolean> createOutOfEmission(Boolean value) {
        return new JAXBElement<Boolean>(_OutOfEmission_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directosAhoraRef")
    public JAXBElement<String> createDirectosAhoraRef(String value) {
        return new JAXBElement<String>(_DirectosAhoraRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "webRtve")
    public JAXBElement<String> createWebRtve(String value) {
        return new JAXBElement<String>(_WebRtve_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "logo")
    public JAXBElement<String> createLogo(String value) {
        return new JAXBElement<String>(_Logo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "multimediasVistosRef")
    public JAXBElement<String> createMultimediasVistosRef(String value) {
        return new JAXBElement<String>(_MultimediasVistosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "audiosVistosRef")
    public JAXBElement<String> createAudiosVistosRef(String value) {
        return new JAXBElement<String>(_AudiosVistosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "relacionadosRef")
    public JAXBElement<String> createRelacionadosRef(String value) {
        return new JAXBElement<String>(_RelacionadosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "medioRef")
    public JAXBElement<String> createMedioRef(String value) {
        return new JAXBElement<String>(_MedioRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "imgPoster")
    public JAXBElement<String> createImgPoster(String value) {
        return new JAXBElement<String>(_ImgPoster_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thumbnail")
    public JAXBElement<String> createThumbnail(String value) {
        return new JAXBElement<String>(_Thumbnail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "multimediasRef")
    public JAXBElement<String> createMultimediasRef(String value) {
        return new JAXBElement<String>(_MultimediasRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directosEnvivoProximosRef")
    public JAXBElement<String> createDirectosEnvivoProximosRef(String value) {
        return new JAXBElement<String>(_DirectosEnvivoProximosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "permalink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPermalink(String value) {
        return new JAXBElement<String>(_Permalink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "audiosPopularesRef")
    public JAXBElement<String> createAudiosPopularesRef(String value) {
        return new JAXBElement<String>(_AudiosPopularesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shortTitle")
    public JAXBElement<String> createShortTitle(String value) {
        return new JAXBElement<String>(_ShortTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "videosRef")
    public JAXBElement<String> createVideosRef(String value) {
        return new JAXBElement<String>(_VideosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "seccionesRef")
    public JAXBElement<String> createSeccionesRef(String value) {
        return new JAXBElement<String>(_SeccionesRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "otherChannelsRef")
    public JAXBElement<String> createOtherChannelsRef(String value) {
        return new JAXBElement<String>(_OtherChannelsRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "longTitle")
    public JAXBElement<String> createLongTitle(String value) {
        return new JAXBElement<String>(_LongTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "programsRef")
    public JAXBElement<String> createProgramsRef(String value) {
        return new JAXBElement<String>(_ProgramsRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ageRangeUid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAgeRangeUid(String value) {
        return new JAXBElement<String>(_AgeRangeUid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "directosEnvivoAhoraRef")
    public JAXBElement<String> createDirectosEnvivoAhoraRef(String value) {
        return new JAXBElement<String>(_DirectosEnvivoAhoraRef_QNAME, String.class, null, value);
    }

}
