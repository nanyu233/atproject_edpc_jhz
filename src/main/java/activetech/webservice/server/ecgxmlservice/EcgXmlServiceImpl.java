package activetech.webservice.server.ecgxmlservice;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class EcgXmlServiceImpl implements EcgXmlService {

	@Override
	public String ecgXmlReceive(String ecgXml) {
		SAXReader sr = new SAXReader();
		try {
			Document doc = sr.read(ecgXml);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
	}

}
