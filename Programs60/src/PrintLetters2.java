
/*
  Enter the Character : B
  BCDEFGHIJKLMNOPQRSTUVWXYZ
 * 
 */

import java.util.Scanner;

class Print {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.print("Enter the Character : ");
		int variable = sc.next().charAt(0);
		Display(variable);
	}

	void Display(int x) {
		char character=(char)x;
		for (char i = character; i <= 90; i++) {
			System.out.print(i);
		}
	}
}

public class PrintLetters2 {
	public static void main(String[] args) {
		new Print().getInput();

	}
}
