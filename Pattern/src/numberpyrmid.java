/* 1 2 3 4 5
 * 2     5
 * 3   5
 * 4 5
 * 5
 * 
 */

import java.util.Scanner;

public class numberpyrmid {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i==1)
				{
					System.out.print(j);
				}
				else if(j==i)
				{
					System.out.print(i);
				}
				
				else if(j==n)
				{
					System.out.print(j);
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
