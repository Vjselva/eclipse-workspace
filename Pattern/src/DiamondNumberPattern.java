import java.util.Scanner;

public class DiamondNumberPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			for(int j=i;j<=count;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int g=2;g<=i;g++)
			{
				System.out.print(g);
			}
			System.out.println();
		}
		for(int i=0;i<=count-2;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=count-1-i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int g=2;g<count-i;g++)
			{
				System.out.print(g);
			}
			System.out.println();
		}
	}

}
