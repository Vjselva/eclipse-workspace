package sorting;

import java.util.Scanner;

public class insertionsort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array count: ");
		int n=sc.nextInt();
		int temp;
		int arr[]=new int[n];
		System.out.println("Enter array Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("after sorting");
		for(int i=1;i<n;i++)
		{
			int var=i;
;			for(int j=i;j>0;j--)
			{
				if(arr[var]<arr[j-1])
				{
					temp=arr[j-1];
					arr[j-1]=arr[var];
					arr[var]=temp;
					var--;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
