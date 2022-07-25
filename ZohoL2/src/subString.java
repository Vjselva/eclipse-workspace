import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		System.out.println("Enter the Search String  ");
		String str1 = sc.nextLine();
		boolean t = false;
		int result = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str1.charAt(0)) {
				int k = i + 1;
				for (int j = 1; j < str1.length(); j++) {
					if (k <= str.length() - 1) {
						if (str.charAt(k) == str1.charAt(j)) {
							t = true;
							k++;

						} else {
							t = false;
							break;
						}
					} else {
						t = false;
						break;
					}

				}
			}
			result = (t == true) ? i : -1;
			if (t == true) {
				break;
			}

		}
		System.out.println(result);
	}
}
