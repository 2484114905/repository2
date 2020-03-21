package code;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLutil {
    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = documentBuilder.parse(new File("src\\configuration.xml"));


            //获取类名
            NodeList nodeList = doc.getElementsByTagName("className");
            String calssname = nodeList.item(0).getTextContent();
            System.out.println(calssname);

            //返回对象
            Class c = Class.forName(calssname);
            Object obj = c.newInstance();
            return obj;
        }

        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
