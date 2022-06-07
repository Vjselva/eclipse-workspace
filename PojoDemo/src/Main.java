

import java.util.Scanner;

public class Main {

	// write your code here
        static void leftrotate(int matrix[][],int n)
        {
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
            for(int i=0;i<n;i++){
                int low=0;
                int high=n-1;
                while(low<high){
                    int temp=matrix[low][i];
                    matrix[low][i]=matrix[high][i];
                    matrix[high][i]=temp;
                    low++;
                    high--;
                }
            }
            System.out.println("matrix After Rotate : ");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            int n=3,i,j;
            int matrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("the matrix is : ");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            leftrotate(matrix,n);
        }

}
