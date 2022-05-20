/*
 * Enter the row count:5
1
10
101
1010
10101

 */

import java.util.Scanner;

public class binarypattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row count");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("1");	
				}
				else
				{
				System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
