package com.maren.Monday;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Connection extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/jsp");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("Name");  
String p=request.getParameter("Age");  
String e=request.getParameter("Gender");  
String c=request.getParameter("Password");  

          
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con= (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
  
PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
ps.setString(3,e);  
ps.setString(4,c);  
          
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully registered...");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}

  
}  