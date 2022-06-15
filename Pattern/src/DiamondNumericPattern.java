/*
Enter the count 5
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

public class DiamondNumericPattern {
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
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=0;i<count-1;i++)
		{
			for(int j=1;j<count-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=count-i-1;k<=count;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
