import java.util.Scanner;

public class diamondline {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int k=2;
		for(int i=0;i<n*2-1;i++)
		{
			for(int j=0;j<n*2;j++)
			{
				if(i<n && j>=n-i && j<=n+i-1) 
				{
					System.out.print("_");
				}	
				else if(i>=n && j>=n-k && j<=n+k-1)
				{
					System.out.print("_");
				}
				else
				{
				System.out.print("*");
				}
				
			}
			if(i>=n)
			{
				k--;
			}
			
			System.out.println();
		}
		sc.close();
	}

}
