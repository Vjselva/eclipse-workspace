import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count ");
		int count=sc.nextInt();
		
		int t=0;
		for(int i=1;i<=count;i++)
		{
			int count1=count;
			int zip=t+i;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(zip);
				zip=zip+count1;
				count1--;
				
			}
			System.out.println();
		}
		
	}

}
