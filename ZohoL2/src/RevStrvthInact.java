/*
 Enter the String Ab,c,de!$
Output : ed,c,bA!$
 */

import java.util.Scanner;

public class RevStrvthInact {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String ");
		String str=sc.nextLine();
		char array[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			array[i]=str.charAt(i);
		}
		int t=str.length()-1;
		for(int i=0;i<str.length()/2;i++)
		{
			if((array[i]>64 && array[i]<=90 || array[i]>94 && array[i]<122) && (array[t]>64 && array[t]<90 || array[t]>94 && array[t]<=122) ) {
			
				char temp=array[i];
				array[i]=array[t];
				array[t]=temp;
				t--;
			}
			else if(!(array[t]>64 && array[t]<90 || array[t]>94 && array[t]<=122) )
			{
				t--;
				i--;
			}
			
		}
		System.out.print("Output ");
		for(int i=0;i<str.length();i++)
		{
			System.out.print(array[i]);
		}
		
		
	}
	
	
	

}
