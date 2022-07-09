import java.util.Scanner;

public class PalindromOrnot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0,remainder;
		int tem=number;
		while(number!=0)
		{
			remainder=number%10;
			sum=sum*10+remainder;
			number=number/10;
		}
		String result=sum==tem?"palindrom":"not palindrome";
		System.out.println(result);
	}
}
