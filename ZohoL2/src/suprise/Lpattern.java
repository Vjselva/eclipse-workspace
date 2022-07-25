package suprise;

public class Lpattern {
	public static void main(String[] args) {
		int array[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int col=4,row=4;
		int top=0,down=row-1;
		for(int i=top;i<row;i++)
		{
			for(int j=0;j<=down;j++)
			{
				System.out.print(array[j][i]+" ");
			}
			top++;
			for(int k=top;k<col;k++)
			{
				System.out.print(array[down][k]+" ");
			}
			down--;
			System.out.println();
		}
		
	}

}
