package suprise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class admin {

	static HashMap<Integer, ArrayList<Integer>> game = new HashMap<Integer, ArrayList<Integer>>();

	public void adminMenu() {
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		char ch;
		do {
			System.out.println("\n--Fourte Lists--");
			System.out.println("1.add levels");
			System.out.println("2.View Levels and options");
			System.out.println("3.Exit");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				addPuzzle();
				break;
			case 2:
				viewPuzzle();
				break;
			case 3:
				end = false;
				break;
			default:
				System.out.println("\nEnter the vaild options");

			}
			System.out.println("\n Of you want to Contine Press Y");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

	}

	private void viewPuzzle() {
		int count = 1;
		for (Map.Entry<Integer, ArrayList<Integer>> start : game.entrySet()) {
			System.out.println("Level " + count);
			ArrayList<Integer> al = start.getValue();
			System.out.println("Answer " + start.getKey() + " options " + al);

		}

	}

	public void addPuzzle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Answer  ");
		int answer = sc.nextInt();
		ArrayList<Integer> optionNumbers = new ArrayList<Integer>();
		System.out.println("Enter the option Values");
		ArrayList<Integer> optionsNumbers = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			int options = sc.nextInt();
			optionsNumbers.add(options);
		}
		game.put(answer, optionsNumbers);

	}

	public void userPlay() {
		Scanner sc = new Scanner(System.in);
		int answer = 10;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		String opertator = "+ - * /";
		System.out.println("\n----Create a Expressions using this options and opeators--- ");
		System.out.println("\n Operators " + opertator);
		System.out.println("\nUsing This Numbers Only");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		boolean end = true;
		while (end) {
			System.out.println("\nEnter your Expressions ");
			String expression = sc.next();
			//System.out.println(expression);
			if (validateExpression(expression, al)) {

				if (check(expression, answer)) {
					System.out.println("Congratulation..!!");
					System.out.println("Your are Move to next Level");
					end = false;
				} else {
					System.out.println("Your wrong try again");
				}
			} else {
				System.out.println("Please use the Listed options only !!!");
			}

		}

	}

	private boolean validateExpression(String expression, ArrayList<Integer> al) {
		boolean flag = false;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) >= 47 && expression.charAt(i) <= 57 || expression.charAt(i) == 42
					|| expression.charAt(i) == 43 || expression.charAt(i) == 45) {
				if (Character.isDigit(expression.charAt(i))) {
					int temp = Integer.parseInt(String.valueOf(expression.charAt(i)));
					//System.out.println(temp);
					if (al.contains(temp)) {
						flag = true;
					} else {
						return false;
					}
				}

			} else {
				return false;
			}
		}

		return flag;
	}

	public boolean check(String expression, int answer) {
		boolean flag = false;

		Stack<Integer> stack = new Stack<Integer>();
		int len = expression.length();
		int currentNumber = 0;
		char operation = '+';
		for (int i = 0; i < len; i++) {
			char currentChar = expression.charAt(i);
			if (Character.isDigit(currentChar)) {
				currentNumber =currentChar - '0';
			}
			if (!Character.isDigit(currentChar) || i==len-1) {
				if (operation == '-') {
					stack.push(-currentNumber);
				} else if (operation == '+') {
					stack.push(currentNumber);
				} else if (operation == '*') {
					stack.push(stack.pop() * currentNumber);
				} else if (operation == '/') {
					stack.push(stack.pop() / currentNumber);
				}
				operation = currentChar;
				currentNumber = 0;
			}
		}
		int result = 0;
		while (!stack.isEmpty()) {
			result += stack.pop();
		}

		if (result == answer) {
			flag = true;
		}
		return flag;
	}
}
