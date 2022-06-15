
public class EvenIntegerRemove {
	public static void main(String[] args) {
		
		int arr[]= {1, 2, 4, 5, 10, 6, 3};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]%2!=0)
				{ 
					count++;
					int k=i;
					for(int j=i-1;j>=0;j--)
					{
						if(arr[j]%2==0)
						{
							int temp=arr[j];
							arr[j]=arr[k];
							arr[k]=temp;
							k--;
					    }
				}
			}
		}
		System.out.println("Array values");
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
			}
	
}
