import java.util.Scanner;

public class numberpattern {
	public static void main(String args[])
	{   int number=1;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			for(int j=0;j<t-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
