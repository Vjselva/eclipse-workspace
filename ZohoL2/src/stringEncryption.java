import java.util.Scanner;

public class stringEncryption {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String str1=sc.next();
		System.out.print("Enter the String 2");
		String str2=sc.next();
		String temp="";
		for(int i=0;i<str2.length();i++)
		{
			int count=str2.charAt(i)-'a';
			int count1=str1.charAt(i)-'a';
			temp+=(char) (((count+count1)%26)+'a'+1);
			
		}
		System.out.println(temp);
	}

}
