

import java.util.Scanner;

public class Q11 {     // Java Program to left rotate the elements of a multidimensional array.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] result = new int[4][4];
        int input = 1;
        while (input==1) {
            for (int i = 0; i < 4; i++) {              // rotation logic
                for (int j = 0; j < 4; j++) {
                    result[i][j] = arr[j][(arr.length - 1) - i];
                }
            }
            System.out.println("Before rotation :");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("%02d ", arr[i][j]);
                }
                System.out.println();
            }

            arr = result;                     // giving the reference of result to arr and creating new space and reference
            result = new int[4][4];

            System.out.println("After rotation :");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("%02d ", arr[i][j]);
                }
                System.out.println();
            }

            System.out.println("Enter 1 if you want to rotate again: ");   // if you want to rotate again enter one
            input=in.nextInt();
        }
    }
}
