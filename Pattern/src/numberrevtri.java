import java.util.Scanner;

public class numberrevtri {
	public static void main(String args[])
	{
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=n;
		for(int i=0;i<n;i++)
		{   
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print(f+" ");
			}
			System.out.println();
			f--;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0;i<n;i++)
		{   
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
}
