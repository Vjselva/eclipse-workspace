package characterPattern;

import java.util.Scanner;

public class alphabet1 {
	public static void main(String args[])
	{
		System.out.println("Enter the alphabet which you you want to print");
		Scanner sc=new Scanner(System.in);
		char count=sc.next().charAt(0);
		for(char i='A';i<=count;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

}
