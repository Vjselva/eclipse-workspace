/*
 Enter the count 5
12345
1234
123
12
1

 */

import java.util.Scanner;

public class InverseTriangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			for(int j=1;j<=count-i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
