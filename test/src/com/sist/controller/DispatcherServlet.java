package com.sist.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.model.*;

public class DispatcherServlet extends HttpServlet{
	
	private WebApplicationContext wc;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String path=config.getInitParameter("xmlpath");
		wc=new WebApplicationContext(path);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String cmd=request.getRequestURI();
			cmd=cmd.substring(request.getContextPath().length()+1, 
					cmd.lastIndexOf('.'));			//main
			Model model=(Model) wc.getBean(cmd);	//MainModel
			System.out.println(model);
			String jsp=model.handlerRequest(request);  //main/main.jsp
			
			RequestDispatcher rd=request.getRequestDispatcher(jsp);
			rd.forward(request, response);
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}













