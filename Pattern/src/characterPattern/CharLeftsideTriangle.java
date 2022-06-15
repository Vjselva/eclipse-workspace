
/*
Enter the count 6
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 

 */
package characterPattern;


import java.util.Scanner;

public class CharLeftsideTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		String line[]=new String[count];
		char start;
		for(int i=0;i<count;i++)
		{   line[i]="";
		    start='A';
			for(int j=0;j<count-i;j++)
			{
				line[i]+=start+" ";
				start++;
			}
			System.out.println(line[i]);
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(line[i]);
		}
		
	}

}
