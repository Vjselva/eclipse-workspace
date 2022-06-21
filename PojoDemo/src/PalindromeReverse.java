import java.util.Scanner;

class Palindrome
{
	void getInput()
	{   int flag=0;;
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		//System.out.println(input);
		while(flag==0)
		{
			//System.out.println(input);
			int reverse=Palindrome(input);
			if(check(input,reverse)) {
				//System.out.println(input+"+"+reverse+"="+input+reverse);
				flag=1;
			}
			else
			{
				System.out.println(input+"+"+reverse+"="+(input+reverse));
				input=input+reverse;
			}
		
		}
	}
	
	boolean check(int input, int reverse)

	{
		if(input==reverse)
		{
			return true;
		}
		return false;
	}
	int Palindrome(int input) {
			
		int remainder,sum=0;
		while(input!=0)
		{
			remainder=input%10;
			sum=(sum*10)+remainder;
			input=input/10;
		}
		
		return sum;		
	}
}
public class PalindromeReverse {
	public static void main(String[] args) {
		new Palindrome().getInput();
	}

}
