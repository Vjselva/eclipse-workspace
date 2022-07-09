package com.register.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormValidation
 */
@WebServlet("/FormValidation")
public class FormValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		long phonenumber=Long.parseLong(request.getParameter("phonenumber"));;
		String gender=request.getParameter("gender");
		String language=request.getParameter("language");
		int zipcode=Integer.valueOf(request.getParameter("zipcode"));
		String about=request.getParameter("about");
        System.out.println(name);
		PrintWriter pw=response.getWriter();
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
			Statement stmt = con.createStatement();
			String sql = "insert into info(name,email,password,phonenumber,gender,language,zipcode,about,created_by) values('"
					+ name+ "','" + email + "','" + password + "','" + phonenumber + "','"
					+ gender + "','" + language + "','" + zipcode + "','" + about + "','"+name+"')";
			
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("\n--Sucessfully Registered--");
			} else {
				System.out.println("\n--Registration not complete try again later--");
			}

		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
