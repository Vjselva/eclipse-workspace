import java.util.Scanner;

public class starandNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count * 2 - 1; i++) {
			if (i > count-1 ) {
				for (int j = i; j <count*2-1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
