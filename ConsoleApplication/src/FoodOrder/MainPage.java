package FoodOrder;

import java.util.Scanner;

public class MainPage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		while (end) {
			welcomePage();
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				new Admin().login();
				break;
			case 2:
				UserPage.selection();
			case 3:
				System.out.println("Thank You");
				end = false;
				break;
			}
		}
	}

	public static void welcomePage() 
	{
		
		System.out.println("\n----WelCome To Food Order----");
		System.out.println("\n1.Admin Login       2.User Login  ");
		
	}
}
