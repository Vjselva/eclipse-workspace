package StringProgram;

public class Stringsub {

	public static void main(String[] args) {
		
		String s="hello";
		String temp="";
		for(int i=0;i<s.length()-1;i++)
		{	
			temp="";
			temp+=s.charAt(i);
			System.out.println(temp);
			for(int j=i+1;j<s.length();j++)
			{
				temp+=s.charAt(j);
			System.out.println(temp);	
			}
		}
			
	}
}
