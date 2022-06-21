import java.util.Scanner;

public class ZeroOnePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			int num=i%2==0?0:1;
			for(int j=1;j<=count;j++)
			{
				System.out.print(num);
				num=num==0?1:0;
			}
			System.out.println();
		}
		
		}
	}


