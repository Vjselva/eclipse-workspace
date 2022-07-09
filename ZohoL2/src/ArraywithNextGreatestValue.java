import java.util.Scanner;

public class ArraywithNextGreatestValue {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int array[]=new int[count];
		for(int i=0;i<count;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<count-1;i++)
		{
			int max=array[i+1];
			for(int j=i+1;j<count;j++)
			{
				if(max<array[j])
				{
					max=array[j];
				}
			}
			array[i]=max;
		}
		array[count-1]=-1;
		
		System.out.println("Result array ");
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
