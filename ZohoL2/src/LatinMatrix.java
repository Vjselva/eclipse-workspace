/*
 Enter the count 5
ABCDE
BCDEA
CDEAB
DEABC
EABCD
 */

import java.util.Scanner;

public class LatinMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count;j++)
			{
				if (i + j < count)
					System.out.print((char) (j + 65 + i));
				else
					System.out.print((char) (j + 65 + i-count));
			}
			System.out.println();
			
		}
	}
}
