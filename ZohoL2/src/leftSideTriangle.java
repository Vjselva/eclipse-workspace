/*
 Enter the count 5
     5
    54
   543
  5432
 54321

 */

import java.util.Scanner;

public class leftSideTriangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			for(int j=i;j<count;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=count-i;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
