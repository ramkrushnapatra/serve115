package com.maren.TestScope2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestScope2
 */
@WebServlet("/TestScope2")
public class TestScope2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String Username=(String)request.getAttribute("USERNAME");
			String Address=(String)request.getAttribute("ADDRESS");
			String Email=(String)request.getAttribute("EMAIL");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("Name:"+Username);
			out.println("Address:"+Address);
			out.println("Email:"+Email);
			out.close();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

}
