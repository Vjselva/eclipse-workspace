import java.util.Scanner;

/*
Enter The Number Which Table You Want 11
TABLE FOR 11
------------------------------
1 * 11 == 11
2 * 11 == 22
3 * 11 == 33
4 * 11 == 44
5 * 11 == 55
6 * 11 == 66
7 * 11 == 77
8 * 11 == 88
9 * 11 == 99
10 * 11 == 110
------------------------------

 */
class Perform {
	void inputGet() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number Which Table You Want ");
		number = sc.nextInt();

	}

	void tableFormat(int x) {
		System.out.println("TABLE FOR " + x);
		System.out.println("------------------------------");
		for (int i = 1; i <= 10; ++i) {
			System.out.println(i + " * " + x + " == " + i * x);
		}
		System.out.println("------------------------------");
	}

}

public class MultiplicationTable1 {
	public static void main(String[] args) {
		new Perform().inputGet();

	}

}
