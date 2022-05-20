/*
 * Enter number of rows for side pyramid: 6

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 */

import java.util.Scanner;

public class pyramid {
    public static void main(String args[]) {
        System.out.print("Enter number of rows for side pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        n=n-1;
        for (int i =n; i>=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}