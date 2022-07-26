package homework3.task2;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class XPathParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/homework3/task2/Computer.xml"));

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        System.out.println(xPath.evaluate("/devices/device/name",document));
        System.out.println(xPath.evaluate("/devices/device/price",document));
        System.out.println(xPath.evaluate("/devices/device/origin",document));
        System.out.println(xPath.evaluate("/devices/device/type",document));
        System.out.println(xPath.evaluate("/devices/device/critical",document));
        System.out.println(xPath.evaluate("/devices/device[2]/name",document));
        System.out.println(xPath.evaluate("/devices/device[2]/price",document));
        System.out.println(xPath.evaluate("/devices/device[2]/origin",document));
        System.out.println(xPath.evaluate("/devices/device[2]/type",document));
        System.out.println(xPath.evaluate("/devices/device[2]/critical",document));
        System.out.println(xPath.evaluate("/devices/device[3]/name",document));
        System.out.println(xPath.evaluate("/devices/device[3]/price",document));
        System.out.println(xPath.evaluate("/devices/device[3]/origin",document));
        System.out.println(xPath.evaluate("/devices/device[3]/type",document));
        System.out.println(xPath.evaluate("/devices/device[3]/critical",document));
        System.out.println(xPath.evaluate("/devices/device[4]/name",document));
        System.out.println(xPath.evaluate("/devices/device[4]/price",document));
        System.out.println(xPath.evaluate("/devices/device[4]/origin",document));
        System.out.println(xPath.evaluate("/devices/device[4]/type",document));
        System.out.println(xPath.evaluate("/devices/device[4]/critical",document));
        System.out.println(xPath.evaluate("/devices/device[5]/name",document));
        System.out.println(xPath.evaluate("/devices/device[5]/price",document));
        System.out.println(xPath.evaluate("/devices/device[5]/origin",document));
        System.out.println(xPath.evaluate("/devices/device[5]/type",document));
        System.out.println(xPath.evaluate("/devices/device[5]/critical",document));

    }
}
