package suprise;

import java.util.Scanner;

class CheckAnagram {
	void checkanagram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Firt String ");
		String string1 = sc.next();
		System.out.println("Enter the Second String ");
		String string2 = sc.next();

		if (string1.length() != string2.length()) {
			System.out.println("Two strings are not anagram");
		}
		boolean flag = false;
		for (int i = 0; i < string1.length(); i++) {
			int temp = string1.charAt(i);
			for (int j = 0; j < string2.length(); j++) {
				if (string2.charAt(i) == temp || string2.charAt(i) == (temp + 32) || string2.charAt(i) == (temp - 32)) {
					flag = true;
				}
			}
		}
		if (flag == true) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("String are not a anagram");
		}
	}
}

public class Anagram {
	public static void main(String[] args) {
		new CheckAnagram().checkanagram();
	}

}
