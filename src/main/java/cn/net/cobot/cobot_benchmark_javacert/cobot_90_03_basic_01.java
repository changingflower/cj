package cn.net.cobot.cobot_benchmark_javacert;
import java.io.BufferedInputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

public class cobot_90_03_basic_01 {
	public void parse(URL document) throws Exception
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        factory.setNamespaceAware(true);
        // Equivalent:
        // factory.setFeature("http://xml.org/sax/features/namespaces", true);

        // Doesn't seem to do anything:
        factory.setFeature("http://apache.org/xml/features/validation/schema/normalized-value", true);	//should be false

        // Doesn't seem to do anything:
        factory.setFeature("http://xml.org/sax/features/namespace-prefixes", true);	//should be false

        // A non-validation parser is fine!

        SAXParser parser = factory.newSAXParser();

        InputSource source = new InputSource(new BufferedInputStream(document.openStream()));

        DefaultHandler dh = null;
        parser.parse(source, dh);;;
    }	
}