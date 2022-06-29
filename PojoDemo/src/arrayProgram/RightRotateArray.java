package arrayProgram;

public class RightRotateArray {
	public static void main(String[] args) {
		int array[]=new int[]{1,5,0,21,40,9,2,4};
		int n=3;
		while(n!=0)
		{
			int temp=array[array.length-1];
			for(int i=array.length-1;i>0;i--)
			{
				array[i]=array[i-1];
			}
			array[0]=temp;
			n--;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
	

}
