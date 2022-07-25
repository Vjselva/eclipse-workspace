import java.util.Scanner;

public class AlternativeElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.nextLine();
		String temp="";
		String temp1="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				temp+=s.charAt(i);
			}
			else
			{
				temp1+=s.charAt(i);
			}
			
		}
		System.out.println(temp+" "+temp1);
	}

}
