import java.util.Scanner;

public class PascalPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int code =1;
		for(int i=0;i<count;i++)
		{
			for(int j=count;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				if(k==0)
				{
					code=1;
				}
				else
				{
					code=code*(i-k+1)/k;
				}
				System.out.print(" "+code);
			}
			System.out.println();
		}
	}
}
