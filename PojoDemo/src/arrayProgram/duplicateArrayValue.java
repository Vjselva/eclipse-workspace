package arrayProgram;

public class duplicateArrayValue {
	public static void main(String[] args) {
		int array[]=new int[] {1,5,0,21,40,9,2,4};
		int temp[]=new int[array.length];
		int k=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(exitCheck(array[i],temp))
			{
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
				{
					System.out.println("duplicate elements "+array[i]);
					break;
				}
			}
			temp[k++]=array[i];
			}
		}
		
	}
	static boolean exitCheck(int t,int temp[])
	{
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]==t)
			{
				return false;
			}
		}
		return true;
	}

}
