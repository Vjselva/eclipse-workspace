import java.util.Scanner;

public class BPattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		int size=(count-1)/2+1;
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=count;j++)
			{
				if(i==1 || j==1 || j==count ||i==count || i==size) 
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
	}

}
