import java.util.Scanner;

public class Refer {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the n:");
	int n = scanner.nextInt();
	int temp=0;
	int v=0;
	int[] arr = new int[n];
	System.out.println("Enter the array elements:");
	for(int i=0;i<n;i++){
		arr[i]=scanner.nextInt();
	}
	System.out.println("enter the x value:");
	int x = scanner.nextInt();
	
	for(int i=0;i<n;i++) {
		if(arr[0]==x) 
		{
			arr[i]=1;
		}
		else if(arr[i]==x)
		{
			arr[i]=1;
			temp = arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]!=1) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
  }
}