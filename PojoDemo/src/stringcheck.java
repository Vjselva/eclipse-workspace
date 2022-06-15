import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class stringcheck {
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the frst string1: ");
		String s1=sc.nextLine();
		System.out.println("Enter the second string2: ");
		String s2=sc.nextLine();
		ArrayList<String> ls=new ArrayList<String>(Arrays.asList(s1.split("")));
		//System.out.println(ls);
		for(int i=0;i<s2.length();i++)
		{	//String t=Character.toString(s2.charAt(i));
			if(ls.contains(Character.toString(s2.charAt(i))))
			{
				//System.out.println("yes");
				ls.remove(Character.toString(s2.charAt(i)));
			}
		}
		String t="";
		for(int i=0;i<ls.size();i++)
		{
		 t+=ls.get(i);
		}
		System.out.println(t);
		
	}
}
