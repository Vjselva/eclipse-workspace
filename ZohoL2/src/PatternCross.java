import java.util.Scanner;

public class PatternCross {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
		int k=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i==j)
				{
					System.out.print(str.charAt(i));
				}
				else if(i+j==str.length()-1)
				{
					System.out.print(str.charAt(k));
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			k--;
		}
	}

}
