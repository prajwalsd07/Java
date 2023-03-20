package com.demo.serverexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/controller")
public class Controller extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
		String name = req.getParameter("username");
		PrintWriter out = resp.getWriter();

		switch (name) {
		case "prajwal":
			req.getRequestDispatcher("/prajwal").forward(req, resp);
			break;

		case "suraj":
			req.getRequestDispatcher("/suraj").include(req, resp);
			out.write("i am back to controller");
			break;

		default:
			out.write("404 error");
		}

	}

}
