<%@ page import="java.sql.*"%>
<%
String name=request.getParameter("rname");
String age=request.getParameter("age");
String gender=request.getParameter("gender");
String pass=request.getParameter("reenterpass");
String pass1=request.getParameter("pass");


out.println(name+age+gender+pass+pass1);




%>