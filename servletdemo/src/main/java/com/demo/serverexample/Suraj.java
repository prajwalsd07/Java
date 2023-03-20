package com.demo.serverexample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/suraj")
public class Suraj extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   
		resp.setContentType("text/html");
		resp.getWriter().write("<h1> Welcome to suraj web site</h1>");
		String driver = getServletContext().getInitParameter("driver");
		resp.getWriter().write(driver);
		
		
	} 

}
