import java.util.Scanner;

public class FullPyramid {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{  
			for(int j=i;j<=number;j++)
			{
				System.out.print(" ");
			}
			int t=i;
			for(int k=i;k>0;k--)
			{  
				System.out.print(t);
				t++;
			}
			t=i+(i-2);
			for(int l=1;l<i;l++)
			{
				
				System.out.print(t);
				t--;
				
			}
			System.out.println();
		}
	}

}
