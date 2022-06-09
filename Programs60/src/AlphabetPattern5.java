
/*
Enter the Character in Capital E

EEEEE
DDDD
CCC
BB
A

 */
import java.util.Scanner;

class AlphabetPattern implements Common {
	Scanner sc = new Scanner(System.in);

	public void getInput() {
		System.out.print("Enter the Character in Capital ");
		int character = sc.next().charAt(0);
		pattern(character);
	}

	public void pattern(int character) {
		char temp=(char)character;
		for (char i = temp; i >= 'A'; i--) {
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
