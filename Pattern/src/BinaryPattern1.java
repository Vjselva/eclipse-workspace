/*
Enter the count 5
10101
01010
10101
01010
10101

 */

import java.util.Scanner;

public class BinaryPattern1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the count ");
	int count=sc.nextInt();
	for(int i=1;i<=count;i++)
	{
		for(int j=1;j<=count;j++)
		{
			if((i+j)%2==0)
			{
				System.out.print(1);
			}
			else
			{
				System.out.print(0);
			}
		}
		System.out.println();
	}
	
	}
}
