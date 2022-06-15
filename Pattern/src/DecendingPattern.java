/*
Enter the count 5
5
54
543
5432
54321

pattern 2
    1
   21
  321
 4321
54321


 */
import java.util.Scanner;

public class DecendingPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count-j);
			}
			System.out.println();
		}
		System.out.println("\npattern 2\n");
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=count-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		System.out.println("\nPattern 3\n");
		
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\n pattern 4\n");
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
