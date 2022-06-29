package arrayProgram;

public class ArraysProgram {
	public static void main(String[] args) {
	
		
		
		int array[]=new int[] {5,5,5,5,6,6,2,1,9,11,67};
		int temp[]=new int[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			int count=0;
			if(temp[i]!= -1)
			{
			for(int j=i;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					temp[j]=-1;
				}
			}
			temp[i]=count;
			}
			else
			{
				continue;
			}
		}
		
		for(int k=0;k<temp.length;k++)
		{
			if(temp[k]!=-1)
			{
				System.out.println("array value "+array[k]+ "  count "+temp[k]);
			}
		}
		
	}

}
