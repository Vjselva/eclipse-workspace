package arrayProgram;

public class ArraySorting {
	public static void main(String[] args) {
		int array[]=new int[] {1,8,5,90,0,34,2};
		System.out.println("Assending Order ");
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println(array[i]);
			
		}
		System.out.println(array[array.length-1]);
		System.out.println("Desending Order ");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	
	
	int largest=3;
	for(int i=0;i<largest-1;i++)
	{
		for(int j=i+1;j<largest;j++)
		{
			if(array[i]>array[j])
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		
	}
	System.out.println("Third Largest element");
	System.out.println(array[largest-1]);
	}

}
