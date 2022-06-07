import java.util.Scanner;
import java.util.Stack;

public class Stackexample {
	
	public static void stack_Push(Stack<Character> s, String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			s.push(s1.charAt(i));
		}
		
		
	}
	public static void stack_Pop(Stack<Character> s) 
	{	String s2="";
		while(s.size() > 0)
		{
		s2+=s.pop();
		}
		System.out.println("Reverse a string using stack: " +s2);
		
	}
	public static void main(String args[])
	{
		Stack<Character> s=new Stack<Character>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.nextLine();
		stack_Push(s,s1);
		System.out.println("Stack "+s);
		stack_Pop(s);
		
	}
	
}