/*
 * enter the pyramid number: 4

 44444444
  333333
   2222
    11
 */
import java.util.Scanner;

public class numberpyramidreverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the pyramid number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=n*2-i*2-1;k++)
            {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}
