import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count ");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			for(int j=i;j<=count;j++)
			{
				System.out.print(j);
			}
			for(int k=1;k<i;k++)
			{
			System.out.print(k);
			}
			System.out.println();
		}
	}
}
