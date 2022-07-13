package Mail;

import java.util.Scanner;

class Main {
	void start() {

		boolean end = true;
		while (end)
		{
			System.out.println("\t\t ZMail ");
			System.out.println("1.Create Z-Mail account\t\t 2.Login");
			Scanner sc = new Scanner(System.in);
			String option = sc.next();

			if (MailValidation.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				Mail mail = new Mail();
				switch (choice) {
				case 1:
					mail.registration();
					break;
				case 2:
					mail.login();
					break;
				default:
					System.out.println("\nEnter valid Options Only");
				}
			} else {
				System.out.println("\nEnter only Numbers");
			}

		}

	}
}

public class HomePage {

	public static void main(String[] args) {
		new Main().start();
	}

}
