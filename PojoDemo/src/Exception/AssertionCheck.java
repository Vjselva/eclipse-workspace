package Exception;

import java.util.Scanner;

class Assertion
{
	void validateByAssertion()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Passoword ");
		String password=sc.next();
		assert password.length()==8 : "There are only 8 characters in a passoword";
		System.out.println("Your password is strong .");
	}
}

public class AssertionCheck {
	public static void main(String[] args) {
		new Assertion().validateByAssertion();
	}

}
