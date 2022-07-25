import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int col=4,row=4;
		int top=0,down=row-1,right=col-1,left=0,dir=0;
		
		while(top<=down && left<=right)
		{
			if(dir==0)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(array[top][i]+" ");
				}
				
				top++;
			}
			else if(dir==1)
			{
				for(int i=top;i<=right;i++)
				{
					System.out.print(array[i][right]+" ");
				}
			    right--;
			}
			else if(dir==2)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(array[down][i]+" ");
				}
                down--;
			}
			else if(dir==3)
			{
				for(int i=down;i>=top;i--)
				{
					System.out.print(array[i][left]+" ");
				}
				left++;
			}
			dir=(dir+1)%4;
		}
		
	}

}
