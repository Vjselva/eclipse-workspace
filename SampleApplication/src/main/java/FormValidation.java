
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Statement;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phonenumber = request.getParameter("phonenumber");
		String gender = request.getParameter("gender");
		String language = request.getParameter("language");
		int zipcode = Integer.valueOf(request.getParameter("zipcode"));
		String about = request.getParameter("about");
		String resultstr = "--wrong--";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
			Statement stmt = con.createStatement();
			String sql = "insert into info(name,email,password,phonenumber,gender,language,zipcode,about,created_by) values('"
					+ name + "','" + email + "','" + password + "','" + phonenumber + "','" + gender + "','" + language
					+ "','" + zipcode + "','" + about + "','" + name + "')";

			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				resultstr = "Sucessfully Registered";

			} else {
				resultstr = "Registration not complete try again later";
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		PrintWriter pw = response.getWriter();
		pw.println(resultstr);
		doGet(request, response);
	}

}
