import java.util.Scanner;

public class NumberReverse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{ 
			int c=count;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c--;
			}
			System.out.println();
			NumberReverse nv=new NumberReverse();
			System.out.println(nv.toString());
		}
		
	}

}
