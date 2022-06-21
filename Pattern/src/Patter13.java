/*
 Enter the count 7
Enter the count 7
  1 2 3 4 5 6 7
   2 3 4 5 6 7
    3 4 5 6 7
     4 5 6 7
      5 6 7
       6 7
        7
       6 7 
      5 6 7 
     4 5 6 7 
    3 4 5 6 7 
   2 3 4 5 6 7 
  1 2 3 4 5 6 7 
 */

import java.util.Scanner;

public class Patter13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=count;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
		for(int i=1;i<count;i++)
		{
			for(int j=i;j<=count;j++)
			{
				System.out.print(" ");
			}
			for(int k=count-i;k<=count;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
