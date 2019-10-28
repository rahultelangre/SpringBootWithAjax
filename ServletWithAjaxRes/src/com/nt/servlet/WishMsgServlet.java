package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishMsgServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		
		if(name!=null && !"".equals(name)) {
			String msg="Hello"+name;
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.write(msg);
		}
	}

}
