import java.util.Scanner;

public class palindromeornot {
	
	boolean palindrome(int x)
	{	
		String s1=Integer.toString(x);
		StringBuilder s=new StringBuilder(s1);
		System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
		if (s1.equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		
		palindromeornot p=new palindromeornot();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		p.palindrome(x);
		System.out.println(p.palindrome(x));
		
	}

}
