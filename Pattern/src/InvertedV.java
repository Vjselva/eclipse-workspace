import java.util.Scanner;

public class InvertedV {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the count : ");
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		for(int j=i;j<count;j++) 
		{
			System.out.print(" ");
		}
		for(int k=0;k<=2*i;k++)
		{
			if(k==0 || k==2*i)
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
	
	System.out.println("\nPattern 2\n");
	
	for(int i=1;i<=count;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(j==1||j==i||i==count)
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
	
System.out.println("\nPattern 3\n");
	
	for(int i=1;i<=count;i++)
	{
		for(int k=i;k<=count;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			if(j==1||j==i||i==count)
			{
				System.out.print(" "+j);
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	}
	



}
