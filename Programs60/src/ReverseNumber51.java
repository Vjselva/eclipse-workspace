import java.util.Scanner;

import java.util.Stack;

abstract class StackEx {
	  abstract void stackPush(Stack<Integer> star, int number);
	  abstract void stackPop(Stack<Integer> star); 
	  void printMethod()
	  {
		  System.out.println("It can have abstract and non-abstract methods, it can't be instantiated");
	  }
}

class StackExample extends StackEx {

	void getInput() {
		Stack<Integer> star = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		System.out.println(number);
		stackPush(star, number);
		System.out.println("Stack " + star);
		stackPop(star);
	}

	void stackPush(Stack<Integer> star, int number) {
		while (number != 0) {
			int remainder = number % 10;
			star.push(remainder);
			number = number / 10;
		}

	}

	void stackPop(Stack<Integer> star) {
		int sum = 0, i = 1;
		while (star.size() > 0) {
			sum = sum + (star.pop() * i);
			i = i * 10;
		}
		System.out.println("Reverse Number " + sum);

	}
}

public class ReverseNumber51 {
		public static void main(String[] args) {
			StackExample top=new StackExample();
			top.getInput();
			top.printMethod();
			}
	}



