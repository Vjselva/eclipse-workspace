import java.util.Scanner;

public class PangramCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		int index=-1;
		boolean flag=false;
		boolean array[]=new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) >='A' && str.charAt(i)<='Z')
			{
				index=str.charAt(i)-'A';
			}
			if(str.charAt(i) >='a' && str.charAt(i)<='z')
			{
				index=str.charAt(i)-'a';
			}
			array[index]=true;
			
		}
		for(int i=0;i<=25;i++)
		{
			if(array[i]==true)
			{
				flag=true;
				continue;
			}
			else
			{
				flag=false;
				System.out.println("Not a pangram String");
				break;
			}
		}
		if(flag)
		{
			System.out.println("It's a Pangarm String");
		}
	}

}
