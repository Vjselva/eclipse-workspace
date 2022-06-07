package FoodOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class UserPage {
	static int userId=100;
	public static void selection() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("   ------  User Login --------");
		System.out.println("1.Already a User      2. New User ");
		HashMap<Integer,UserDetails> userMap=new HashMap<Integer,UserDetails>();
		UserDetails details=new UserDetails();
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Please login");
			break;
		case 2:
			System.out.println("    Create Your Account");
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
			userDetailsDisplay(userMap);
			break;
		}
		
		
		
	}
	private static void userDetailsDisplay(HashMap<Integer, UserDetails> userMap) {
		// TODO Auto-generated method stub
		for(Entry<Integer,UserDetails> entry: userMap.entrySet() )
		{
			System.out.println(entry.getKey());
			UserDetails u=entry.getValue();
			System.out.println(u.getUserName());
			System.out.println(u.getMobileNumber());
			System.out.println(u.getLocation());
		
			
		}
		
	}
	 

}
