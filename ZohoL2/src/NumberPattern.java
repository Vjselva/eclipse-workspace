/*6
*
*1*
*121*
*12321*
*1234321*
*123454321*
*12345654321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		String array[]=new String[count+1];
		String temp="*";
		array[0]=temp;
		for(int i=1;i<=count;i++)
		{	temp="*";
			for(int j=1;j<=i;j++)
			{
				temp+=j;
			}
			for(int k=i-1;k>=1;k--)
			{
				temp+=k;
			}
			temp+="*";
			array[i]=temp;
		}
		
		
		for(int i=0;i<=count;i++)
		{
			System.out.println(array[i]);
		}
		for(int k=count-1;k>=0;k--)
		{
			System.out.println(array[k]);
		}

	}

}
