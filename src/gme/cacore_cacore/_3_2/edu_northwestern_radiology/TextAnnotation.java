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


/**
 * <p>Java class for TextAnnotation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextAnnotation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiPoint" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MultiPoint" type="{gme://caCORE.caCORE/3.2/edu.northwestern.radiology.AIM}MultiPoint" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="font" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontEffect" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="textJustify" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fontOpacity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAnnotation", propOrder = {
    "multiPoint"
})
public class TextAnnotation {

    protected TextAnnotation.MultiPoint multiPoint;
    @XmlAttribute(required = true)
    protected BigInteger id;
    @XmlAttribute
    protected String font;
    @XmlAttribute
    protected String fontColor;
    @XmlAttribute
    protected String fontEffect;
    @XmlAttribute
    protected String fontSize;
    @XmlAttribute
    protected String fontStyle;
    @XmlAttribute(required = true)
    protected String text;
    @XmlAttribute
    protected String textJustify;
    @XmlAttribute
    protected String fontOpacity;

    /**
     * Gets the value of the multiPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TextAnnotation.MultiPoint }
     *     
     */
    public TextAnnotation.MultiPoint getMultiPoint() {
        return multiPoint;
    }

    /**
     * Sets the value of the multiPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAnnotation.MultiPoint }
     *     
     */
    public void setMultiPoint(TextAnnotation.MultiPoint value) {
        this.multiPoint = value;
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
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFont(String value) {
        this.font = value;
    }

    /**
     * Gets the value of the fontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontColor(String value) {
        this.fontColor = value;
    }

    /**
     * Gets the value of the fontEffect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontEffect() {
        return fontEffect;
    }

    /**
     * Sets the value of the fontEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontEffect(String value) {
        this.fontEffect = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyle(String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textJustify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextJustify() {
        return textJustify;
    }

    /**
     * Sets the value of the textJustify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextJustify(String value) {
        this.textJustify = value;
    }

    /**
     * Gets the value of the fontOpacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontOpacity() {
        return fontOpacity;
    }

    /**
     * Sets the value of the fontOpacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontOpacity(String value) {
        this.fontOpacity = value;
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
     *         &lt;element name="MultiPoint" type="{gme://caCORE.caCORE/3.2/edu.northwestern.radiology.AIM}MultiPoint" minOccurs="0"/>
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
        "multiPoint"
    })
    public static class MultiPoint {

        @XmlElement(name = "MultiPoint")
        protected gme.cacore_cacore._3_2.edu_northwestern_radiology.MultiPoint multiPoint;

        /**
         * Gets the value of the multiPoint property.
         * 
         * @return
         *     possible object is
         *     {@link gme.cacore_cacore._3_2.edu_northwestern_radiology.MultiPoint }
         *     
         */
        public gme.cacore_cacore._3_2.edu_northwestern_radiology.MultiPoint getMultiPoint() {
            return multiPoint;
        }

        /**
         * Sets the value of the multiPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link gme.cacore_cacore._3_2.edu_northwestern_radiology.MultiPoint }
         *     
         */
        public void setMultiPoint(gme.cacore_cacore._3_2.edu_northwestern_radiology.MultiPoint value) {
            this.multiPoint = value;
        }

    }

}
