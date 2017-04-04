package com.sist.model;

import javax.servlet.http.HttpServletRequest;
import com.sist.poket.*;
import java.util.*;

public class BookModel implements Model{

	@Override
	public String handlerRequest(HttpServletRequest request) throws Exception {
		
		List<poketmonVO> list = poketmonDAO.bookList();
		request.setAttribute("list", list);
		request.setAttribute("jsp", "change.jsp");
		request.setAttribute("book", "../book/book.jsp");
		
		
		return "main/main.jsp";
	}

}
