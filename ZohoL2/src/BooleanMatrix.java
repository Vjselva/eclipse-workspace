import java.util.Scanner;

public class BooleanMatrix {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row count ");
		int row=sc.nextInt();
		System.out.println("enter coloum count ");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int temp[][]=new int[row][col];
		System.out.println("Enter array elements ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==1)
				{
				for(int k=0;k<row;k++)
				{
					for(int l=0;l<col;l++)
					{
						if(i==k || j==l)
						{
							temp[k][l]=1;
						}
						else
						{
							if(temp[k][l]!=1)
							{
								temp[k][l]=0;
							}
						}
					}
				}
				}
				
			}
		}
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
			
	
	}
		
	}
	



