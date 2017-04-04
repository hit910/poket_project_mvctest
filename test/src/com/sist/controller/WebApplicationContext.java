package com.sist.controller;

import java.io.File;
import java.util.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/*
 * 	SAX (Simple API for XML) : DOM과 마찬가지로 XML을 조작하는 프로그램을 작성할 때 표준으로 제공받을 수 있는 API
 * 													    DOM은 문서 전체를 메모리에 읽어 들여 조작하는 방식 ==> 트리기반 API
 * 																단점 : XML 문서가 커질 경우 메모리 소모가 
 * 														SAX는 문서를 처음부터 차례로 읽어가면서 처리하는 방식 ==>이벤트 기반 API
 * 																DOM의 단점을 보완하거나 적은 메모리를 가진 시스템에서 XML 문서를 처리 가능함
 * 
 * 	DOM 과 SAX의 처리방식 비교
 * 		DOM : 트리기반 API
 * 		SAX : 이벤트 기반 API, 파싱 이벤트를 callback을 통해 앱에 직접 전달하는 구조
 */

public class WebApplicationContext {
	private Map clsMap=new HashMap();
	
	public WebApplicationContext(String path){
		try{
			SAXParserFactory spf=SAXParserFactory.newInstance();
			//XML문서 처리에 필요한 SAXParser를 생성,SAXParser가 파싱하는데
			//필요한 여러 선택사항을 만드는 역할.
			SAXParser sp=spf.newSAXParser();	
			//SAXParser 객체가 XML 문서를 파싱하려면
			//이벤트 처리기인 DefaultHandler로 이벤트가 전달되어
			//미리 정의된 이벤트 메소드를 호출함.
			HandlerMapping hm=new HandlerMapping();
			sp.parse(new File(path), hm);
			clsMap=hm.map;
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public Object getBean(String key){
		return clsMap.get(key);
	}
}
