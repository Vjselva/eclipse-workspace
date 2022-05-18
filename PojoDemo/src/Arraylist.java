import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
	public static void main(String args[])
	{
		ArrayList<Object> list1 = new ArrayList<Object>();  
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the employee count: ");
		int t=obj.nextInt();
		for(int i=1;i<=t;i++)
		{   System.out.println("enter the name: ");
			String name=obj.next();
			list1.add(name);
			System.out.println("enter the age: ");
			int age=obj.nextInt();
			list1.add(age);
			System.out.println("enter the phone number: ");
			long phno=obj.nextLong();
			list1.add(phno);
			for (Object j:list1)
			{
				System.out.print(j+" ");
			}
			list1.clear();
		}
		
	}
}
