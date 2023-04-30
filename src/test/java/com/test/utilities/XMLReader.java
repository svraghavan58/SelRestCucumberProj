package com.test.utilities;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {
	
	public String getXMLValue(String fileName,String elementName)
	{
		String xmlValue=null;
		File file=new File(fileName);
		try
		{
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse(file);
			doc.getDocumentElement().normalize();
			doc.getDocumentElement().getNodeName();
			NodeList list = doc.getElementsByTagName(elementName);
			for(int i=0;i<list.getLength();i++)
			{
				Node node=list.item(i);
				if(node.getNodeType()==Node.ELEMENT_NODE)
				{
					Element element=(Element) node;
					xmlValue=element.getElementsByTagName("loactorType").item(0).getTextContent()+"~"+element.getElementsByTagName("locatorValue").item(0).getTextContent();
					
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return xmlValue;
	}

	public String getXMLValues(String fileName,String elementName)
	{
		File file=new File(fileName);
		String xmlValue=null;
		try
		{
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse(file);
			NodeList list=doc.getElementsByTagName(elementName);
			for(int i=0;i<list.getLength();i++)
			{
				Node node=list.item(i);
				if(node.getNodeType()==Node.ELEMENT_NODE)
				{
					Element element=(Element) node;
					xmlValue=element.getAttribute("locatorType")+"~"+element.getAttribute("locatorValue");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return xmlValue;
	}
}
