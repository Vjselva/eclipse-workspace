package FlightBooking;


import java.util.Scanner;

public class HomePage {
	public static void main(String args[]) {

		MainContent.initialPage();
	}
}

class MainContent {

	public static void initialPage() {
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		while (end) {
			System.out.println("\n  --- WelCome Z-Flight TicketBooking ---");
			System.out.print("\n  1.Admin Login       2.User Login  ");
			String option = sc.next();
			if (FlightValidation.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				switch (choice) {
				case 1:
					new FlightBooking().addFlightDetails();
					break;
				case 2:
					new FlightBooking().selection();
					break;
				case 3:
					System.out.println("Thank You");
					end = false;
					break;
				}
			}
			else
			{
				System.out.println("Enter a Valid options");
			}
		}
	}

}
