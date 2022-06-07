import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{   int temp=n-1;
			for(int j=1;j<=i;j++)
			{
			System.out.print(temp);	
			temp--;
			}
			System.out.println();
		}
	}

}
