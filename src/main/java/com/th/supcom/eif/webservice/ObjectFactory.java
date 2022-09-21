
package com.th.supcom.eif.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.th.supcom.eif.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AcceptOutMessage_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptOutMessage");
    private final static QName _AcceptAppointMessageResponse_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptAppointMessageResponse");
    private final static QName _AcceptRowaMessage_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptRowaMessage");
    private final static QName _AcceptRowaMessageResponse_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptRowaMessageResponse");
    private final static QName _Exception_QNAME = new QName("http://webService.eif.supcom.th.com/", "Exception");
    private final static QName _AcceptMessage_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptMessage");
    private final static QName _AcceptOutMessageResponse_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptOutMessageResponse");
    private final static QName _AcceptAppointMessage_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptAppointMessage");
    private final static QName _AcceptMessageResponse_QNAME = new QName("http://webService.eif.supcom.th.com/", "acceptMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.th.supcom.eif.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcceptRowaMessageResponse }
     * 
     */
    public AcceptRowaMessageResponse createAcceptRowaMessageResponse() {
        return new AcceptRowaMessageResponse();
    }

    /**
     * Create an instance of {@link AcceptAppointMessage }
     * 
     */
    public AcceptAppointMessage createAcceptAppointMessage() {
        return new AcceptAppointMessage();
    }

    /**
     * Create an instance of {@link AcceptMessageResponse }
     * 
     */
    public AcceptMessageResponse createAcceptMessageResponse() {
        return new AcceptMessageResponse();
    }

    /**
     * Create an instance of {@link AcceptRowaMessage }
     * 
     */
    public AcceptRowaMessage createAcceptRowaMessage() {
        return new AcceptRowaMessage();
    }

    /**
     * Create an instance of {@link AcceptOutMessage }
     * 
     */
    public AcceptOutMessage createAcceptOutMessage() {
        return new AcceptOutMessage();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AcceptMessage }
     * 
     */
    public AcceptMessage createAcceptMessage() {
        return new AcceptMessage();
    }

    /**
     * Create an instance of {@link AcceptAppointMessageResponse }
     * 
     */
    public AcceptAppointMessageResponse createAcceptAppointMessageResponse() {
        return new AcceptAppointMessageResponse();
    }

    /**
     * Create an instance of {@link AcceptOutMessageResponse }
     * 
     */
    public AcceptOutMessageResponse createAcceptOutMessageResponse() {
        return new AcceptOutMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptOutMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptOutMessage")
    public JAXBElement<AcceptOutMessage> createAcceptOutMessage(AcceptOutMessage value) {
        return new JAXBElement<AcceptOutMessage>(_AcceptOutMessage_QNAME, AcceptOutMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptAppointMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptAppointMessageResponse")
    public JAXBElement<AcceptAppointMessageResponse> createAcceptAppointMessageResponse(AcceptAppointMessageResponse value) {
        return new JAXBElement<AcceptAppointMessageResponse>(_AcceptAppointMessageResponse_QNAME, AcceptAppointMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptRowaMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptRowaMessage")
    public JAXBElement<AcceptRowaMessage> createAcceptRowaMessage(AcceptRowaMessage value) {
        return new JAXBElement<AcceptRowaMessage>(_AcceptRowaMessage_QNAME, AcceptRowaMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptRowaMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptRowaMessageResponse")
    public JAXBElement<AcceptRowaMessageResponse> createAcceptRowaMessageResponse(AcceptRowaMessageResponse value) {
        return new JAXBElement<AcceptRowaMessageResponse>(_AcceptRowaMessageResponse_QNAME, AcceptRowaMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptMessage")
    public JAXBElement<AcceptMessage> createAcceptMessage(AcceptMessage value) {
        return new JAXBElement<AcceptMessage>(_AcceptMessage_QNAME, AcceptMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptOutMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptOutMessageResponse")
    public JAXBElement<AcceptOutMessageResponse> createAcceptOutMessageResponse(AcceptOutMessageResponse value) {
        return new JAXBElement<AcceptOutMessageResponse>(_AcceptOutMessageResponse_QNAME, AcceptOutMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptAppointMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptAppointMessage")
    public JAXBElement<AcceptAppointMessage> createAcceptAppointMessage(AcceptAppointMessage value) {
        return new JAXBElement<AcceptAppointMessage>(_AcceptAppointMessage_QNAME, AcceptAppointMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.eif.supcom.th.com/", name = "acceptMessageResponse")
    public JAXBElement<AcceptMessageResponse> createAcceptMessageResponse(AcceptMessageResponse value) {
        return new JAXBElement<AcceptMessageResponse>(_AcceptMessageResponse_QNAME, AcceptMessageResponse.class, null, value);
    }

}
