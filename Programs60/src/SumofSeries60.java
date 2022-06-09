
/*
Input the number of Stream 5
1+11+111+1111+11111
12345
 */
import java.util.Scanner;

class SumofSeries {                              //class A (Hierarchical Inheritance)
	Scanner sc = new Scanner(System.in);

	int getInput() {
		System.out.print("Input the number of Stream ");
		int number = sc.nextInt();
		return number;
	}
}
class SeriesCalculation extends SumofSeries      // class B extends A
{
	void series(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}
			if (i != number) {
				System.out.print("+");
			}
		}
	}
}
class Display extends SumofSeries               // class c extends A
{
	void display(int number) {
		System.out.println();
		for (int i = 1; i <= number; i++) {
			System.out.print(i);
		}
	}

}

public class SumofSeries60 {
	public static void main(String[] args) {
		SeriesCalculation calculation=new SeriesCalculation();
		int number=calculation.getInput();
		calculation.series(number);
		Display show=new Display();
		show.display(number);
	}

}
