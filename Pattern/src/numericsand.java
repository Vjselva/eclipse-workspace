/*
 Enter the row count
 5
 1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5 
    4 5 
   3 4 5 
  2 3 4 5 
 1 2 3 4 5 
 */
import java.util.Scanner;

public class numericsand {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row count");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(n-i+k+" ");
			}
			System.out.println();
		}

}
}