/*
 5
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

 */

package characterPattern;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		
		System.out.println("\n Pattern 1 \n");
		String sub="";
		for(int i=65;i<65+count;i++)
		{
			sub+=(char)i;
			System.out.print(sub);
			for(int j=sub.length()-2;j>=0;j--)
			{
				System.out.print(sub.charAt(j));
			}
			System.out.println();
		}
		
		//pattern 2
		System.out.println("\nPattern 2\n");
		int mid=count/2;
		for(int i=1;i<=count;i++)
		{
			for(int j=i;j<=(count+mid);j++)
			{
				System.out.print("*");
			}
			System.out.print("*");
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+"*");
			}
			for(int l=i;l<=(count+mid);l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
