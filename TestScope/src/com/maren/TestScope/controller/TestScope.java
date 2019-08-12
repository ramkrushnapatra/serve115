package com.maren.TestScope.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestScope
 */
@WebServlet("/TestScope")
public class TestScope extends HttpServlet {
	private static final long serialVersionUID = 1L;
			
			String Username="";
			String Address="";
			String Email="";
			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
				Username=request.getParameter("username");
				Address=request.getParameter("address");
				Email=request.getParameter("email");
				
				setAttributes(request,response);
				RequestDispatcher rd=request.getRequestDispatcher("TestScope2");
				rd.forward(request, response);
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
			
		
		
	}


	private void setAttributes(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
				request.setAttribute("USERNAME", "Username");
				request.setAttribute("ADDRESS", "Address");
				request.setAttribute("EMAIL", "Email");
				
	}

}
