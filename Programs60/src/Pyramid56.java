/*
 * Enter the Number 4
    1 
   2 3 
  4 5 6 
 7 8 9 10 

 */

import java.util.Scanner;

public class Pyramid56 {
	public static void main(String args[]) {
		int number = 1;
		System.out.print("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

		sc.close();
	}

}
