package com.telusko.simple;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("hi <br>");
		
		/*
		// Servlet Context Example is used to go for the Share values to all servlets
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str); // Navin
		*/
		
		// Servlet Config Example is used to go for the different values for different Servlets
		ServletConfig cfg = getServletConfig();
		String str1 = cfg.getInitParameter("name");
		out.println(str1);
		
	}

}
