/*
Enter number of rows for reverse pyramid: 6
 ***********
  *********
   *******
    *****
     ***
      *
      *
     ***
    *****
   *******
  *********
 ***********
 */
import java.util.Scanner;

public class Sandstar {
    public static void main(String args[]) {
        System.out.print("Enter number of rows for reverse pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n*2-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i*2;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
