/*
 * Enter number of rows for Diamond: 4
     *
    ***
   *****
  *******
 *******
  *****
   ***
    *
 */

import java.util.Scanner;

public class Diamond1 {
    public static void main(String args[])
    {
        System.out.print("Enter number of rows for Diamond: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=2*i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<n*2-i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}