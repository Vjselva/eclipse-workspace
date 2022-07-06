import java.util.Scanner;

public class patternTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int t=1;
		for(int i=1;i<count;i++)
		{
			for(int  j=i;j<count;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(t);
				t++;
			}
			System.out.println();
		}
		
	}

}
