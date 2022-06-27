import java.util.Scanner;

public class SquarePattern1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		String array[]=new String[count];
		System.out.println(array.length);
		for(int i=0;i<count;i++)
		{
			array[i]="";
			for(int j=0;j<count;j++)
			{
				if(j<=i) {
				array[i]+=Integer.toString(count-j);
				
				}
				else
				{
					array[i]+=Integer.toString(count-i);
				}
			}
		
			System.out.print(array[i]);
		
		
			for(int k=array[i].length()-2;k>=0;k--)
			{
				System.out.print(array[i].charAt(k));
			}
			System.out.println();
		}
		for(int l=count-2;l>=0;l--)
		{
			
			System.out.print(array[l]);
			for(int g=array[l].length()-2;g>=0;g--)
			{
				System.out.print(array[l].charAt(g));
			}
		
			System.out.println();
			
		}
	}

}
