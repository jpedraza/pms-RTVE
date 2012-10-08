package com.irtve.plataforma.rest.model.dto;

import com.irtve.plataforma.rest.model.dto.advertising.AdvertisingDTO;
import com.irtve.plataforma.rest.model.dto.agrupator.AgrupadorDTO;
import com.irtve.plataforma.rest.model.dto.channel.CadenaDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.AudioDTO;
import com.irtve.plataforma.rest.model.dto.multimedia.VideoDTO;
import com.irtve.plataforma.rest.model.dto.program.ProgramDTO;
import com.irtve.plataforma.rest.model.dto.program.season.SeasonDTO;
import com.irtve.plataforma.rest.model.dto.program.section.SectionDTO;
import com.irtve.plataforma.rest.model.dto.programgroup.AgrProgramaDTO;
import com.irtve.plataforma.rest.model.dto.scope.MedioDTO;
import com.irtve.plataforma.rest.model.dto.topic.TopicDTO;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
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

    private final static QName _Total_QNAME = new QName("", "total");
    private final static QName _Number_QNAME = new QName("", "number");
    private final static QName _Offset_QNAME = new QName("", "offset");
    private final static QName _TotalPages_QNAME = new QName("", "totalPages");
    private final static QName _NumElements_QNAME = new QName("", "numElements");
    private final static QName _Size_QNAME = new QName("", "size");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: com.irtve.plataforma.rest.model.dto
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
     * Create an instance of {@link ViewDTO }
     *
     */
    public ViewDTO createViewDTO() {
        return new ViewDTO();
    }

    /**
     * Create an instance of {@link Page }
     *
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Items }
     *
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link AdvertisingDTO }
     *
     */
    public AdvertisingDTO createAdvertisingDTO() {
        return new AdvertisingDTO();
    }

    /**
     * Create an instance of {@link AgrProgramaDTO }
     *
     */
    public AgrProgramaDTO createAgrProgramaDTO() {
        return new AgrProgramaDTO();
    }

    /**
     * Create an instance of {@link AgrupadorDTO }
     *
     */
    public AgrupadorDTO createAgrupadorDTO() {
        return new AgrupadorDTO();
    }

    /**
     * Create an instance of {@link AudioDTO }
     *
     */
    public AudioDTO createAudioDTO() {
        return new AudioDTO();
    }

    /**
     * Create an instance of {@link CadenaDTO }
     *
     */
    public CadenaDTO createCadenaDTO() {
        return new CadenaDTO();
    }

    /**
     * Create an instance of {@link ProgramDTO }
     *
     */
    public ProgramDTO createProgramDTO() {
        return new ProgramDTO();
    }

    /**
     * Create an instance of {@link SeasonDTO }
     *
     */
    public SeasonDTO createSeasonDTO() {
        return new SeasonDTO();
    }

    /**
     * Create an instance of {@link SectionDTO }
     *
     */
    public SectionDTO createSectionDTO() {
        return new SectionDTO();
    }

    /**
     * Create an instance of {@link TopicDTO }
     *
     */
    public TopicDTO createTopicDTO() {
        return new TopicDTO();
    }

    /**
     * Create an instance of {@link VideoDTO }
     *
     */
    public VideoDTO createVideoDTO() {
        return new VideoDTO();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "total")
    public JAXBElement<BigInteger> createTotal(BigInteger value) {
        return new JAXBElement<BigInteger>(_Total_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "number")
    public JAXBElement<BigInteger> createNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_Number_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "offset")
    public JAXBElement<BigInteger> createOffset(BigInteger value) {
        return new JAXBElement<BigInteger>(_Offset_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "totalPages")
    public JAXBElement<BigInteger> createTotalPages(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPages_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "numElements")
    public JAXBElement<BigInteger> createNumElements(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumElements_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "size")
    public JAXBElement<BigInteger> createSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_Size_QNAME, BigInteger.class, null, value);
    }
}
