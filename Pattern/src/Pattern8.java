/*
 Enter the count 8
1
121
12321
1234321
123454321
12345654321
1234567654321
123456787654321

 */

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			for(int k=i-1;k>=1;k--)
			{
			System.out.print(k);
			
			}
			System.out.println();
		}
	}
}
