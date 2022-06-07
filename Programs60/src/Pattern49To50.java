import java.util.Scanner;

class Pattern {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.println("Ente the count ");
		int count = sc.nextInt();
		System.out.println("1.Number Pattern");
		System.out.println("2.Star Pattern");
		int choice = sc.nextInt();
		starPattern(count, choice);
	}

	void starPattern(int count, int choice) {
		int number = count;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < count; k++) {
				if (choice == 1) {
					System.out.print(" " + number);
				}
				if (choice == 2) {
					System.out.print(" *");
				}
			}
			System.out.println();
			number--;
		}

	}
}

public class Pattern49To50 {
	public static void main(String[] args) {
		Pattern p = new Pattern();
		p.getInput();
	}

}
