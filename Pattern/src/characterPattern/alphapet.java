package characterPattern;

import java.util.Scanner;

public class alphapet {
	public static void main(String args[])
	{	System.out.println("Enter the pattern character: ");
		Scanner sc=new Scanner(System.in);
		char count=sc.next().charAt(0);
		
		for(char i='A';i<=count;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
