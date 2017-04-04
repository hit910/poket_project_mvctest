package com.sist.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.sist.poket.poketmonDAO;
import com.sist.poket.poketmonVO;

public class MainModel implements Model{
	@Override
	public String handlerRequest(HttpServletRequest request) throws Exception {
		
		List<poketmonVO> list = poketmonDAO.bookList();
		request.setAttribute("jsp", "default.jsp");
		request.setAttribute("list", list);
		return "main/main.jsp";
	}
	
}
