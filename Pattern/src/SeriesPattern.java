import java.util.ArrayList;
import java.util.Scanner;

public class SeriesPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		String start="1";
		String tempStart=Character.toString(start.charAt(0));
		System.out.println(tempStart);
		String preStart="";
		for(int j=0;j<row;j++)
		{
			int count=1;
			tempStart=Character.toString(start.charAt(0));
			for(int i=1;i<start.length();i++)
			{
				if(tempStart.equals(Character.toString(start.charAt(i))))
				{
					count++;
				}
				else
				{
					preStart+=String.valueOf(count)+tempStart;
					count=1;
					tempStart=Character.toString(start.charAt(i));
				}
			}
			start=preStart+String.valueOf(count)+tempStart;
			preStart="";
			System.out.println(start);
			
		}
		
		}
	}
