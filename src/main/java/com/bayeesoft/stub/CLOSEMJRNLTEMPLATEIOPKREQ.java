
package com.bayeesoft.stub;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSDEService}FCUBS_HEADERType"/&gt;
 *         &lt;element name="FCUBS_BODY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Detms-Jrnl-Tmpl-Master-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}MultiJrnlTeml-Close-IO-Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "CLOSEMJRNLTEMPLATE_IOPK_REQ")
public class CLOSEMJRNLTEMPLATEIOPKREQ {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected CLOSEMJRNLTEMPLATEIOPKREQ.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEMJRNLTEMPLATEIOPKREQ.FCUBSBODY }
     *     
     */
    public CLOSEMJRNLTEMPLATEIOPKREQ.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEMJRNLTEMPLATEIOPKREQ.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(CLOSEMJRNLTEMPLATEIOPKREQ.FCUBSBODY value) {
        this.fcubsbody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Detms-Jrnl-Tmpl-Master-IO" type="{http://fcubs.ofss.com/service/FCUBSDEService}MultiJrnlTeml-Close-IO-Type"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detmsJrnlTmplMasterIO"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Detms-Jrnl-Tmpl-Master-IO", required = true)
        protected MultiJrnlTemlCloseIOType detmsJrnlTmplMasterIO;

        /**
         * Gets the value of the detmsJrnlTmplMasterIO property.
         * 
         * @return
         *     possible object is
         *     {@link MultiJrnlTemlCloseIOType }
         *     
         */
        public MultiJrnlTemlCloseIOType getDetmsJrnlTmplMasterIO() {
            return detmsJrnlTmplMasterIO;
        }

        /**
         * Sets the value of the detmsJrnlTmplMasterIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiJrnlTemlCloseIOType }
         *     
         */
        public void setDetmsJrnlTmplMasterIO(MultiJrnlTemlCloseIOType value) {
            this.detmsJrnlTmplMasterIO = value;
        }

    }

}
