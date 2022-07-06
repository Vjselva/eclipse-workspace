/*
       c
      co
     com
    come
   comew
  comewe
 comewel

 */

public class MiddleLtrPattern {
	public static void main(String[] args) {
		String s="welcome";
		int size=s.length()/2;
		String temp="";
		int t;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				System.out.print(" ");
			}
			for(int k=size;k<=size+i;k++)
			{ 
				if(k>s.length()-1)
				{
					t=k-s.length();
					temp+=s.charAt(t);
				}
				else
				{
				temp+=s.charAt(k);
				}
			}
			System.out.println(temp);
			temp="";               

		}
	

	}

}
