import java.util.Scanner;

public class ProductArray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array count ");
	int count=sc.nextInt();
	int productArray[]=new int[count];
	int array[]=new int[count];
	int k=0;
	System.out.println("Enter Array Elements ");
	for(int i=0;i<count;i++)
	{
		array[i]=sc.nextInt();
	
	}
 
	for(int i=0;i<count;i++)
	{
		int sum=1;
		for(int j=0;j<count;j++)
		{
			if(i!=j)
			{
				sum*=array[j];
			}
		}
		productArray[k++]=sum;
	}
	
	for(int i=0;i<count;i++)
	{
		System.out.println(productArray[i]);
	}
	}
	

}
