
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static DatabaseConnection instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/stack";
	private String username = "root";
	private String password = "root";

	private DatabaseConnection() {

	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public static DatabaseConnection getInstance() throws SQLException, ClassNotFoundException {
		if (instance == null) {
			instance = new DatabaseConnection();
		} else if (instance.getConnection().isClosed()) {
			instance = new DatabaseConnection();
		}

		return instance;
	}
}
