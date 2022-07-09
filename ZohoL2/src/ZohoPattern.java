/*
Enter the count 5
5    1 
 4  2  
  3   
 2  4  
1    5 
 */
import java.util.Scanner;

public class ZohoPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count ");
		int count = sc.nextInt();
		int temp = count;
		int size = count / 2;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (i <= count / 2) {
					if (i == j) {
						System.out.print(temp--);
					} else if (i + j == count - 1) {
						System.out.print(i + 1);
					}
				} else {
					if (i == j) {
						System.out.print(i + 1);
					} else if (i + j == count - 1) {
						System.out.print(count - i);
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
