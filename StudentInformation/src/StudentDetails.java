import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		ArrayList<Student> std = new ArrayList<>();
		String str ="";
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
				System.out.println(std);
			}
			System.out.println("If you want to continue press 1. ");
			ch1 = sc.nextInt();
			sc.nextLine();

		} while (ch1 == 1);
		addInformation(std);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from information");
			System.out.println("\t------------------------------------------------------------------------------");
			System.out.println("\t| ID | Name  | DOB	 | Gender |    Mobile  | age	| mark	| Grade	|");
			System.out.println("\t------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.println("\t| " + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "\t" + rs.getInt(7) + "\t"
						+ rs.getString(8) + "|");
			}
			System.out.println("\t------------------------------------------------------------------------------");
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void addInformation(ArrayList<Student> std) throws SQLException, ClassNotFoundException {
		String userId = "Selva001";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details", "root", "");
				Statement stmt = con.createStatement();) {
			for (Student obj : std) {
				System.out.println(obj);
				String sql = "insert into information" + "(name,dob,gender,mobile,age,mark,grade,created_by)"
						+ "values('" + obj.getName() + "','" + obj.getDob() + "','" + obj.getGender() + "','"
						+ obj.getMobile() + "','" + obj.getAge() + "','" + obj.getMark() + "','" + obj.getGrade()
						+ "','" + userId + "')";
				stmt.executeUpdate(sql);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
