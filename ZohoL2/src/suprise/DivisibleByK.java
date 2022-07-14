package suprise;

import java.util.Scanner;

class Divisible {
	void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		System.out.println("Enter the array Value ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the value of K ");
		int Kvalue = sc.nextInt();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] + array[j]) % Kvalue == 0)

				{
					System.out.println("[" + array[i] + "," + array[j] + "]");
				}
			}

		}

	}
}

public class DivisibleByK {

	public static void main(String[] args) {
		new Divisible().start();
	}
}
