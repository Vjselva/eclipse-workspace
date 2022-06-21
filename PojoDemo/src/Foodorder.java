import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
class FoodList
{
	Scanner sc=new Scanner(System.in);
	public void userOption() {
	
		int t = 1;
		HashMap<Integer, ArrayList<Object>> userOrderedFood = new HashMap<Integer, ArrayList<Object>>();
		int userID=111;
		ArrayList<Object> foodList = new ArrayList<Object>();
		foodList.add("17/12/2022");
		System.out.println("\n    Enter Your Foods code");
		while (t==1) {
			
			System.out.print("Food ID ");
			int foodId = sc.nextInt();
			System.out.print("Quantity ");
			int qty = sc.nextInt();
			foodList.add(foodId);
			foodList.add(qty);
//			if (userOrderedFood.containsKey(userID)) {
//				userOrderedFood.get(userID).addAll(foodList);
//			} else {
//				userOrderedFood.put(userID, foodList);
//			}
			
			
			System.out.println("\t \t for More orders : Press 1 ");
			t=sc.nextInt();
		}
		userOrderedFood.put(userID, foodList);
		
		for(Entry<Integer, ArrayList<Object>> obj : userOrderedFood.entrySet())
		{
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}
}

public class Foodorder {
	public static void main(String[] args) {
		new FoodList().userOption();
	}
		
	}

}
