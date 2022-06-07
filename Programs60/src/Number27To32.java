import java.util.Scanner;

class Number implements NumberCheck {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		int number, number1, number2;
		System.out.println("Enter three Numbers ");
		number = sc.nextInt();
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println("Enter the Character ");
		sc.nextLine();
		char character = sc.next().charAt(0);
		swapTwoNumber(number, number1);
		evenOrOdd(number);
		vowelorConstant(character);
		largestAmong3(number, number1, number2);
		positiveOrNegative(number);
		alphabetOrNot(character);

	}

	@Override
	public void swapTwoNumber(int x, int y) {

		System.out.println("Before swapping:");
		System.out.println("number = " + x + ", number1 = " + y);
		x = x + y; // by using addition and subtraction
		y = x - y;
		x = x - y;
		System.out.println("After swapping:");
		System.out.print("number = " + x + ", number1 = " + y + "\n");

	}

	@Override
	public void evenOrOdd(int x) {

		System.out.println("Number " + x + " is " + ((x % 2 == 0) ? "Even Number" : "Odd Number"));
	}

	@Override
	public void vowelorConstant(char character) {

		if (character >= 'A' && character <= 'Z') {
			String result = (character == 'A' || character == 'E' || character == 'I' || character == 'O'
					|| character == 'U') ? "Vowel" : "Constant";
			System.out.println("Character " + character + " is " + result);
		} else if (character >= 'a' && character <= 'z') {
			String result = (character == 'a' || character == 'e' || character == 'i' || character == 'o'
					|| character == 'u') ? "Vowel" : "Constant";
			System.out.println(result);
		} else {
			System.out.println("The given input is not an alphabet");
		}

	}

	@Override
	public void largestAmong3(int x, int y, int z) {
		// TODO Auto-generated method stub
		int result = (x >= y && x >= z) ? x : (y >= x && y >= z) ? y : (z >= x && z >= y) ? z : 0;
		System.out.println("Largest number Among thress Numbers " + result);

	}

	@Override
	public void positiveOrNegative(int x) {
		// TODO Auto-generated method stub
		System.out.println("value of " + x + " is " + (x >= 0 ? "Positive Number" : "Negative Number"));

	}

	public void alphabetOrNot(char character) {
		String s1 = (character >= 'A' && character <= 'Z') ? "The given input is an alphabet of uppercase"
				: (character >= 'a' && character <= 'z') ? "The given input is an alphabet of lowercase"
						: "The given input is not an alphabet";
		System.out.println("Character " + character + " is " + s1);
	}

}

public class Number27To32 {

	public static void main(String[] args) {
		new Number().getInput();

	}

}
