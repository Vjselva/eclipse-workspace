package arrayProgram;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int array[]=new int[] {84,60,32,11,11,46,29,102,86,53,60};
		int count=0;
		int length=array.length;
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(array[i]==array[j])
				{
					for(int k=j;k<length-1;k++)
					{
						array[k]=array[k+1];
					}
					length--;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
