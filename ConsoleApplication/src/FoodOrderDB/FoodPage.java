package FoodOrderDB;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class FoodPage implements FoodVariety{
	
	static int foodId = 1000;
	static HashMap<Integer, FoodDetails> foodMap = new HashMap<Integer, FoodDetails>();

	public void addNewFood() {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			foodId += 1;
			FoodDetails food = new FoodDetails();
			System.out.println("\n\t*** Add new Food ***\n");
			System.out.print("Food Name ");
			food.setName(sc.nextLine());
			System.out.print("Food Price ");
			food.setPrice(sc.nextInt());
			System.out.print("Food Type : 1.North Indian    2. South Indian  ");
			int type = sc.nextInt();
			FoodType foodType = type == 1 ? FoodType.NORTHINDIAN : FoodType.SOUTHINDIAN;
			food.setType(foodType);
			foodMap.put(foodId, food);
			System.out.print("\n\t Press 5 to Contine... ");
			choice = sc.nextInt();
			sc.nextLine();
		} while (choice == 5);

	}

	public void foodDetailsDisplay(HashMap<Integer, FoodDetails> foodMap2) {
		System.out.println("\n\t\t ------- FOOD LIST -------\n");
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("|%10s %10s %10s %10s", "FOOD CODE  |", "FOOD NAME  |", "FOOD PRICE  |", "PRICE TYPE  |");
		System.out.println("\n-----------------------------------------------------------");
		for (Entry<Integer, FoodDetails> entry : foodMap.entrySet()) {
			int key = entry.getKey();
			FoodDetails foodDetails = entry.getValue();
			System.out.printf("\n%5s %14s %10s %20s", key, foodDetails.getName(), foodDetails.getPrice(),
					foodDetails.getType());
		}
		System.out.println("\n--------------------------------------------------------------");

	}

	@Override
	public void showFoodList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteExistingFood() {
		// TODO Auto-generated method stub

	}

}

class Admin extends FoodPage {
	static Scanner sc = new Scanner(System.in);

	public void login() {
		// Scanner sc=new Scanner(System.in);
		System.out.println("\n\t** Admin Login **\n");
		System.out.println("User Name  : Admin");
		System.out.print("Password   : ");
		String password = sc.next();
		if ((password.equals("admin"))) {
			System.out.println("\n\t****  .Welcome Admin.  **** ");
			adminChoice();
		} else {
			System.out.println("\n\t****  .Your Password is Wrong. ****");
		}

	}

	public void adminChoice() {

		System.out.println("\n1. Add Food and Its Details ");
		System.out.println("2. View Existing Food list ");
		System.out.println("3. Exit");
		System.out.println();
		int choice = sc.nextInt();
		FoodPage foodpage = new FoodPage();
		switch (choice) {
		case 1:
			foodpage.addNewFood();
			adminChoice();
			break;
		case 2:
			foodpage.foodDetailsDisplay(foodMap);
			adminChoice();
			break;
		case 3:
			MainContent.initialPage();
			break;
		}

	}

}
