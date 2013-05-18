//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.06 at 02:00:14 PM MDT 
//


package gme.cacore_cacore._4_4.edu_northwestern_radiology;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uri.iso_org._21090.ST;


/**
 * <p>Java class for CalculationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{uri:iso.org:21090}ST"/>
 *         &lt;element name="coordinateCollection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Coordinate" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}Coordinate" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationData", propOrder = {
    "value",
    "coordinateCollection"
})
public class CalculationData {

    @XmlElement(required = true)
    protected ST value;
    @XmlElement(required = true)
    protected CalculationData.CoordinateCollection coordinateCollection;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setValue(ST value) {
        this.value = value;
    }

    /**
     * Gets the value of the coordinateCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationData.CoordinateCollection }
     *     
     */
    public CalculationData.CoordinateCollection getCoordinateCollection() {
        return coordinateCollection;
    }

    /**
     * Sets the value of the coordinateCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationData.CoordinateCollection }
     *     
     */
    public void setCoordinateCollection(CalculationData.CoordinateCollection value) {
        this.coordinateCollection = value;
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
     *         &lt;element name="Coordinate" type="{gme://caCORE.caCORE/4.4/edu.northwestern.radiology.AIM}Coordinate" maxOccurs="unbounded"/>
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
        "coordinate"
    })
    public static class CoordinateCollection {

        @XmlElement(name = "Coordinate", required = true)
        protected List<Coordinate> coordinate;

        /**
         * Gets the value of the coordinate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coordinate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoordinate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Coordinate }
         * 
         * 
         */
        public List<Coordinate> getCoordinate() {
            if (coordinate == null) {
                coordinate = new ArrayList<Coordinate>();
            }
            return this.coordinate;
        }

    }

}