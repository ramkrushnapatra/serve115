package com.maren.demosec.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeTest
 */
@WebServlet("/scopeTest")
public class ScopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("REQUEST","Request Scope");
		request.getSession().setAttribute("SESSION","Session Scope");
		getServletContext().setAttribute("APP","Application Scope");
		request.getRequestDispatcher("/ScopeTest2").forward(request,response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
