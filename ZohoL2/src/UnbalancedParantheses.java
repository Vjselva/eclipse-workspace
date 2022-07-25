import java.util.Scanner;

public class UnbalancedParantheses {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();

		char array[] = str.toCharArray();

		for (int i = 0; i < array.length - 1; i++) {
			boolean flag = false;
			if (array[i] == '(') {
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] == ')') {
						array[i] = '1';
						array[j] = '1';
						flag = true;
						break;
					}

				}
				if (flag == false) {
					array[i] = '0';
				}
			} else if (array[i] == ')') {
				array[i] = '0';
			} else {
				array[i] = '1';
			}

		}

		for (int i = 0; i < str.length(); i++) {
			if (array[i] != '0') {
				System.out.print(str.charAt(i));
			} else {
				System.out.print("");
			}
		}

	}

}
