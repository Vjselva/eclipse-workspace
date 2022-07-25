package Exam;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count ");
		int count = sc.nextInt();
		sc.nextLine();

		String check = "";
		int length = 0;
		String array[] = new String[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextLine();
			length = array[0].length();
			if (length >= array[i].length()) {
				check = array[i];
			}

		}
		//System.out.println(check);
		String temp = "";

		for (int i = 0; i < check.length(); i++) {
			boolean flag = false;
			temp += check.charAt(i);
			for (int j = 1; j < array.length; j++) {
				if (array[j].contains(temp)) {
					flag = true;
				}
				else
				{
					temp="";
					break;
				}
			}
//			if (flag == false) {
//             System.out.println(temp.length());
//				if (temp.length() > 3) {
//					for (int k = 0; k < temp.length() - 1; k++) {
//						System.out.print(temp.charAt(k));
//					}
//				} else {
//					System.out.println("()");
//				}
//				break;
//			}

		}
		System.out.println(temp);

	}

}
