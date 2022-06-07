package interfaceex;

import java.util.Scanner;

public interface staticDefault
{	
	void display();
	default void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		 int x=sc.nextInt();
		System.out.println("default method value is"+x);
	}
	public static void print()
	{
		System.out.println("It's a static print method");
	}
}


