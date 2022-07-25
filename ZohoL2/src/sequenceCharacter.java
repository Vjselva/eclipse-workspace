import java.util.Scanner;

public class sequenceCharacter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String ");
		String str = sc.next();
		String temp = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				count = (count * 10) + (str.charAt(i) - '0');
				if (i == str.length() - 1) {
					display(temp, count);
				}
			} else if (count > 0) {
				display(temp, count);
				temp = "";
				count = 0;
				temp+=str.charAt(i);
			} else {
				temp += str.charAt(i);
			}
		}
	}

	static void display(String temp, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(temp);
		}
	}

}
