/*
 Enter the count 6
      A 
     A B 
    A B C 
   A B C D 
  A B C D E 
 A B C D E F 

 */
package characterPattern;

import java.util.Scanner;

public class TriangleCharPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			char start='A';
			for(int j=0;j<count-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(start+" ");
				start++;
			}
			System.out.println();
			
		}
	}

}
