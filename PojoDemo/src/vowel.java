import java.util.ArrayList;
import java.util.Scanner;

public class  vowel {
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the character");
		char n=obj.next().charAt(0);
		switch(n)
		{
		case 'A':
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(1);
			arr.add(2);
			arr.add(3);
			arr.add(4);
			arr.add(5);
			if(arr.remove(3)!=null)
			{
				System.out.println("removed");
			}
			else
			{
				System.out.println("Not removed");	
			}
			System.out.println("A is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("e is a vowel");
			break;
		case 'o':
			System.out.println("e is a vowel");
			break;
		case 'u':
			System.out.println("e is a vowel");
			break;
		default:
			System.out.println("NON vowel character");
		}
}
}
