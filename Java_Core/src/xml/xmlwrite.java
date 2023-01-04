package xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class xmlwrite {
 
    public static final String xmlFilePath = "emp.xml";
 
    public static void main(String argv[]) {
 
        try {
 
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
 
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
 
            Document document = documentBuilder.newDocument();
 
            // root element
            Element root = document.createElement("company");
            document.appendChild(root);
 
            // employee element
            Element employee = document.createElement("employee");
 
            root.appendChild(employee);
 
            // id element
            Attr attr = document.createAttribute("id");
            attr.setValue("20");
            employee.setAttributeNode(attr);
 
            // firstname element
            Element firstName = document.createElement("firstname");
            firstName.appendChild(document.createTextNode("kaushik"));
            employee.appendChild(firstName);
 
            // lastname element
            Element lastname = document.createElement("lastname");
            lastname.appendChild(document.createTextNode("reddy"));
            employee.appendChild(lastname);
 
            // email element
            Element email = document.createElement("email");
            email.appendChild(document.createTextNode("kausredd2022@microsoft.org"));
            employee.appendChild(email);
 
            // department elements
            Element department = document.createElement("department");
            department.appendChild(document.createTextNode("Business"));
            employee.appendChild(department);
 
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
 
            System.out.println("Completed");
 
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
