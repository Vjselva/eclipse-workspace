package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String reg=request.getParameter("reg");
		String cname=request.getParameter("cname");
		String dept=request.getParameter("dept");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		String event=request.getParameter("event");
        System.out.println(fname);
		PrintWriter pw=response.getWriter();
		/*try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","root");
		PreparedStatement ps=con.prepareStatement("insert into events values(?,?,?,?,?,?,?,?)");
		ps.setString(1, fname);
		ps.setString(3, reg);
		ps.setString(4, cname);
		ps.setString(5, dept);
		ps.setString(6, email); 
		ps.setString(7, mobile);
		ps.setString(8, gender);
		ps.setString(9, event);
		int k=ps.executeUpdate();
		if(k>0)
		{
		pw.println("Data inserted successfully");
		}
		else
		{
		pw.println("Data inserted unsuccessfully");
		}
		}
		catch(Exception e)
		{
		pw.println(e);
		}*/
	}


	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
