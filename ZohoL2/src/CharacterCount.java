import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next()+' ';
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.print(s.charAt(i));
				System.out.print(count);
				count=1;
			}
		}

}
}
