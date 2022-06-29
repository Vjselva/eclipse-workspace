package arrayProgram;

public class letfRotate {
	public static void main(String[] args) {
		int array[]=new int[] {1,5,0,21,40,9,2,4};
		int n=3;
		for(int j=0;j<n;j++)
		{
			int temp=array[0];
			for(int i=0;i<array.length-1;i++)
			{
				array[i]=array[i+1];
			}
			array[array.length-1]=temp;
			
		}
		System.out.println("Left Rotate "+n);
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}
	}

}
