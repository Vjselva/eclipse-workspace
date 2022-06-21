/*
 Enter the count 7
1111111
1111122
1111333
1114444
1155555
1666666
7777777

 */

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			for(int j=i;j<count;j++)
			{
			System.out.print(1);
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
