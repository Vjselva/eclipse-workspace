import java.util.Scanner;

public class numericpat {
	public static void main(String args[])
	{	System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		int num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	System.out.println();
	System.out.println();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(n);
			n--;
		}
		n=5;
		System.out.println();
	}
	
	System.out.println();
	System.out.println();
	
	for(int i=1;i<=n;i++)
	{   int t=i;
		for(int j=1;j<=i;j++)
		{  
			System.out.print(t);
			t--;
		}
		System.out.println();
	}
}
}

