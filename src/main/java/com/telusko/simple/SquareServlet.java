package com.telusko.simple;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		/* 
		
		// this instructions is executed when RequestDispatcher method is called only 
		int num_square = (int) request.getAttribute("square");
		num_square = num_square * num_square;
		PrintWriter out = response.getWriter();
		out.println("Hello to Square");
		out.println("Result : " + num_square);
		*/
		
		
		/*
		// this instruction is executed when and only sendRedirect method.
		int k = Integer.parseInt(request.getParameter("k"));
		k = k * k;
		PrintWriter out = response.getWriter();
		out.println("Result is "+k);
		System.out.println("The Square is called");
		*/
		
		/*
		HttpSession session = request.getSession();
		
		int k = (int) session.getAttribute("k");
//		session.removeAttribute("k");
		
		k = k * k;
		PrintWriter out = response.getWriter();
		out.println("Result : "+k);
*/
		
		int k = 0;
		Cookie arrcookie[] = request.getCookies();
		
		
		for (Cookie c: arrcookie) {
			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		k = k * k;
		
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='cyon'>");
		
		out.println("<h1>Result is "+k+"</h1>");
		out.println("</body></html>");
	}

}
