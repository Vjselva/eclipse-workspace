
/*
Input the number of Stream 5
1+11+111+1111+11111
12345
 */
import java.util.Scanner;

class SumofSeries {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.print("Input the number of Stream ");
		int number = sc.nextInt();
		series(number);
		display(number);
	}

	void series(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}
			if (i != number) {
				System.out.print("+");
			}
		}
	}

	void display(int number) {
		System.out.println();
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
		}
	}

}

public class SumofSeries60 {
	public static void main(String[] args) {
		new SumofSeries().getInput();
	}

}
