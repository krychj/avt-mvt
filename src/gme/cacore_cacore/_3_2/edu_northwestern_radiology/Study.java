//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.25 at 05:00:33 ���� CST 
//


package gme.cacore_cacore._3_2.edu_northwestern_radiology;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Study complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Study">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="series">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Series" type="{gme://caCORE.caCORE/3.2/edu.northwestern.radiology.AIM}Series"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="instanceUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="studyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="studyTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Study", propOrder = {
    "series"
})
public class Study {

    @XmlElement(required = true)
    protected Study.Series series;
    @XmlAttribute(required = true)
    protected BigInteger id;
    @XmlAttribute(required = true)
    protected String instanceUID;
    @XmlAttribute
    protected XMLGregorianCalendar studyDate;
    @XmlAttribute
    protected String studyTime;

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link Study.Series }
     *     
     */
    public Study.Series getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link Study.Series }
     *     
     */
    public void setSeries(Study.Series value) {
        this.series = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the instanceUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceUID() {
        return instanceUID;
    }

    /**
     * Sets the value of the instanceUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceUID(String value) {
        this.instanceUID = value;
    }

    /**
     * Gets the value of the studyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudyDate() {
        return studyDate;
    }

    /**
     * Sets the value of the studyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudyDate(XMLGregorianCalendar value) {
        this.studyDate = value;
    }

    /**
     * Gets the value of the studyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyTime() {
        return studyTime;
    }

    /**
     * Sets the value of the studyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyTime(String value) {
        this.studyTime = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Series" type="{gme://caCORE.caCORE/3.2/edu.northwestern.radiology.AIM}Series"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "series"
    })
    public static class Series {

        @XmlElement(name = "Series", required = true)
        protected gme.cacore_cacore._3_2.edu_northwestern_radiology.Series series;

        /**
         * Gets the value of the series property.
         * 
         * @return
         *     possible object is
         *     {@link gme.cacore_cacore._3_2.edu_northwestern_radiology.Series }
         *     
         */
        public gme.cacore_cacore._3_2.edu_northwestern_radiology.Series getSeries() {
            return series;
        }

        /**
         * Sets the value of the series property.
         * 
         * @param value
         *     allowed object is
         *     {@link gme.cacore_cacore._3_2.edu_northwestern_radiology.Series }
         *     
         */
        public void setSeries(gme.cacore_cacore._3_2.edu_northwestern_radiology.Series value) {
            this.series = value;
        }

    }

}