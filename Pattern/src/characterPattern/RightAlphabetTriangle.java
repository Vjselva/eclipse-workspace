package characterPattern;

import java.util.Scanner;

public class RightAlphabetTriangle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		char character1;
		for(int i=0;i<count;i++)
		{
			character1='A';
			for(int j=0;j<=i;j++)
			{
				System.out.print(character1+" ");
				character1++;
			}
			System.out.println();
			
		}

}
}
