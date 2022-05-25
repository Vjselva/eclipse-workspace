import java.util.Scanner;

public class squarepattern {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine();
		int n=0;
		if(s.length()%2==0)
		{
			System.out.println("not possible");
		}
		else
		{
		  n=((s.length()-1)/2)+1;
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++)
			{  
				if(k==0 || k==i*2+1-1)
				{
				System.out.print(s.charAt(n-i-1)+" ");
				}
				else
				{
					System.out.print(" ");
				}
						
			}
			System.out.println();
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=n-i*2;k++)
			{   
				if(k==0 || k==n-i*2)
				{
				System.out.print(s.charAt(n-i-2)+" ");
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
