import java.util.Scanner;

public class AlternateSorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count ");
		int count=sc.nextInt();
		int arr[]=new int[count];
		int temp[]=new int[count];
		System.out.println(arr.length);
		for (int i = 0; i < count; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		count=count-1;
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			
		if(i%2==0)
		{
			temp[i]=arr[count];
			count--;
		}
		else
		{
			temp[i]=arr[j];
			j++;
		}
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
