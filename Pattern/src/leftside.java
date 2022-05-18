import java.util.Scanner;

public class leftside {
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
