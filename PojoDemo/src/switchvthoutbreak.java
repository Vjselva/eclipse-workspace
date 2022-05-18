import java.util.Scanner;

public class  switchvthoutbreak {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the character");
		char n=obj.next().charAt(0);
		switch(n)
		{
		case 'A':
			System.out.println("A is a vowel");
		case 'E':
			System.out.println("E is a vowel");
		case 'I':
			System.out.println("I is a vowel");
		case 'O':
			System.out.println("O is a vowel");
		case 'U':
			System.out.println("U is a vowel");
		case 'a':
			System.out.println("a is a vowel");
		case 'e':
			System.out.println("e is a vowel");
		case 'i':
			System.out.println("e is a vowel");
		case 'o':
			System.out.println("e is a vowel");
		case 'u':
			System.out.println("e is a vowel");
		default:
			System.out.println("NON vowel character");
		}
}
}
