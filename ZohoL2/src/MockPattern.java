/*
1 
2 7 
3 8 12 
4 9 13 16 
5 10 14 17 19 
6 11 15 18 20 21 

 */

import java.util.Scanner;

public class MockPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			int temp = count-1;
			int c=i;
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print(c+" ");

				} else {
					System.out.print(c + temp+" ");
					c=c+temp;
					temp--;
				}

			}
			System.out.println();
		}

	}
}
