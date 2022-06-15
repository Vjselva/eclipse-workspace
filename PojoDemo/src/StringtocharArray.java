import java.util.Scanner;

public class StringtocharArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter palindrome words only ");
		String s=sc.next();
		String c[]=s.split("");
		int size=((s.length()-1)/2)+1;
		String diamond[]=new String[size];
		for(int i=0;i<size;i++)
		{
			diamond[i]="";
			for(int j=0;j<size-i;j++)
			{
				diamond[i]+=" ";
			}
			diamond[i]+=c[size-i-1];
			//System.out.println(diamond[i]);
			if(i!=0)
			{
				for(int k=0;k<2*i-1;k++)
				{
					diamond[i]+=" ";
				}
				diamond[i]+=c[size-i-1];
			}
			System.out.println(diamond[i]);
		}
		for(int i=size-2;i>=0;i--)
		{
			System.out.println(diamond[i]);
		}
	}

}
