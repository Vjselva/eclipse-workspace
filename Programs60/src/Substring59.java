
/*
Enter the String test123substring
Enter the Substring 123
4

Enter the String testing12
Enter the Substring 1234
-1
 */
import java.util.Scanner;

class Substring {

	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.print("Enter the String ");
		String mainString1 = sc.nextLine();
		System.out.print("Enter the Substring ");
		String substring = sc.nextLine();
		substringCheck(mainString1, substring);
	}

	void substringCheck(String mainString, String substring) {
		System.out.println(mainString.indexOf(substring));
	}
}

public class Substring59 {
	public static void main(String[] args) {
		new Substring().getInput();
	}

}
