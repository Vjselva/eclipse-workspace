import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	private static DBconnection instance;
	private Connection connection;
	private String url="jdbc:mysql://localhost:3306/student_details";
	private String username="root";
	private String password="root";
	
	private DBconnection()
	{
		
	}
	
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static DBconnection getInstance()
	{
		if(instance==null)
		{
			instance=new DBconnection();
		}
		return instance;
	}

}
