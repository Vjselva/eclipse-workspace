import java.util.Scanner;
/*
 * Enter the number: 5
1
21
321
4321
54321

Binary format
10101
01010
10101
01010
10101


 */
public class numberpat {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Binary Format");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0 && j%2==0)
				{
					System.out.print("1");
				}
				else if(i%2!=0 && j%2!=0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
				
			}
			System.out.println();
		}
		
		
	}

}
