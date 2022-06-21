import java.util.Scanner;

public class PrimenumberAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		for(int i=1;i<=input/2;i++)
		{
			if(PrimeNumberFinder(i));
			{
				int temp=input-i;
				if(PrimeNumberFinder(temp))
				{
					System.out.println(i+"+"+temp+"= 34");
				}
				
			}
		}
	}
	
	static boolean PrimeNumberFinder(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
	}


	
}
