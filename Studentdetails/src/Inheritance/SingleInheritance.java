package Inheritance;

import java.util.Scanner;

class Calculation { 											// super class
	
	int number1,number2,result;
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		number1=sc.nextInt();
		number2=sc.nextInt();
		addition(number1,number2);
		subtraction(number1,number2);
		
	}

	public void addition(int number1, int number2) {
		result = number1 + number2;
		System.out.println("The sum of the given numbers:" + result);
	}

	public void subtraction(int number1, int number2) {
		result = number1 - number2;
		System.out.println("The difference between the given numbers:" + result);
	}
}

public class SingleInheritance extends Calculation { 			// sub classs
	
	
	public void multiplication(int number1, int number2) {
		
		System.out.println("The product of the given numbers:" + number1 * number2);
	}

	public static void main(String args[]) {
		SingleInheritance demo = new SingleInheritance(); 		// object created for sub class
		demo.multiplication(demo.number1, demo.number2);
	}
}