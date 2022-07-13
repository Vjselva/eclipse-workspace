/*
Enter the String 
This is a test string only
Enter the search String 
st
 This is a only string test

 2.
 Enter the String 
I am hema loves cat
Enter the search String 
hema
 I am cat loves hema

 
 */

import java.util.Scanner;

public class StrRevwithStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
		System.out.println("Enter the search String ");
		String f = sc.nextLine();
		String temp = "";
		String temp1 = "";
		boolean flag = false;
		outerloop:
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == f.charAt(0)) {
				for (int j = 1; j < f.length(); j++) {
					if (s.charAt(i + j) == f.charAt(j)) {
						flag = true;
						continue;
					} else {
						temp1 += s.charAt(i);
						break;
					}
				}
				if (flag) {
					int length=i-temp1.length()-1;
					temp1="";
					for (int k = s.length() - 1; k >=length; k--) {

						if (s.charAt(k) == ' ') {
							temp +=" " +temp1;
							temp1 = "";
						} else {
							temp1 = s.charAt(k) + temp1;
						}
					}
					break outerloop;
				}
			} else if (s.charAt(i) == ' ') {
				temp +=" "+temp1;
				temp1 = "";
			} else {
				temp1 += s.charAt(i);
			}
		}

		System.out.println(temp);

	}
}
