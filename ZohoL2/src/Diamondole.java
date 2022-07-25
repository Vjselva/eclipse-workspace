import java.lang.reflect.Method;
import java.util.Scanner;

public class Diamondole {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count ");
		int count = sc.nextInt();
		
	    

		for (int i = 0; i < count * 2 - 1; i++) {
			for (int j = 0; j < count * 2; j++) {
				if (i < count) {
					if (j > count - 1 - i && j <= count - 1 + i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				} else {
					if (j > i - count + 1 && i + j < (count * 2 + 2)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}

}
