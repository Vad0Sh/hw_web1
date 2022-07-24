package homework1.task3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Root root = new Root();

        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
            return;
        }
        Node rootNode = doc.getFirstChild();

        NodeList rootChilds = rootNode.getChildNodes();
        String mainName = null;
        Node countryNode = null;
        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (rootChilds.item(i).getNodeName()) {
                case "name": {
                    mainName = rootChilds.item(i).getTextContent();
                    System.out.println(mainName);
                    break;
                }
                case "countries": {
                    countryNode = rootChilds.item(i);
                    break;
                }
            }
        }

        if (countryNode == null) {
            return;
        }
        List<Country> countryList = new ArrayList<>();
        NodeList countryChilds = countryNode.getChildNodes();
        for (int i = 0; i < countryChilds.getLength(); i++) {
            if (countryChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if (!countryChilds.item(i).getNodeName().equals("country")) {
                continue;
            }
            String name = "";
            String capital = "";
            String description = "";

            NodeList countChilds = countryChilds.item(i).getChildNodes();
            for (int j = 0; j < countChilds.getLength(); j++) {
                if (countChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                switch (countChilds.item(j).getNodeName()) {
                    case "name": {
                        name = countChilds.item(j).getTextContent();
                        System.out.println(name);
                        break;
                    }
                    case "capital": {
                        capital = countChilds.item(j).getTextContent();
                        System.out.println(capital);
                        break;

                    }
                    case "description": {
                        description = countChilds.item(j).getTextContent();
                        System.out.println(description);
                        break;

                    }
                }
            }
            Country country = new Country(name, capital, description);
            countryList.add(country);
        }
        root.setName(mainName);
        root.setCountry(countryList);

//        System.out.println(root.toString());
    }

    private static Document buildDocument() throws Exception {
        File file = new File("src/homework1/task3/country.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);

    }
}
