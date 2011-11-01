package com.irtve.plataforma.rest.model.dto;

import com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO;
import com.irtve.plataforma.rest.model.dto.channel.CadenaDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualitiesDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO;
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;
import com.irtve.plataforma.rest.model.dto.scope.MedioDTO;
import com.irtve.plataforma.rest.model.dto.topic.TopicDTO;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.irtve.plataforma.rest.model.dto
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
    private final static QName _Total_QNAME = new QName("", "total");
    private final static QName _HtmlShortUrl_QNAME = new QName("", "htmlShortUrl");
    private final static QName _Emission_QNAME = new QName("", "emission");
    private final static QName _AgrupadoresRef_QNAME = new QName("", "agrupadoresRef");
    private final static QName _HtmlUrl_QNAME = new QName("", "htmlUrl");
    private final static QName _Height_QNAME = new QName("", "height");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _ConfigPlayerRef_QNAME = new QName("", "configPlayerRef");
    private final static QName _LongDescription_QNAME = new QName("", "longDescription");
    private final static QName _MainTopic_QNAME = new QName("", "mainTopic");
    private final static QName _PublicationDate_QNAME = new QName("", "publicationDate");
    private final static QName _ExpirationDate_QNAME = new QName("", "expirationDate");
    private final static QName _FilePath_QNAME = new QName("", "filePath");
    private final static QName _Width_QNAME = new QName("", "width");
    private final static QName _FanBoxID_QNAME = new QName("", "fanBoxID");
    private final static QName _Number_QNAME = new QName("", "number");
    private final static QName _TranscriptionRef_QNAME = new QName("", "transcriptionRef");
    private final static QName _Director_QNAME = new QName("", "director");
    private final static QName _Uri_QNAME = new QName("", "uri");
    private final static QName _MedioRef_QNAME = new QName("", "medioRef");
    private final static QName _Size_QNAME = new QName("", "size");
    private final static QName _Filesize_QNAME = new QName("", "filesize");
    private final static QName _Thumbnail_QNAME = new QName("", "thumbnail");
    private final static QName _Permalink_QNAME = new QName("", "permalink");
    private final static QName _ShortDescription_QNAME = new QName("", "shortDescription");
    private final static QName _PreviewPath_QNAME = new QName("", "previewPath");
    private final static QName _SeccionesRef_QNAME = new QName("", "seccionesRef");
    private final static QName _LongTitle_QNAME = new QName("", "longTitle");
    private final static QName _MainCategoryRef_QNAME = new QName("", "mainCategoryRef");
    private final static QName _SubtitleRef_QNAME = new QName("", "subtitleRef");
    private final static QName _Language_QNAME = new QName("", "language");
    private final static QName _BitRate_QNAME = new QName("", "bitRate");
    private final static QName _Identifier_QNAME = new QName("", "identifier");
    private final static QName _TotalPages_QNAME = new QName("", "totalPages");
    private final static QName _Episode_QNAME = new QName("", "episode");
    private final static QName _TemporadasRef_QNAME = new QName("", "temporadasRef");
    private final static QName _CadenasRef_QNAME = new QName("", "cadenasRef");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _CuePointsRef_QNAME = new QName("", "cuePointsRef");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _ChildrenRef_QNAME = new QName("", "childrenRef");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _ProgramRef_QNAME = new QName("", "programRef");
    private final static QName _Preset_QNAME = new QName("", "preset");
    private final static QName _OutOfEmission_QNAME = new QName("", "outOfEmission");
    private final static QName _Offset_QNAME = new QName("", "offset");
    private final static QName _Popularity_QNAME = new QName("", "popularity");
    private final static QName _OtherTopicsRefs_QNAME = new QName("", "otherTopicsRefs");
    private final static QName _Logo_QNAME = new QName("", "logo");
    private final static QName _BitRateUnit_QNAME = new QName("", "bitRateUnit");
    private final static QName _DateOfEmission_QNAME = new QName("", "dateOfEmission");
    private final static QName _Duration_QNAME = new QName("", "duration");
    private final static QName _ShortTitle_QNAME = new QName("", "shortTitle");
    private final static QName _String_QNAME = new QName("", "string");
    private final static QName _ShowMan_QNAME = new QName("", "showMan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: com.irtve.plataforma.rest.model.dto
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Type }
     *
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Page }
     *
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link TopicsName }
     *
     */
    public TopicsName createTopicsName() {
        return new TopicsName();
    }

    /**
     * Create an instance of {@link Program }
     *
     */
    public ProgramDTO createProgram() {
        return new ProgramDTO();
    }

    /**
     * Create an instance of {@link Section }
     *
     */
    public SectionDTO createSection() {
        return new SectionDTO();
    }

    /**
     * Create an instance of {@link Items }
     *
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Qualities }
     *
     */
    public QualitiesDTO createQualities() {
        return new QualitiesDTO();
    }

    /**
     * Create an instance of {@link Cadena }
     *
     */
    public CadenaDTO createCadena() {
        return new CadenaDTO();
    }

    /**
     * Create an instance of {@link View }
     *
     */
    public ViewDTO createView() {
        return new ViewDTO();
    }

    /**
     * Create an instance of {@link QualityVideo }
     *
     */
    public QualityVideoDTO createQualityVideo() {
        return new QualityVideoDTO();
    }

    /**
     * Create an instance of {@link Video }
     *
     */
    public VideoDTO createVideo() {
        return new VideoDTO();
    }

    /**
     * Create an instance of {@link Channel }
     *
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link Agrupador }
     *
     */
    public AgrupadorDTO createAgrupador() {
        return new AgrupadorDTO();
    }

    /**
     * Create an instance of {@link Medio }
     *
     */
    public MedioDTO createMedio() {
        return new MedioDTO();
    }

    /**
     * Create an instance of {@link Season }
     *
     */
    public SeasonDTO createSeason() {
        return new SeasonDTO();
    }

    /**
     * Create an instance of {@link Topic }
     *
     */
    public TopicDTO createTopic() {
        return new TopicDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "total")
    public JAXBElement<BigInteger> createTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_Total_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "htmlUrl")
    public JAXBElement<String> createHtmlUrl(String value) {
        return new JAXBElement<String>(_HtmlUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "height")
    public JAXBElement<BigInteger> createHeight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Height_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "configPlayerRef")
    public JAXBElement<String> createConfigPlayerRef(String value) {
        return new JAXBElement<String>(_ConfigPlayerRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "longDescription")
    public JAXBElement<String> createLongDescription(String value) {
        return new JAXBElement<String>(_LongDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "mainTopic")
    public JAXBElement<String> createMainTopic(String value) {
        return new JAXBElement<String>(_MainTopic_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "publicationDate")
    public JAXBElement<String> createPublicationDate(String value) {
        return new JAXBElement<String>(_PublicationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "expirationDate")
    public JAXBElement<String> createExpirationDate(String value) {
        return new JAXBElement<String>(_ExpirationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "filePath")
    public JAXBElement<String> createFilePath(String value) {
        return new JAXBElement<String>(_FilePath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "width")
    public JAXBElement<BigInteger> createWidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Width_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "fanBoxID")
    public JAXBElement<BigInteger> createFanBoxID(BigInteger value) {
        return new JAXBElement<BigInteger>(_FanBoxID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "number")
    public JAXBElement<BigInteger> createNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_Number_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "transcriptionRef")
    public JAXBElement<String> createTranscriptionRef(String value) {
        return new JAXBElement<String>(_TranscriptionRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "director")
    public JAXBElement<String> createDirector(String value) {
        return new JAXBElement<String>(_Director_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "medioRef")
    public JAXBElement<String> createMedioRef(String value) {
        return new JAXBElement<String>(_MedioRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "size")
    public JAXBElement<BigInteger> createSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Size_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "filesize")
    public JAXBElement<BigInteger> createFilesize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Filesize_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "permalink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPermalink(String value) {
        return new JAXBElement<String>(_Permalink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "shortDescription")
    public JAXBElement<String> createShortDescription(String value) {
        return new JAXBElement<String>(_ShortDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "previewPath")
    public JAXBElement<String> createPreviewPath(String value) {
        return new JAXBElement<String>(_PreviewPath_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "longTitle")
    public JAXBElement<String> createLongTitle(String value) {
        return new JAXBElement<String>(_LongTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "mainCategoryRef")
    public JAXBElement<String> createMainCategoryRef(String value) {
        return new JAXBElement<String>(_MainCategoryRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "subtitleRef")
    public JAXBElement<String> createSubtitleRef(String value) {
        return new JAXBElement<String>(_SubtitleRef_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "bitRate")
    public JAXBElement<BigInteger> createBitRate(BigInteger value) {
        return new JAXBElement<BigInteger>(_BitRate_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "identifier")
    public JAXBElement<BigInteger> createIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_Identifier_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "totalPages")
    public JAXBElement<BigInteger> createTotalPages(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPages_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "episode")
    public JAXBElement<BigInteger> createEpisode(BigInteger value) {
        return new JAXBElement<BigInteger>(_Episode_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "cadenasRef")
    public JAXBElement<String> createCadenasRef(String value) {
        return new JAXBElement<String>(_CadenasRef_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "cuePointsRef")
    public JAXBElement<String> createCuePointsRef(String value) {
        return new JAXBElement<String>(_CuePointsRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "childrenRef")
    public JAXBElement<String> createChildrenRef(String value) {
        return new JAXBElement<String>(_ChildrenRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "programRef")
    public JAXBElement<String> createProgramRef(String value) {
        return new JAXBElement<String>(_ProgramRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "preset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreset(String value) {
        return new JAXBElement<String>(_Preset_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "offset")
    public JAXBElement<BigInteger> createOffset(BigInteger value) {
        return new JAXBElement<BigInteger>(_Offset_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "popularity")
    public JAXBElement<BigDecimal> createPopularity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Popularity_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "otherTopicsRefs")
    public JAXBElement<String> createOtherTopicsRefs(String value) {
        return new JAXBElement<String>(_OtherTopicsRefs_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "bitRateUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBitRateUnit(String value) {
        return new JAXBElement<String>(_BitRateUnit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "dateOfEmission")
    public JAXBElement<String> createDateOfEmission(String value) {
        return new JAXBElement<String>(_DateOfEmission_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "duration")
    public JAXBElement<BigInteger> createDuration(BigInteger value) {
        return new JAXBElement<BigInteger>(_Duration_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "showMan")
    public JAXBElement<String> createShowMan(String value) {
        return new JAXBElement<String>(_ShowMan_QNAME, String.class, null, value);
    }
}
