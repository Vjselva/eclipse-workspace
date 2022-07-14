package FoodOrder;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class FoodPage implements FoodVariety {

	static int foodId = 1000;
	static HashMap<Integer, FoodDetails> foodMap = new HashMap<Integer, FoodDetails>();

	public void addNewFood() {
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			foodId += 1;
			boolean end = true;
			FoodDetails food = new FoodDetails();
			System.out.println("\n\t*** Add new Food ***\n");
			System.out.print("Food Name ");
			food.setName(sc.nextLine());
			while (end) {
				System.out.print("Food Price ");
				String price = sc.next();
				if (!Validation.foodPriceCheck(price)) {
					System.out.println("\nNumbers only allowed with 5 digit");
				} else {
					int price1 = Integer.parseInt(price);
					food.setName(price);
					end = false;
				}

			}
			end = true;
			while (end) {
				System.out.print("Food Type : 1.North Indian    2. South Indian  ");
				String type = sc.next();
				if (!Validation.checkNumber(type)) {
					System.out.println("Enter a Valid choice");
				} else {
					if (Integer.parseInt(type) == 1 || Integer.parseInt(type) == 2) {
						FoodType foodType = Integer.parseInt(type) == 1 ? FoodType.NORTHINDIAN : FoodType.SOUTHINDIAN;
						food.setType(foodType);
						end = false;
					} else {
						System.out.println("\n Choice doesn't exist");
					}
				}
			}
			foodMap.put(foodId, food);
			System.out.print("\n\t Press Y to Contine... ");
			choice = sc.next();
			sc.nextLine();
		} while (choice.equals('Y'));

	}

	public void foodDetailsDisplay(HashMap<Integer, FoodDetails> foodMap2) {
		System.out.println("\n\t\t ------- FOOD LIST -------\n");
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("|%10s %10s %10s %10s", "FOOD CODE  |", "FOOD NAME  |", "FOOD PRICE  |", "PRICE TYPE  |");
		System.out.println("\n-----------------------------------------------------------");
		for (Entry<Integer, FoodDetails> entry : foodMap.entrySet()) {
			FoodDetails foodDetails = entry.getValue();
			System.out.printf("\n%5s %14s %10s %20s", entry.getKey(), foodDetails.getName(), foodDetails.getPrice(),
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
		Scanner sc = new Scanner(System.in);
		System.out.println("\n -- Remove from Food List --");
		System.out.println(" Food Id ");
		String sid = sc.next();
		int id = Integer.parseInt(sid);
		if (foodMap.containsKey(sid)) {
			foodMap.remove(sid);
		} else {
			System.out.println("\nFood ID not Exist in Food List");
		}
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
		System.out.println("3. Delete Items in Food List");
		System.out.println("4. Exit");
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
			foodpage.deleteExistingFood();
			break;
		case 4:
			MainContent.initialPage();
			break;
		}

	}
}
