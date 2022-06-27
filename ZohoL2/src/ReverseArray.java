import java.util.Scanner;

public class ReverseArray {
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
		int temp;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[count-i-1];
			arr[count-i-1]=temp;
		}
		System.out.println("Reversed array ");
		for (int i = 0; i < count; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
