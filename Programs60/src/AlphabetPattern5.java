
/*
Enter the Character in Capital E

EEEEE
DDDD
CCC
BB
A

 */
import java.util.Scanner;

class AlphabetPattern {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.print("Enter the Character in Capital ");
		char character = sc.next().charAt(0);
		pattern(character);
	}

	void pattern(char character) {
		for (char i = character; i >= 'A'; i--) {
			for (char j = i; j >= 'A'; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

public class AlphabetPattern5 {
	public static void main(String[] args) {
		new AlphabetPattern().getInput();
	}
}
