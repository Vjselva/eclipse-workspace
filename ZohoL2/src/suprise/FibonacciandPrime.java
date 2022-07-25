package suprise;

class Prime {

	void start() {
		int number = 0, number1 = 1, count = 0;
		boolean end = true;
		while (end) {
			int number3 = number + number1;
			if (primecheck(number3)) {
				System.out.println(number3);
				count++;
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
		return flag;

	}
}

public class FibonacciandPrime {
	public static void main(String[] args) {
		new Prime().start();
	}
}
