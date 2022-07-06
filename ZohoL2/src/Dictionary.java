import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {
	
		char array[][]= {{'a','z','o','l'},{'n','x','h','o'},{'v','y','i','v'},{'o','r','s','e'}};
		ArrayList<String> al=new ArrayList<String>();
		al.add("van");
		al.add("zoho");
		al.add("are");
		al.add("is");
		al.add("love");

		for(int z=0;z<al.size();z++)
		{
			char s=al.get(z).charAt(0);
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					if(array[i][j]==s)
					{
						check(i,j,al.get(z),array);
					}
				}
			}
			
		}
		
		
	}
	static void check(int row,int col,String s, char array[][])
	{	
		int rw =row;
		int cl=col;
		boolean flag=true;
		for(int i=1;i<s.length();i++)
		{
			if(cl+1<4)
			{
				if(s.charAt(i) == array[rw][cl+1])
				{
					rw=rw;
					cl=cl+1;
					continue;
				}
			}
			if(rw+1<4)
			{
				if(s.charAt(i) == array[rw+1][cl])
				{
					rw=rw+1;
					cl=cl;
				}
				else
				{
					flag=false;
				}
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println(s);
		}
		
	}

}
