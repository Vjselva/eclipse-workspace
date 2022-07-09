import java.util.Scanner;

public class TwisterPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int revnumber= reverseNumber(number);
		System.out.println(revnumber);
		String result=primeNumber(number)?primeNumber(revnumber)?"Twiseed prime Number":"Not Twised Prime Number" :"Its not a prime";
		System.out.println(result);
	}

	static int reverseNumber(int number) {
		int sum=0,remainder;
		while(number!=0)
		{
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;
		}
		return sum;
	}

	static boolean primeNumber(int number) {
		boolean flag = true;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				flag =false;
			}
		}
		
		return flag;
	}
	
	
	

}
