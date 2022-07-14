package FoodOrder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UserPage {
	static int userId = 100;
	static int billNo = 1111;
	Scanner sc = new Scanner(System.in);
	static HashMap<Integer, UserDetails> userMap = new HashMap<Integer, UserDetails>();
	static HashMap<Integer, HashMap<Integer, ArrayList<Object>>> orderMap = new HashMap<Integer, HashMap<Integer, ArrayList<Object>>>();

	public void selection() {
		System.out.println("\n  ------  Trio Food Order --------");
		System.out.print("\n1.Create Account      2. New User ");
		String option = sc.next();
		if (Validation.checkNumber(option)) {
			int choice = option.charAt(0) - '0';
			switch (choice) {
			case 1:
				login();
				break;
			case 2:
				createuserAccount();
				break;
			}
		}
	}

	private void login() {

		System.out.print("\n\tUser ID : ");
		String userID = sc.next();
		System.out.print("\tPassword : ");
		String password = sc.next();
		if (Validation.foodPriceCheck(userID)) {

			UserDetails top = userMap.get(Integer.parseInt(userID));
			if (top != null && password.equals(top.getPassword())) {
				String name = top.getUserName();
				userOption(Integer.parseInt(userID), name);
			} else {
				String message = top == null ? "~~~ Your Account is not Existing - Create a Account"
						: "~~~ Your Password is Wrong ~~~";
				System.out.println(message);

			}
		}
	}

	public void userOption(int userID) {
		int t = 1;
		HashMap<Integer, ArrayList<Object>> userOrderedFood = new HashMap<Integer, ArrayList<Object>>();
		ArrayList<Object> foodList = new ArrayList<Object>();
		String date = dateFinder();
		foodList.add(date);
		System.out.println("\n\t--Enter Your Foods code--");
		while (t == 1) {

			System.out.print("Food ID ");
			int foodId = sc.nextInt();
			if (foodIdFinder(foodId)) {
				System.out.print("Quantity ");
				int qty = sc.nextInt();
				foodList.add(foodId);
				foodList.add(qty);
			} else {
				System.out.println("Enter the valid Food Id");
			}
			System.out.println("\t \t for More orders : Press 1 ");
			t = sc.nextInt();
		}
		userOrderedFood.put(userId, foodList);
		int bill = ++billNo;
		orderMap.put(bill, userOrderedFood);
		System.out.println("Your Order Placed..Kindly Pay Your Bill");
		yourBill(bill, date);

	}

	public void yourBill(int bill, String date) {

		System.out.println("\n\t\t---- TRIO Food Order Bill---");
		System.out.println("\n\tBill No : " + bill + "\t \t \t Date : " + date);
		if (orderMap.containsKey(bill)) {
			for (Map.Entry<Integer, HashMap<Integer, ArrayList<Object>>> obj : orderMap.entrySet()) {
				if (bill == obj.getKey()) {
					for (Map.Entry<Integer, ArrayList<Object>> obj1 : obj.getValue().entrySet()) {
						long sum = 0;
						System.out.println(
								"\n---------------------------------------------------------------------------------");
						System.out.printf("|%10s %10s %10s %10s %10s", "FOOD CODE  |", "FOOD NAME  |", "FOOD PRICE|",
								"Quantity|", " FoodTotalPrice|");
						System.out.println(
								"\n---------------------------------------------------------------------------------");
						ArrayList<Object> food = obj1.getValue();
						for (int i = 1; i < food.size(); i++) {
							if (i % 2 != 0) {
								int foodKey = (int) food.get(i);
								int qty = (int) food.get(i + 1);
								for (Entry<Integer, FoodDetails> entry : FoodPage.foodMap.entrySet()) {
									if (entry.getKey() == foodKey) {
										FoodDetails foodDetails = entry.getValue();
										System.out.printf("\n%10s %14s %10s %10s %10s", foodKey, foodDetails.getName(),
												foodDetails.getPrice(), qty, foodDetails.getPrice() * qty);
										sum += foodDetails.getPrice() * qty;
									}
								}

							}
						}
						System.out.println("\n\n \t \t \t \t \t  Total Price " + sum);
						System.out.println("\n \t\t\t #### THANK YOU ####");

					}
				}
			}
		} else {
			System.out.println("Place your order First");
		}

	}

	public void foodList(int userID, String name) {

		System.out.println("\n\t\t ---NORTHINDIAN FOODS---");
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("|%10s %10s %10s %10s", " FOOD CODE |", " FOOD NAME |", " FOOD PRICE |", " FOOD TYPE |");
		System.out.println("\n-----------------------------------------------------------");
		for (Entry<Integer, FoodDetails> entry : FoodPage.foodMap.entrySet()) {
			FoodDetails foodDetails = entry.getValue();
			if (foodDetails.getType().toString().equals(FoodType.NORTHINDIAN.toString())) {
				System.out.printf("\n%10s %14s %10s %15ss", entry.getKey(), foodDetails.getName(),
						foodDetails.getPrice(), foodDetails.getType());
			}

		}

		System.out.println("\n\n\t\t --- SOUTHINDIAN FOODS ---");
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("|%5s %14s %10s %10s ", " FOOD CODE |", " FOOD NAME |", " FOOD PRICE |", " FOOD TYPE |");
		System.out.println("\n-----------------------------------------------------------");
		for (Entry<Integer, FoodDetails> entry : FoodPage.foodMap.entrySet()) {
			FoodDetails foodDetails = entry.getValue();
			if (foodDetails.getType().toString().equals(FoodType.SOUTHINDIAN.name().toString())) {
				System.out.printf("\n%10s %14s %10s %15s", entry.getKey(), foodDetails.getName(),
						foodDetails.getPrice(), foodDetails.getType());
			}
		}
		userOption(userId, name);

	}

	public void createuserAccount() {
		UserDetails details = new UserDetails();
		System.out.println("\n\t---- Create Your Account ----");
		boolean end = true;
		while (end) { // for name
			System.out.print("\nName ");
			String name = sc.nextLine();
			if (!Validation.checkName(name)) {
				System.out.println("\nName must contain 3 to 30 characters only");
			} else {
				details.setUserName(name);
				end = false;

			}
		}
		end = true;
		while (end) { // for mobile no
			System.out.print("Mobile ");
			String mobileno = sc.next();
			if (!Validation.checkMobileno(mobileno)) {
				System.out.println("10 Numbers Only allowed");
			} else {
				Long mobileNumber = Long.valueOf(mobileno);
				details.setMobileNumber(mobileNumber);
				end = false;
			}

		}
		System.out.print("Location ");
		sc.nextLine();
		details.setLocation(sc.nextLine());
		end = true;
		while (end) { // for password

			System.out.print("Password ");
			String password = sc.next();
			if (!Validation.checkPassword(password)) {
				System.out.println(
						"Password must contain 1 upper case 1 Lower case 1 Special Character and more than 5 characters");
			} else {
				details.setPassword(password);
			}
		}
		userMap.put(++userId, details);
		System.out.println("\n Account is created.Your Login ID is " + userId);

	}

	public void userOption(int userID, String name) {
		System.out.println("\n\n Welcome " + name.toUpperCase() + " Your Options are..");
		System.out.println("\n\t 1.View Food Menu \n\t 2.Order Your Foods \n\t 3.Bill");
		String option = sc.next();
		if (Validation.checkNumber(option)) {
			int choice = Integer.parseInt(option);
			switch (choice) {
			case 1:
				foodList(userID, name);
				break;
			case 2:
				userOption(userID);
				break;
			case 3:
				break;
			default:
				System.out.println("\t \t...Thank You..");
			}
		} else {
			System.out.println("Enters numbers Only..!!");
		}

	}

//	public void userDetailsDisplay(HashMap<Integer, UserDetails> userMap) {
//		for (Entry<Integer, UserDetails> entry : userMap.entrySet()) {
//			System.out.println("\n Your login id is "+entry.getKey()+" To login with this ID and Your Password");
//			UserDetails u = entry.getValue();
//			System.out.println(u.getUserName());
//			System.out.println(u.getMobileNumber());
//			System.out.println(u.getLocation());
//		}
//	}
	public static String dateFinder() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY");
		return formatter.format(date);
	}

	public boolean foodIdFinder(int foodId) {
		for (Entry<Integer, FoodDetails> entry : FoodPage.foodMap.entrySet()) {
			if (entry.getKey() == foodId) {
				return true;
			}
		}
		return false;
	}
}
