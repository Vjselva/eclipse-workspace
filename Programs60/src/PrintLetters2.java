
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
		char c = sc.next().charAt(0);
		Display(c);
	}

	void Display(char x) {
		for (char i = x; i <= 90; i++) {
			System.out.print(i);
		}
	}
}

public class PrintLetters2 {
	public static void main(String[] args) {
		new Print().getInput();

	}
}
