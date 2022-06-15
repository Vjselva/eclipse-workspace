package ZohoQusetions;

import java.util.Scanner;

public class BetweenValues {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array count ");
	int count=sc.nextInt();
	System.out.print("Enter x and Y values ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("Enter the array Values ");
	for(int i=0;i<count;i++)
	{
		int temp=sc.nextInt();
		if(temp>x && temp<y)
		{
			System.out.print(temp);
		}
	}

	
	
	
	}

}
