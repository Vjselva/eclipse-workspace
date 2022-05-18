import java.util.Scanner;

public class Diamond {
	public static void main(String args[])
	{
		System.out.print("Enter number of rows for Diamond: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

}
}