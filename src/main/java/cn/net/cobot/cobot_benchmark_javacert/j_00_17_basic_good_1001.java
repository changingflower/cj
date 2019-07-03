package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

class j_00_17_basic_good_1001 {
	private static void receiveXMLStream(InputStream inStream,
			DefaultHandler defaultHandler) throws ParserConfigurationException,
	SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();

		// Create an XML reader to set the entity resolver.
		XMLReader reader = saxParser.getXMLReader();
		reader.setEntityResolver(new CustomResolver());
		reader.setContentHandler(defaultHandler);

		InputSource is = new InputSource(inStream);
		reader.parse(is);
	}
	public static void main(String[] args) throws ParserConfigurationException,
	SAXException, IOException {
		try {
			receiveXMLStream(new FileInputStream("evil.xml"), new DefaultHandler());
		} catch (java.net.MalformedURLException mue) {
			System.err.println("Malformed URL Exception: " + mue);
		}
	}
}

	class CustomResolver implements EntityResolver {  
	    public InputSource resolveEntity(String publicId, String systemId)  
	        throws SAXException, IOException {  
	 
	        // check for known good entities  
	        String entityPath = "/home/username/java/xxe/file";  
	        if (systemId.equals(entityPath)) {  
	         
	            return new InputSource(entityPath);  
	        } else {  
	            return new InputSource(); // Disallow unknown entities  
	                                                                // by returning a blank path  
	        }  
	    }  
	}  
	 

	