package homework2.task2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class XmlParser {
    public static void main(String[] args) {

        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Error" + e);
            return;
        }
        Node rootNode = doc.getFirstChild();
        List<Device> deviceList = new ArrayList<>();
        NodeList rootChilds = rootNode.getChildNodes();
        Node deviceNode = null;
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            deviceNode = rootChilds.item(i);


            if (deviceNode == null) {
                return;
            }
            String name = "";
            int price = 0;
            String origin = "";
            String type = "";
            String critical = "";
            NodeList deviceChilds = deviceNode.getChildNodes();
            for (int j = 0; j < deviceChilds.getLength(); j++) {
                if (deviceChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                switch (deviceChilds.item(j).getNodeName()) {
                    case "name": {
                        name = deviceChilds.item(j).getTextContent();
                        System.out.println(name);
                        break;
                    }
                    case "price": {
                        price = Integer.valueOf(deviceChilds.item(j).getTextContent());
                        System.out.println(price);
                        break;

                    }
                    case "origin": {
                        origin = deviceChilds.item(j).getTextContent();
                        System.out.println(origin);
                        break;

                    }
                    case "type": {
                        type = deviceChilds.item(j).getTextContent();
                        System.out.println(type);
                        break;

                    }
                    case "critical": {
                        critical = deviceChilds.item(j).getTextContent();
                        System.out.println(critical);
                        break;

                    }
                }
            }
            Device device = new Device(name,price,origin,type,critical);
            deviceList.add(device);
        }
    }

    private static Document buildDocument() throws Exception {
        File file = new File("src/homework2/task2/Device.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);

    }
}
