import java.util.Scanner;

public class numberPattern1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int code=1;
		
		for(int i=0;i<c;i++)
		{
			for(int space =i;space<c;space++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(i==0 || j==0)
				{
					code=1;
				}
				else
				{
					code=code*(i-j+1)/j;
				}
				System.out.print(code);
			}
			System.out.println();
		}
	}

}
