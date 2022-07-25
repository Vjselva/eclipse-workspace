import java.util.Scanner;

public class RecursionReverse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(recursion(str));
	}
	
	static String recursion(String str)
	{
	String temp="";
	String temp1="";
	for(int i=str.length()-1;i>=0;i--)
	{    

		if(str.charAt(i)!=' ')
		{
			temp=str.charAt(i)+temp;
		}
		else if(str.charAt(i)==' ')
		{
			 for(int j=0;j<i;j++)
			 {
				 temp1+=str.charAt(j);
			 }
			 return temp+" "+recursion(temp1);
		}
		if(i==0)
		{
			break;
		}
	}
	return temp;
	
	}

}
