/*
 Enter the count 5
A 
B B 
C C C 
D D D D 
E E E E E 

 */

package characterPattern;

import java.util.Scanner;

public class CharacterPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		char character1='A';
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(character1+" ");
			}
			System.out.println();
			character1++;
		}
		
	}

}
