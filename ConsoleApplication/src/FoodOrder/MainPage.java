package FoodOrder;

import java.util.Scanner;

public class MainPage {
	public static void main(String args[]) {

		MainContent.initialPage();
	}
}

class MainContent {

	public static void initialPage() {
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		while (end) {
			System.out.println("\n  --- WelCome To Food Order ---");
			System.out.print("\n1.Admin Login       2.User Login  ");
			String option = sc.next();
			if (Validation.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				switch (choice) {
				case 1:
					new Admin().login();
					break;
				case 2:
					new UserPage().selection();
					break;
				case 3:
					System.out.println("Thank You");
					end = false;
					break;
				}
			}
		}
	}

}
