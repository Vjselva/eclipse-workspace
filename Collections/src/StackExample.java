
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class StackExample {

	private Stack<SelectedOptions> backStack = new Stack<SelectedOptions>();

	public int language;

	public static void main(String args[]) throws SQLException, ClassNotFoundException {

		StackExample stackExample = new StackExample();
		stackExample.start();
	}

	private void start() throws SQLException, ClassNotFoundException {
		int choice;
		backStack.push(new SelectedOptions(0, 0));
		print(0, 0);
		do {
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Enter your option : ");
			choice = input.nextInt();
			if (choice == 9) {
				backStack.pop();

				if (backStack.isEmpty()) {
					break;
				}
			} else {
				if (backStack.peek().level + 1 == 1) {
					language = choice;
					// System.out.println(language);
				}
				backStack.push(new SelectedOptions(backStack.peek().level + 1, choice));
			}
			SelectedOptions top = backStack.peek();
			print(top.level, top.choice);

		} while (choice != 0);
		System.out.println("Thank you for visiting our website...");

	}

	private void print(int level, int choice) throws SQLException, ClassNotFoundException {

		for (String choiceString : getChoices(level, choice)) {
			System.out.println(choiceString);
		}
	}

	ArrayList<String> getChoices(int level, int choice) throws SQLException, ClassNotFoundException {
		
		ArrayList<String> choiceList = new ArrayList();
		Connection con = DatabaseConnection.getInstance().getConnection();
		Statement stmt = con.createStatement();
		if (level == 0) {

			ResultSet rs = stmt.executeQuery("Select choice from level0");
			addToChoiceList(rs, choiceList);

		} else if (level == 1) {

			ResultSet rs = stmt.executeQuery("Select choice from level1 where level_choiceid = " + choice);
			addToChoiceList(rs, choiceList);
			
		} else if (level == 2) {
			
			ResultSet rs = stmt.executeQuery(
					"Select choice from level3 where level1_id=" + language + " AND level_choiceid=" + choice);
			addToChoiceList(rs, choiceList);

		} else if (level == 3) {
			
			System.out.println("Your choosed Option Sucessfully Updated");
			System.out.println("9-Back");
			System.out.println("0-Exit");
		}

		return choiceList;
	}

	void addToChoiceList(ResultSet rs, ArrayList<String> choiceList) throws SQLException {
		
		rs.toString();
		while (rs.next()) {
			choiceList.add(rs.getString(1));
		}
		choiceList.add("9.Back");
		choiceList.add("0.Exit");

	}

	static class SelectedOptions {
		
		private int level;
		private int choice;

		SelectedOptions(int level, int choice) {
			this.level = level;
			this.choice = choice;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getChoice() {
			return choice;
		}

		public void setChoice(int choice) {
			this.choice = choice;
		}

	}
}