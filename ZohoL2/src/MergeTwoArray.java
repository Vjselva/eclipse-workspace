
public class MergeTwoArray {

	public static void main(String[] args) {
		
		int array1[]= {2,4,5,6,7,9,10,13};
		int array2[]= {2,3,4,5,6,7,8,9,11,15};
		int count=0;
		int array3[]=new int[array1.length+array2.length];
		int i=0,j=0,k=0;
		while(i<array1.length && j<array2.length)
		{
			if(array1[i]<array2[j])
			{
				array3[k++]=array1[i++];
			}
			else if(array1[i]==array2[j])
			{
				array3[k++]=array1[i++];
				j++;
			}
			else
			{
				array3[k++]=array2[j++];
			}
			count++;
		}
		if(i<array1.length)
		{
			for(int g=i;g<array1.length;g++)
			{
				array3[k++]=array1[g];
			}
			count++;
		}
		if(j<array2.length)
		{
			for(int g=j;g<array2.length;g++)
			{
				array3[k++]=array2[g];
			}
			count++;
		}
		
		for(i=0;i<count;i++)
		{
			System.out.println(array3[i]);
		}
		
	}
}
