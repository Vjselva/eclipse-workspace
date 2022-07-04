import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Datasave {

	void add() throws SQLException, ClassNotFoundException
	{
		int lev=0;
		String sub="malayalam";
		Connection con=DatabaseConnection.getInstance().getConnection();
		Statement stmt = con.createStatement();
		String sql="insert into level0(level_id,choice) values('"+lev+"','"+sub+"')";
		int result = stmt.executeUpdate(sql);
		if (result > 0) {
			System.out.println("\n--Your data's are inserted--");
		} else {
			System.out.println("\n--Your data's are inserted--");
		}
		
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Datasave ds=new Datasave();
		ds.add();
	}
	
}
