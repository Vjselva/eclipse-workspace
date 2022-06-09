import java.util.Scanner;

class NumericPattern implements Common {
	Scanner sc = new Scanner(System.in);

	public void getInput() {
		System.out.println("  Number Pattern");
		System.out.println("1.Style ONE");
		System.out.println("2.Style TWO");
		System.out.println("Enter Your Choice");
		int ch = sc.nextInt();
		System.out.println("Enter the count ");
		int count = sc.nextInt();
		switch (ch) {
		case 1:
			pattern(count);
			break;
		case 2:
			trianglePattern1(count);
			break;
		default:
			System.out.println("Choose the Existing choice only...");
		}
	}

	public void pattern(int count) {
		for (int i = 1; i <= count; i++) {
			int t = i;
			for (int j = 1; j <= count - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int g = 2; g <= i; g++) {
				System.out.print(t - 1);
				t--;
			}
			System.out.println();
		}
	}

	void trianglePattern1(int count) {
		for (int i = 0; i < count; i++) {
			int temp = count - i;
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(temp);
				temp++;
			}
			temp = count - 1;
			for (int g = 1; g <= i; g++) {
				System.out.print(temp);
				temp--;
			}
			System.out.println();
		}
	}
}

public class Pattern47To48 {
	public static void main(String[] args) {
		new NumericPattern().getInput();
	}

}
