import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseConnection {
public static void main(String[] args){

try
{
Connection connection=DriverManager.getConnection( "jdbc:mysql://localhost:127.0.0.1/student_details","root","");
Statement statement=connection.createStatement(); 
ResultSet resultSet=statement.executeQuery("Select * from information"); 
while(resultSet.next())
{
System.out.printf("%d\t%s\t\n", resultSet.getInt(1), resultSet.getString(2));
} 
resultSet.close();
statement.close();
connection.close();
} 
catch (SQLException ex) 
{
	System.out.println(ex);
}
}
}