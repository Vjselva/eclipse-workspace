/*
5
 1 2 3 4 5 
  2 3 4 5 
   3 4 5 
    4 5 
     5 
    4 5 
   3 4 5 
  2 3 4 5 
 1 2 3 4 5 
 */

import java.util.Scanner;

public class SandNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count = sc.nextInt();
		String array[]=new String[count];
		for(int i=0;i<count;i++)
		{ 
			array[i]="";
			for(int j=0;j<=i;j++)
			{
				array[i]+=" ";
			}
			for(int k=i;k<count;k++)
			{
				array[i]+=k+1+" ";
			}
			System.out.println(array[i]);
			
		}
		for(int i=array.length-2;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}
}
