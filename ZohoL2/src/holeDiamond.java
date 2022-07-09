/*
 Enter the count 5
     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *

 */

import java.util.Scanner;

public class holeDiamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		
		for(int i=1;i<=count;i++)
		{
			for(int j=i;j<=count;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if(k==1 || k==2*i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<count;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=(count-i)*2-1;k>=1;k--)
			{
				if(k==(count-i)*2-1 || k==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
