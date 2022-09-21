
package com.th.supcom.eif.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptMessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acceptMessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acceptMessageReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptMessageResponse", propOrder = {
    "acceptMessageReturn"
})
public class AcceptMessageResponse {

    protected String acceptMessageReturn;

    /**
     * Gets the value of the acceptMessageReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptMessageReturn() {
        return acceptMessageReturn;
    }

    /**
     * Sets the value of the acceptMessageReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptMessageReturn(String value) {
        this.acceptMessageReturn = value;
    }

}
