import java.util.Scanner;

public class DiamondNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		
		String arr[]=new String[count];
		
		for(int i=0;i<count;i++)
		{
			arr[i]="";
			for(int j=i;j<count;j++)
			{
				arr[i]+=" ";
			}
			for(int k=i;k>=0;k--)
			{
				arr[i]+=k+1;
			}
			for(int g=i;g>=1;g--)
			{
				arr[i]+=g+1;
			}
			System.out.println(arr[i]);
		}
		for(int i=arr.length-2;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
