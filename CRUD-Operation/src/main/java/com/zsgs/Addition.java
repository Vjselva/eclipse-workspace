package com.zsgs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int firstValue = Integer.parseInt(request.getParameter("s1"));
		int secondValue = Integer.parseInt(request.getParameter("s2"));
		int sum = firstValue + secondValue;
		PrintWriter printWriter = response.getWriter();
		printWriter.print(sum);
	}
}