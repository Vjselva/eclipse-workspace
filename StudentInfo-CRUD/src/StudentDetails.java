import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

class DatabaseConnection {

	Scanner sc = new Scanner(System.in);
	Connection con = DBconnection.getInstance().getConnection();

	public void view() throws ClassNotFoundException, SQLException {
		System.out.println("\n\n\t\t--- CRUD OPERATION --- ");
		System.out.println("1. Add student Information in DB");
		System.out.println("2. View student Information ");
		System.out.println("3. Delete student Information  ");
		System.out.println("4. Update student Information ");
		int ch;
		do {
			System.out.print("\n \tEnter your options ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				getInput();
				break;
			case 2:
				viewInformation();
				break;
			case 3:
				deleteInformation();
				break;
			case 4:
				updateInformation();
				break;
			default:
				System.out.println("Please enter valid choice");
			}
			System.out.print("\nIf you want to continue PRESS 0 ");
			ch = sc.nextInt();
		} while (ch == 0);
	}

	public void getInput() throws ClassNotFoundException, SQLException {

		ArrayList<Student> std = new ArrayList<>();
		String str = "";
		int stuId = 001;
		int ch1;
		do {
			Student student = new Student();
			System.out.println("Enter Student Name DateofBirth Gender Mobile Age CS-Mark :");
			str = sc.nextLine();
			String[] names = str.split(" ");
			if (names.length > 1) {
				student.setName(names[0]);
				student.setDob(names[1]);
				student.setGender(names[2]);
				student.setMobile(names[3]);
				student.setAge(Integer.parseInt(names[4]));
				int mark = Integer.parseInt(names[5]);
				student.setMark(mark);
				String result = (mark >= 80 && mark <= 100) ? "A Grade"
						: (mark >= 60 && mark < 80) ? "B Grade" : (mark >= 40 && mark < 60) ? "C Grade" : "fail";
				student.setGrade(result);
				std.add(student);
				// System.out.println(std);
			}
			System.out.println("\nIf you want to continue press 1. ");
			ch1 = sc.nextInt();
			sc.nextLine();

		} while (ch1 == 1);

	}

	public void addInformation(ArrayList<Student> std) throws SQLException, ClassNotFoundException {
		String userId = "Selva001";
		Statement stmt = con.createStatement();
		for (Student obj : std) {

			String sql = "insert into information(stu_name,dob,gender,mobile,age,mark,grade,created_by) values('"
					+ obj.getName() + "','" + obj.getDob() + "','" + obj.getGender() + "','" + obj.getMobile() + "','"
					+ obj.getAge() + "','" + obj.getMark() + "','" + obj.getGrade() + "','" + userId + "')";
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("\n--Your data's are inserted--");
			} else {
				System.out.println("\n--Your data's are inserted--");
			}

		}

	}

	void viewInformation() {
		try {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from information");
			rs.toString();
			System.out.println("\t------------------------------------------------------------------------------");
			System.out.println("\t| ID | Name  | DOB	 | Gender |    Mobile  | age	| mark	| Grade	|");
			System.out.println("\t------------------------------------------------------------------------------");
			while (rs.next()) {
				// System.out.println(rs.toString());
				System.out.println("\t| " + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "\t" + rs.getInt(7) + "\t"
						+ rs.getString(8) + "|");
			}
			System.out.println("\t------------------------------------------------------------------------------");
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public void deleteInformation() throws ClassNotFoundException, SQLException {
		System.out.print("Enter Student id which you going to be delete ");
		int id = sc.nextInt();
		if (checkIDExist(id)) {
			try {
				Statement stmt = con.createStatement();
				String sql = "delete from information where id=" + id;
				stmt.executeUpdate(sql);
				System.out.println("\n$-- Record deleted successfully --$");
			} catch (Exception e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("$-- Student not Exist. Please Enter valid student ID --$");
		}

	}

	void updateInformation() throws SQLException {
		Scanner sc = new Scanner(System.in);
		Statement stmt = con.createStatement();
		System.out.print("\nEnter Student ID  ");
		int id = sc.nextInt();
		if (checkIDExist(id))

		{
			int ch;
			do {
				String sql;
				System.out.println("\n1.Name		2.Age		3.Mobile No");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.print("\nEnter Update Name ");
					String name = sc.nextLine();
					sql = "update information set stu_name=" + name + " where id=" + id;
					stmt.executeUpdate(sql);
					break;
				case 2:
					System.out.print("\nEnter Update Age ");
					int age = sc.nextInt();
					sql = "update information set age=" + age + " where id=" + id;
					stmt.executeUpdate(sql);
					break;
				case 3:
					System.out.print("\nEnter Update MobileNo ");
					long mobileno = sc.nextLong();
					sql = "update information set mobile=" + mobileno + " where id=" + id;
					stmt.executeUpdate(sql);
					break;
				default:
					System.out.println("\nPlease enter the valid choices only...");
				}

				System.out.print("\nIf you want to Update again press 0 ");
				ch = sc.nextInt();

			} while (ch == 0);
		}

	}

	boolean checkIDExist(int id) throws SQLException {

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from information where id=" + id);
		if (rs != null) {
			return true;
		}
		return false;

	}
}

public class StudentDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		new DatabaseConnection().view();

	}

}
