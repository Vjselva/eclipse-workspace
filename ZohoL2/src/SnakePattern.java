/*
 Enter the count 4
1 2 3 4 
8 7 6 5 
9 10 11 12 
16 15 14 13 
 */

import java.util.Scanner;

public class SnakePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count");
		int count=sc.nextInt();
		int t=1;
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count;j++)
			{
				if(i%2==0)
				{
					System.out.print(t+++" ");
				}
				else
				{
					System.out.print(--t+" ");
				}
				
			}
			System.out.println();
			t=t+count;
		}
		
		
	}

}
