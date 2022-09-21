
package activetech.webservice.client.xmlservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* ReportService service = new ReportService();
* ReportServiceSoap portType = service.getReportServiceSoap();
* portType.xmlService(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "ReportService", targetNamespace = "http://tongji.org", wsdlLocation = "http://ensemble.zjyy.com:8080/soap/tongjiplus/Tongji.Report.ReportService.cls?wsdl")
public class ReportService extends Service {

	private final static URL REPORTSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(activetech.webservice.client.xmlservice.ReportService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = activetech.webservice.client.xmlservice.ReportService.class.getResource(".");
			url = new URL(baseUrl,
					"http://ensemble.zjyy.com:8080/soap/tongjiplus/Tongji.Report.ReportService.cls?wsdl");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'http://ensemble.zjyy.com:8080/soap/tongjiplus/Tongji.Report.ReportService.cls?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		REPORTSERVICE_WSDL_LOCATION = url;
	}

	public ReportService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ReportService() {
		super(REPORTSERVICE_WSDL_LOCATION, new QName("http://tongji.org", "ReportService"));
	}

	/**
	 * 
	 * @return returns ReportServiceSoap
	 */
	@WebEndpoint(name = "ReportServiceSoap")
	public ReportServiceSoap getReportServiceSoap() {
		return super.getPort(new QName("http://tongji.org", "ReportServiceSoap"), ReportServiceSoap.class);
	}

}
