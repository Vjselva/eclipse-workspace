import java.util.ArrayList;
import java.util.Scanner;

public class PossibleSubset {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		int arr[]=new int[count];
		System.out.println("Enter array element ");
		for (int i = 0; i < count; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the Target Number ");
		int number=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==number)
				{
					al.add(arr[i]);
					al.add(arr[j]);
					System.out.println(al);
					al.clear();
				}
				else
				{
					
				}
			}
			
		
		}
		
	}

}
