package ATM;

import java.util.Scanner;

class Main {
	void start() {
		boolean end = true;
		User userobject = new User();
		while (end) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n\t -- Z-ATM --");
			System.out.print("\n1.Login   2.New User 	3.Exit ");
			String option = sc.next();
			if (ValidationPage.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				switch (choice) {
				case 1:
					userobject.login();
					break;
				case 2:
					userobject.createAccount();
					break;
				case 3:
					System.out.println("\t.. Thank You Save Trees ..");
					end = false;
					break;

				}
			} else {
				System.out.println("$-- Please enter vaid options --$");
			}

		}
	}

}

public class MainPage {
	public static void main(String[] args) {
		new Main().start();
	}

}
