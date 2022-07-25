import java.util.Scanner;

public class Pattern2Zoho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int count = c;
		int count1 = c;
		int temp = 0;
		for (int i = 1; i < c * 2; i++) {
			for (int j = 1; j <= c * 2; j++) {

				if (j > count && j <= count1) {
					for (int k = 1; k <= i * 2 - 2; k++) {
						System.out.print(" ");
					}
					j += i * 2 - 3;
				} else {
					System.out.print("*");
				}
			}
			count--;
			count1++;
			System.out.println();

		}

	}
}
