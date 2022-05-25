package characterPattern;

import java.util.Scanner;

public class characterpyramid {
	public static void main(String args[])
	{	System.out.println("Enter only odd number: ");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		char t;
		int h=2;
		int f=(count/2)+1;
		for(int i=1;i<=count;i++)
		{   
			t='A';
			for(int j=1;j<=i;j++)
			{   
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}
		for(int i=1;i<=count;i++)
		{   
			t='A';
			for(int j=i;j<=count-1;j++)
			{   
				System.out.print(t+" ");
				t++;
			}
			System.out.println();
		}
		
	}

}
