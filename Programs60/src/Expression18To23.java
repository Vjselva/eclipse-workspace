import java.util.Scanner;

class Expression {
	Scanner sc = new Scanner(System.in);

	void get() {
		int a, b;
		System.out.print("Enter the value of a ");
		a = sc.nextInt();
		System.out.print("Enter the value of b ");
		b = sc.nextInt();
		expression18(a, b);
		expression19(a);
		expression20(a);
		expression21(a);
		expression23(a);
	}

	void expression18(int a, int b) {
		System.out.println("i. ANSWER" + (++a - b--)); // expected answer 2
		System.out.println("ii. ANSWER" + (a % b++));
		System.out.println("iii. ANSWER" + (a *= b + 5));
		int x = 69 >>> 2;
		System.out.println("iv. ANSWER" + x); // expected answer 17
	}

	void expression19(int a) {
		System.out.println("\nValue of a " + a);
		a += a++ + ++a + --a + a--;
		System.out.println("using the value of a \"a += a++ + ++a + --a + a--\" answer is " + a);
	}

	void expression20(int x) {
		System.out.println("\nValue of a " + x);
		x = x++ * 2 + 3 * (-x);
		System.out.println("Using the vallue of a \"x = x++ * 2 + 3 * –x\" " + x);
	}

	void expression21(int y) {
		System.out.println("\nValue of a " + y);
		int z = (++y * (y++ + 5));
		System.out.println("Using the value of a \"(++y * (y++ + 5))\" " + z);
	}

	void expression23(int x) {
		System.out.println("\nValue of a " + x);
		int x1 = (++x) - (x++) + (0 - x);
		System.out.println("Using the value of a \"(++x)-(x++)+(0-x);\"" + x1);
	}
}

public class Expression18To23 {
	public static void main(String[] args) {
		Expression e = new Expression();
		e.get();
	}
}
