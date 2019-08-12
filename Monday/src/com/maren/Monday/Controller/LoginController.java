package com.maren.Monday.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("UserId");
		String pw=request.getParameter("Password");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Mahanand18");
			
			PreparedStatement ps=con.prepareStatement("select UserId,Password from Student where UserId=? Password=?");
			ps.setString(1,un);
			ps.setString(2, pw);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				response.sendRedirect("LoginUser.jsp");
				return ;
			}
			response.sendRedirect("error.jsp");
			return;
				
			}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
			
		}
	}

}
