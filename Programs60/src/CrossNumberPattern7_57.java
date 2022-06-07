
/*
Enter the odd number: 5
1   5
 2 4 
  3  
 2 4 
1   5

 */
import java.util.Scanner;

class CrossNumber implements Common{
	Scanner sc = new Scanner(System.in);

	public void getInput() {
		System.out.print("Enter the odd number: ");
		int n = sc.nextInt();
		pattern(n);
	}

	public void pattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print(i);
				} else if (i + j == n + 1) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

public class CrossNumberPattern7_57 {
	public static void main(String args[]) {
		new CrossNumber().getInput();
	}
}