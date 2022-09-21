
package org.tongji;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pInput" })
@XmlRootElement(name = "XMLService")
public class XMLService {

	protected String pInput;

	/**
	 * Gets the value of the pInput property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPInput() {
		return pInput;
	}

	/**
	 * Sets the value of the pInput property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPInput(String value) {
		this.pInput = value;
	}

}
