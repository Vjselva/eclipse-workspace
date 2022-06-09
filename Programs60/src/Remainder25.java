
/*
Enter the number1 55
Enter the number2 5
Remainder of Two number 0
Remainder of Two number 11

 */
import java.util.Scanner;

class RemainderAndQuotient {
	public void display() {
		System.out.println("This is a parent class ");
	}

	public int calculate(int number, int number1) {
		return (number % number1);
	}

}

public class Remainder25 extends RemainderAndQuotient {

	public int calculate(int number, int number1)  // method override (same name with same parameter)
	{
		int remainder = super.calculate(number, number1); //call overridden method
		System.out.println("Remainder value " + remainder);
		return (number / number1);
	}

	public static void main(String[] args) {
		Remainder25 top = new Remainder25();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1 ");
		int number = sc.nextInt();
		System.out.print("Enter the number2 ");
		int number1 = sc.nextInt();
		top.display();
		int result = top.calculate(number, number1);
		System.out.println("Quotient value " + result);

	}

}
