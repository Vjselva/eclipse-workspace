import java.util.Scanner;

class GreatestNumber
{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array count ");
		int count=sc.nextInt();
		int arr[]=new int[count];
		System.out.println("Enter array elements ");
		for(int i=0;i<count;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			int max=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(max<arr[j])
				{
					max=arr[j];
				}
			
			}
			arr[i]=max;
		}
		arr[count-1]=-1;
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}

public class GreatestNumberReplace {
	public static void main(String[] args) {
		new GreatestNumber().input();
	}

}
