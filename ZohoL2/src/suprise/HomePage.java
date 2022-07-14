package suprise;

import java.util.Scanner;

class Main {
	void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n  Fourte Game");
		System.out.println("\n1.admin  2.Player 3.Exit");
		int choice = sc.nextInt();
		admin admins=new admin();
		boolean end = true;
		
			switch (choice) {
			case 1:
				admins.adminMenu();
				break;
			case 2:
				admins.userPlay();
				break;
			case 3:
				System.out.println("Thank You Play more..!!");
				end=false;
			default:
				System.out.println("Thank You");

			}
		

	}
}

public class HomePage {

	public static void main(String[] args) {
		new Main().start();
	}

}
