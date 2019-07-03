package cn.net.cobot.cobot_benchmark_javacert;
//check type:Java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class j_00_17_basic_01 {
	private static void receiveXMLStream(InputStream inStream,
			DefaultHandler defaultHandler)
					throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse(inStream, defaultHandler);
	}

	public static void main(String[] args) throws ParserConfigurationException,
	SAXException, IOException {
		try {
			receiveXMLStream(new FileInputStream("evil.xml"), new DefaultHandler());//not compliant
		} catch (java.net.MalformedURLException mue) {
			System.err.println("Malformed URL Exception: " + mue);
		}
	}
}
