
package com.th.supcom.eif.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for acceptTokenMessageResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="acceptTokenMessageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acceptTokenMessageReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptTokenMessageResponse", propOrder = { "acceptTokenMessageReturn" })
public class AcceptTokenMessageResponse {

	protected String acceptTokenMessageReturn;

	/**
	 * Gets the value of the acceptTokenMessageReturn property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAcceptTokenMessageReturn() {
		return acceptTokenMessageReturn;
	}

	/**
	 * Sets the value of the acceptTokenMessageReturn property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAcceptTokenMessageReturn(String value) {
		this.acceptTokenMessageReturn = value;
	}

}
