
package activetech.webservice.client.xmlservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="XMLServiceResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "xmlServiceResult" })
@XmlRootElement(name = "XMLServiceResponse")
public class XMLServiceResponse {

	@XmlElement(name = "XMLServiceResult", required = true)
	protected String xmlServiceResult;

	/**
	 * Gets the value of the xmlServiceResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXMLServiceResult() {
		return xmlServiceResult;
	}

	/**
	 * Sets the value of the xmlServiceResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXMLServiceResult(String value) {
		this.xmlServiceResult = value;
	}

}
