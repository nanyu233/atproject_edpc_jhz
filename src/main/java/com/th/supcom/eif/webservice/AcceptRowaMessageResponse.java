
package com.th.supcom.eif.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptRowaMessageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acceptRowaMessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acceptRowaMessageReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptRowaMessageResponse", propOrder = {
    "acceptRowaMessageReturn"
})
public class AcceptRowaMessageResponse {

    protected String acceptRowaMessageReturn;

    /**
     * Gets the value of the acceptRowaMessageReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptRowaMessageReturn() {
        return acceptRowaMessageReturn;
    }

    /**
     * Sets the value of the acceptRowaMessageReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptRowaMessageReturn(String value) {
        this.acceptRowaMessageReturn = value;
    }

}
