/*count duplicate value
 Enter the String abcdaccdd
d - 3
 */

import java.util.Scanner;

public class DuplicateStringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String ");
		String str = sc.nextLine();
		int max = 0;
		int count;
		char element = '\0';
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
				if (count > max) {
					max = count;
					element = str.charAt(i);
				} else if (count == max) {
					if (element < str.charAt(i)) {
						element = str.charAt(i);
					}
				}
			}
		}
		System.out.println(element + " - " + max);
	}
}
