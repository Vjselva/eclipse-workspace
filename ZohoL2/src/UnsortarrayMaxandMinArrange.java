import java.util.Scanner;

public class UnsortarrayMaxandMinArrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();

		int array[]=new int[count];
		
		for(int i=0;i<count;i++) {
			array[i]=sc.nextInt();
			
		}
		int temp;
		for(int i=0;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			i++;
			for(int k=i+1;k<count;k++)
			{
				if(array[i]>array[k])
				{
					temp=array[i];
					array[i]=array[k];
					array[k]=temp;
				}
			}
			
		}
		
		
		System.out.println("Sorted array");
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}
		
	}
}
