package com.irtve.plataforma.rest.model.dto.multimedia;

import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityAudioDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.quality.QualityVideoDTO;
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
 * element interface generated in the
 * com.irtve.plataforma.rest.model.dto.multimedia package. <p>An ObjectFactory
 * allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can
 * consist of schema derived interfaces and classes representing the binding of
 * schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Episode_QNAME = new QName("", "episode");
    private final static QName _HtmlShortUrl_QNAME = new QName("", "htmlShortUrl");
    private final static QName _TemporadasRef_QNAME = new QName("", "temporadasRef");
    private final static QName _QualitiesRef_QNAME = new QName("", "qualitiesRef");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _CuePointsRef_QNAME = new QName("", "cuePointsRef");
    private final static QName _HtmlUrl_QNAME = new QName("", "htmlUrl");
    private final static QName _Height_QNAME = new QName("", "height");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _ConfigPlayerRef_QNAME = new QName("", "configPlayerRef");
    private final static QName _ProgramRef_QNAME = new QName("", "programRef");
    private final static QName _PublicidadRef_QNAME = new QName("", "publicidadRef");
    private final static QName _Preset_QNAME = new QName("", "preset");
    private final static QName _MainTopic_QNAME = new QName("", "mainTopic");
    private final static QName _PublicationDate_QNAME = new QName("", "publicationDate");
    private final static QName _Popularity_QNAME = new QName("", "popularity");
    private final static QName _OtherTopicsRefs_QNAME = new QName("", "otherTopicsRefs");
    private final static QName _NumVisits_QNAME = new QName("", "numVisits");
    private final static QName _NumOfChannels_QNAME = new QName("", "numOfChannels");
    private final static QName _FilePath_QNAME = new QName("", "filePath");
    private final static QName _BitRateUnit_QNAME = new QName("", "bitRateUnit");
    private final static QName _Width_QNAME = new QName("", "width");
    private final static QName _ComentariosRef_QNAME = new QName("", "comentariosRef");
    private final static QName _DateOfEmission_QNAME = new QName("", "dateOfEmission");
    private final static QName _RelacionadosRef_QNAME = new QName("", "relacionadosRef");
    private final static QName _Code_QNAME = new QName("", "code");
    private final static QName _TranscriptionRef_QNAME = new QName("", "transcriptionRef");
    private final static QName _RelManualesRef_QNAME = new QName("", "relManualesRef");
    private final static QName _Uri_QNAME = new QName("", "uri");
    private final static QName _Duration_QNAME = new QName("", "duration");
    private final static QName _Filesize_QNAME = new QName("", "filesize");
    private final static QName _Thumbnail_QNAME = new QName("", "thumbnail");
    private final static QName _ShortDescription_QNAME = new QName("", "shortDescription");
    private final static QName _ShortTitle_QNAME = new QName("", "shortTitle");
    private final static QName _PreviewPath_QNAME = new QName("", "previewPath");
    private final static QName _String_QNAME = new QName("", "string");
    private final static QName _LongTitle_QNAME = new QName("", "longTitle");
    private final static QName _SubtitleRef_QNAME = new QName("", "subtitleRef");
    private final static QName _MainCategoryRef_QNAME = new QName("", "mainCategoryRef");
    private final static QName _Language_QNAME = new QName("", "language");
    private final static QName _BitRate_QNAME = new QName("", "bitRate");
    private final static QName _Identifier_QNAME = new QName("", "identifier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.irtve.plataforma.rest.model.dto.multimedia
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualityAudioDTO }
     *
     */
    public QualityAudioDTO createQualityAudioDTO() {
        return new QualityAudioDTO();
    }

    /**
     * Create an instance of {@link Type }
     *
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link QualityVideoDTO }
     *
     */
    public QualityVideoDTO createQualityVideoDTO() {
        return new QualityVideoDTO();
    }

    /**
     * Create an instance of {@link VideoDTO }
     *
     */
    public VideoDTO createVideoDTO() {
        return new VideoDTO();
    }

    /**
     * Create an instance of {@link PubState }
     *
     */
    public PubState createPubState() {
        return new PubState();
    }

    /**
     * Create an instance of {@link Qualities }
     *
     */
    public Qualities createQualities() {
        return new Qualities();
    }

    /**
     * Create an instance of {@link TopicsName }
     *
     */
    public TopicsName createTopicsName() {
        return new TopicsName();
    }

    /**
     * Create an instance of {@link AudioDTO }
     *
     */
    public AudioDTO createAudioDTO() {
        return new AudioDTO();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "episode")
    public JAXBElement<BigInteger> createEpisode(BigInteger value) {
        return new JAXBElement<BigInteger>(_Episode_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "temporadasRef")
    public JAXBElement<String> createTemporadasRef(String value) {
        return new JAXBElement<String>(_TemporadasRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "qualitiesRef")
    public JAXBElement<String> createQualitiesRef(String value) {
        return new JAXBElement<String>(_QualitiesRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "cuePointsRef")
    public JAXBElement<String> createCuePointsRef(String value) {
        return new JAXBElement<String>(_CuePointsRef_QNAME, String.class, null, value);
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
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "height")
    public JAXBElement<BigInteger> createHeight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Height_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "configPlayerRef")
    public JAXBElement<String> createConfigPlayerRef(String value) {
        return new JAXBElement<String>(_ConfigPlayerRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "publicidadRef")
    public JAXBElement<String> createPublicidadRef(String value) {
        return new JAXBElement<String>(_PublicidadRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "preset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreset(String value) {
        return new JAXBElement<String>(_Preset_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "mainTopic")
    public JAXBElement<String> createMainTopic(String value) {
        return new JAXBElement<String>(_MainTopic_QNAME, String.class, null, value);
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

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "popularity")
    public JAXBElement<BigDecimal> createPopularity(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Popularity_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "otherTopicsRefs")
    public JAXBElement<String> createOtherTopicsRefs(String value) {
        return new JAXBElement<String>(_OtherTopicsRefs_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "numVisits")
    public JAXBElement<BigInteger> createNumVisits(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumVisits_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "numOfChannels")
    public JAXBElement<BigInteger> createNumOfChannels(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumOfChannels_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "filePath")
    public JAXBElement<String> createFilePath(String value) {
        return new JAXBElement<String>(_FilePath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "bitRateUnit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBitRateUnit(String value) {
        return new JAXBElement<String>(_BitRateUnit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "width")
    public JAXBElement<BigInteger> createWidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Width_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "comentariosRef")
    public JAXBElement<String> createComentariosRef(String value) {
        return new JAXBElement<String>(_ComentariosRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "dateOfEmission")
    public JAXBElement<String> createDateOfEmission(String value) {
        return new JAXBElement<String>(_DateOfEmission_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "relacionadosRef")
    public JAXBElement<String> createRelacionadosRef(String value) {
        return new JAXBElement<String>(_RelacionadosRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "transcriptionRef")
    public JAXBElement<String> createTranscriptionRef(String value) {
        return new JAXBElement<String>(_TranscriptionRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "relManualesRef")
    public JAXBElement<String> createRelManualesRef(String value) {
        return new JAXBElement<String>(_RelManualesRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "duration")
    public JAXBElement<BigInteger> createDuration(BigInteger value) {
        return new JAXBElement<BigInteger>(_Duration_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "filesize")
    public JAXBElement<BigInteger> createFilesize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Filesize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "thumbnail")
    public JAXBElement<String> createThumbnail(String value) {
        return new JAXBElement<String>(_Thumbnail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "shortDescription")
    public JAXBElement<String> createShortDescription(String value) {
        return new JAXBElement<String>(_ShortDescription_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "previewPath")
    public JAXBElement<String> createPreviewPath(String value) {
        return new JAXBElement<String>(_PreviewPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "subtitleRef")
    public JAXBElement<String> createSubtitleRef(String value) {
        return new JAXBElement<String>(_SubtitleRef_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguage(String value) {
        return new JAXBElement<String>(_Language_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "bitRate")
    public JAXBElement<BigInteger> createBitRate(BigInteger value) {
        return new JAXBElement<BigInteger>(_BitRate_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "identifier")
    public JAXBElement<BigInteger> createIdentifier(BigInteger value) {
        return new JAXBElement<BigInteger>(_Identifier_QNAME, BigInteger.class, null, value);
    }
}
