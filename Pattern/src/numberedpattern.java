import java.util.Scanner;

public class numberedpattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		for(int i=1;i<=c;i++)
		{
			for(int j=i;j<=c;j++)
			{
				System.out.print(" ");
			}
			int temp=i;
			for(int k=1;k<=i;k++)
			{ 
				System.out.print(temp);
				temp++;
				if(temp==(i-1+i))
				{ 
					System.out.print(temp);
					for(int l=1;l<i;l++)
					{
						System.out.print(--temp);
					}
					break;
				}
			}
			System.out.println();
		}
	}

}
