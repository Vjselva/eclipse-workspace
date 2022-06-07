
/*
 * 	Enter The Number Which You Want to Reverse 678
	Reversed Number for Your Input 876
	Difference Between Two numbers 198
 */
import java.util.Scanner;

class DiffOfReverseNumber {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		int number;
		System.out.print("Enter The Number Which You Want to Reverse ");
		number = sc.nextInt();
		int reversedNumber = Reverse(number);
		Different(reversedNumber, number);
	}

	int Reverse(int number) {
		int temp, sum = 0, remainder;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		return sum;
	}

	void Different(int reversedNumber, int number) {
		System.out.println("Reversed Number for Your Input " + reversedNumber);
		System.out.println("Difference Between Two numbers " + (reversedNumber - number));
	}
}

public class Difference3 {
	public static void main(String[] args) {
		new DiffOfReverseNumber().getInput();
	}
}
