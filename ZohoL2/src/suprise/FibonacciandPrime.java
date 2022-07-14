package suprise;

class Prime {
	static int count = 0;

	void start() {
		int number = 0, number1 = 1;
		boolean end = true;
		while (end) {
			int number3 = number + number1;
			if (primecheck(number3)) {
				System.out.println(number3);
			}
			if (count == 10) {
				end = false;
			}
			number = number1;
			number1 = number3;
		}
	}

	private boolean primecheck(int number) {

		boolean flag = true;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			count++;
		}
		return flag;

	}
}

public class FibonacciandPrime {
	public static void main(String[] args) {
		new Prime().start();
	}
}
