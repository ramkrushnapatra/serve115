package com.maren.TestServlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username =request.getParameter("USERNAME");
		String password= request.getParameter("PASSWORD");
		if(username.contentEquals("NITISH") && password.contentEquals("QWERTY"))
		{
			PrintWriter out=response.getWriter();
			out.println("USERNAME IS CORRECT");
			
		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println("USERNAME and PASSWORD is INCORRECT");
		}
	}

}
