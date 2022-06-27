import java.util.Scanner;

public class DiamondCharacterPattern {
	public static void main(String[] args) {
		
		System.out.println("Enter the Character ");
		Scanner sc=new Scanner(System.in);
		char t=sc.next().charAt(0);
		char a='A';
		int count=t-'A';
		String array[]=new String[count];
		
		for(int i=0;i<count;i++)
		{
			array[i]="";
			for(int j=i;j<count;j++)
			{
				array[i]+=" ";
			}
			for(int k=-1;k<=2*i-1;k++)
			{
				if(k==-1 || k==2*i-1)
				{
					array[i]+=""+a;
				}
				else
				{
					array[i]+=" ";
				}
			}
			System.out.println(array[i]);
			a++;
			
		}
		for(int g=array.length-2;g>=0;g--)
		{
			System.out.println(array[g]);
		}
		
	}

}
