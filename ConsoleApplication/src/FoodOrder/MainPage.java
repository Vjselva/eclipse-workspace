package FoodOrder;

import java.util.Scanner;

public class MainPage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		while (end) {
			System.out.println("\n  --- WelCome To Food Order ---");
			System.out.print("\n1.Admin Login       2.User Login  ");
			int choice = sc.nextInt();
			switch (choice) 
			{
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
