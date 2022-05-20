/*
 4
****
*
*
****
 */

import java.util.*;
public class Cpattern1 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the count to print C pattern: ");
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {   if(i==0 || i==n-1)
        {
            for (int j = 0; j <n; j++)
            {
                System.out.print("*");
            }
        }
        else
        {
            System.out.print("*");
        }
            System.out.println();

        }
    }
}
