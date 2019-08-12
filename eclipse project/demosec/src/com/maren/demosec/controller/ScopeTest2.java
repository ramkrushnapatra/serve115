package com.maren.demosec.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest2
 */
@WebServlet("/ScopeTest2")
public class ScopeTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String req =(String) request.getAttribute("REQUEST");
		String ses = (String) request.getSession().getAttribute("SESSION");
		String app = (String) getServletContext().getAttribute("APP");
		PrintWriter out= response.getWriter();
		out.println("Req:"+req);
		out.println("Session:"+req);
		out.println("Aplication:"+req);
	}

}
