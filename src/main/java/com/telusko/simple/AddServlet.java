package com.telusko.simple;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	/*
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1 + num2;
		
		//System.out.println("Result is : "+sum);
		
	    PrintWriter out = res.getWriter();
		out.println("Result : "+sum);
	}*/
	
	/*
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int NUM_1 = Integer.parseInt(req.getParameter("num1"));
		int NUM_2 = Integer.parseInt(req.getParameter("num2"));
		
		int SUM = NUM_1 + NUM_2;
		
		PrintWriter out = res.getWriter();
		out.println("Result : "+ SUM);
		
	}*/
	
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int NUM_1 = Integer.parseInt(req.getParameter("num1"));
		int NUM_2 = Integer.parseInt(req.getParameter("num2"));
		
		int SUM = NUM_1 + NUM_2;
		
//		PrintWriter out = res.getWriter();
//		out.println("Result : "+ SUM);
		
		// 1. Request Dispatcher or 2. Redirect 
		/*
		req.setAttribute("square", SUM); // sending the sum value to square servlet
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		*/
		
		// 2. Send Redirect concept
		
		//res.sendRedirect("square?k="+SUM); // URL Rewriting 
		
		// 3. Send Redirect with Session management
		/*
		HttpSession session = req.getSession();
		session.setAttribute("k", SUM);
		
		res.sendRedirect("square");
		*/
		
		// 4. Send Redirect with cookies
		
		Cookie cookie = new Cookie("k",SUM+"");
		res.addCookie(cookie);
		
		res.sendRedirect("square");
	}
}
