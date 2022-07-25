package leetcode;

public class NightyDegree {
	
	public static void main(String[] args) throws InterruptedException {
		
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		int col=4;
		int row=4;
		
		System.out.println("Rotate + 90\n");
		for(int i=0;i<col;i++)
		{
			for(int j=2;j>=0;j--)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
			Thread.sleep(2000);
		}
		
		System.out.println("Rotate - 90\n");
		for(int i=col-1;i>=0;i--)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("Rotate +180\n");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[(row-i-1)<0?-(row-i-1):(row-i-1)][(col-j-1)<0?-(col-j-1):(col-j-1)]);
			}
			System.out.println();
		}
		
	}

}
