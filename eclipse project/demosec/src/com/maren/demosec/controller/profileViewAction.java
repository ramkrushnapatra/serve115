package com.maren.demosec.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maren.demosec.model.Profile;


@WebServlet("/profileViewAction")
public class profileViewAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = (int) request.getAttribute("RES");
		PrintWriter out = response.getWriter();
		if (res == 0)
			out.println("There is some problem ;  Try again .");
		else
			out.println("Data Successfully inserted");
		
		out.print(" <br/> The Datas are");
		List<Profile> list = new ProfileDao().fetchAll();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Profile profile = (Profile) iterator.next();
			out.println("Name : "+ profile.getName() +" Userid : "+ profile.getUserid()+ "mobile "+ profile.getMobile());
	}

}
