import java.util.Scanner;

class Sum {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		int number;
		System.out.print("Enter the number to Find Factorial of a Number : ");
		number = sc.nextInt();
		sumOfFactorail(number);
	}

	void sumOfNaturalNumber() {
		int sum = 0;
		for (int i = 1; i <= 100; ++i) {
			sum += i; // largest digit of the sum
		}
		System.out.println("Sum Of Natural Numbers upto 100 " + sum);
	}

	void sumOfFactorail(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial number's sum of digits is : " + fact);
	}
}

public class Sum34And35 {
	public static void main(String[] args) {
		new Sum().getInput();
	}

}
