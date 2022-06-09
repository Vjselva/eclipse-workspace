package FoodOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UserPage {
	static int userId = 100;
	Scanner sc = new Scanner(System.in);
	static HashMap<Integer, UserDetails> userMap = new HashMap<Integer, UserDetails>();

	public void selection() {
		System.out.println("\n  ------  User Login --------");
		System.out.print("1.Already a User      2. New User ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			login();
			break;
		case 2:
			createuserAccount();
			break;
		}
	}

	private void login() {
		
		System.out.print("\n \tUser ID : ");
		int userID=sc.nextInt();
		System.out.print("\n \tPassword : ");
		String password=sc.next();
		UserDetails top=userMap.get(userID);
		if(top!=null && password.equals(top.getPassword()))
		{		String name=top.getUserName();
				foodList(userID,name);
		}
		
	}

	public void foodList(int userID,String name) 
	{
		System.out.println("\n Welcome " +name );
		System.out.println("\n NORTHINDIAN FOODS");
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("|%10s %10s %10s ", "FOOD CODE  |", "FOOD NAME  |", "FOOD PRICE  |"); 
		System.out.println("\n-----------------------------------------------------------");
		for(Entry<Integer,FoodDetails> entry : FoodPage.foodMap.entrySet())
		{
			FoodDetails foodDetails=entry.getValue();
			if(foodDetails.getType().equals(FoodType.NORTHINDIAN.name()))
			{
				System.out.printf("\n%5s %14s %10s",entry.getKey(), foodDetails.getName(),foodDetails.getPrice());
			}
		}
		System.out.println("\n SOUTHINDIAN FOODS");
		System.out.println("\n-----------------------------------------------------------");
		System.out.printf("|%10s %10s %10s ", "FOOD CODE  |", "FOOD NAME  |", "FOOD PRICE  |"); 
		System.out.println("\n-----------------------------------------------------------");
		for(Entry<Integer,FoodDetails> entry : FoodPage.foodMap.entrySet())
		{
			FoodDetails foodDetails=entry.getValue();
			if(foodDetails.getType().equals(FoodType.SOUTHINDIAN.name()))
			{
				System.out.printf("\n%5s %14s %10s",entry.getKey(), foodDetails.getName(),foodDetails.getPrice());
			}
		}
		
	}

	public void createuserAccount() {
		UserDetails details = new UserDetails();
		System.out.println("\n   Create Your Account");
		System.out.print("\nName ");
		sc.nextLine();
		details.setUserName(sc.nextLine());
		System.out.print("Mobile ");
		details.setMobileNumber(sc.nextLong());
		System.out.print("Location ");
		sc.nextLine();
		details.setLocation(sc.nextLine());
		System.out.print("Password ");
		details.setPassword(sc.next());
		userMap.put(++userId, details);
		System.out.println("\n Account is created.Your Login ID is "+userId);

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
}
