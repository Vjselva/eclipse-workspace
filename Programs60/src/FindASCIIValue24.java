import java.util.Scanner;

class FindASCII {
	void ValueofCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character ");
		int number = sc.next().charAt(0);
		System.out.println("ASCII Value of the Character " + number);
	}
}

public class FindASCIIValue24 {
	public static void main(String args[]) {
		new FindASCII().ValueofCharacter();
	}

}
