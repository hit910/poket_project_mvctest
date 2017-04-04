package com.sist.controller;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.*;
/*
 *  SAX
<?xml version="1.0" encoding="UTF-8"?>		startDocument() 문서가 시작
<beans>										startElement()
	<bean id="" class=""/>					startElement() endElement()
	<bean id="" class=""/>					startElement() endElement()
	<bean id="" class=""/>					startElement() endElement()
	<bean id="" class=""/>					startElement() endElement()
	<bean id="" class=""/>					startElement() endElement()
	<bean id="" class=""/>					startElement() endElement()
</beans> *  								endElement()
 * 											endDocument()
 */

public class HandlerMapping extends DefaultHandler{
	Map map=new HashMap();
	
	@Override
	public void startElement(String uri, String localName, 
			String qName, Attributes attr) throws SAXException {
		try{
			if(qName.equals("bean")){
				String id=attr.getValue("id");
				String cls=attr.getValue("class");
				Class clsName=Class.forName(cls);
				Object obj=clsName.newInstance();		//
				map.put(id, obj);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}












