package characterPattern;

import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        int top =size-1;
        int left=0;
        int num=1,sizeArr=0;
        /*if(size%2==0)
            sizeArr = size/2;
        else
            sizeArr = size/2+1;*/
        
        sizeArr = (size-1)/2 +1;

        for(int i=1;i<=sizeArr;i++,left++,top--)
        { 
        for(int j=left;j<=top;j++,num++)// left to right...
        {
            arr[left][j]=num; // 00 01
        }
        for(int j=left+1;j<=top;j++,num++)//top to bottom...
        {
            arr[j][top]= num;
        }
        for (int j=top-1;j>=left;j--,num++)// right to left..
        { 
            arr[top][j]=num;
        }
        for (int j=top-1;j>=left+1;j--,num++)// bottom to top....
        { 
            arr[j][left]= num;
        }
        }
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println("\n");
    }
    }
}