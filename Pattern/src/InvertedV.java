import java.util.Scanner;

public class InvertedV {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the count : ");
	int count=sc.nextInt();
	for(int i=0;i<count;i++)
	{
		for(int j=i;j<count;j++) 
		{
			System.out.print(" ");
		}
		for(int k=0;k<=2*i;k++)
		{
			if(k==0 || k==2*i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	}

}
