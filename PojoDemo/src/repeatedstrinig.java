import java.util.ArrayList;
import java.util.Scanner;

public class repeatedstrinig {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(s);
		s=s+" ";
		String temp="";
		ArrayList<String> l=new ArrayList<String>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}
			else
			{
				
				l.add(temp);
				temp="";
			}
		}
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++) {
				
				if(l.get(i).equals(l.get(j)))
				{
					l.remove(j);
				}
				
				
			}
		}
		temp=" ";
		String res = String.join(temp,l);
		System.out.println(res);

}
}
