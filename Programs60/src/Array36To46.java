
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Array {
	Scanner sc = new Scanner(System.in);

	int[] getInput() {

		System.out.println("Enter the Array Count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		System.out.println("Enter Array of Elements ");
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	void evenPosition(int array[]) {
		System.out.println("Even position array elements ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

	void oddPosition(int array[]) {
		System.out.println("Odd position array elements ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				System.out.println(array[i]);
			}
		}
	}

	void minMax(int array[]) {
		int min = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Minimum " + min + " Maximum " + max);
	}

	void copyArray(int array[]) {
		int copyArray[] = new int[array.length];
		System.out.println("Copy Array Values ");
		for (int i = 0; i < array.length; i++) {
			copyArray[i] = array[i];
			System.out.println(copyArray[i]);
		}
	}

	void frequencyOfArrayElements(int array[]) {
		System.out.println("Frequency of the array elements ");
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!(hs.containsKey(array[i]))) {
				hs.put(array[i], 1);

			} else {
				hs.put(array[i], hs.get(array[i]) + 1);
			}

		}
		for (Map.Entry entry : hs.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	void arrayLeftRotate(int array[]) {
		System.out.println("Enter the number of Left rotation: ");
		int leftPosition = sc.nextInt();
		while (leftPosition != 0) {
			int first = array[0];
			for (int i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[array.length - 1] = first;
			leftPosition--;
		}
		System.out.println("LeftRotation of array of Elements ");
		display(array);
	}

	void sum(int array[]) {
		int sumofArray = 0;
		for (int i = 0; i < array.length; i++) {
			sumofArray += array[i];
		}
		System.out.println("Sum of Array Value" + sumofArray);
	}

	void arrayRightRotate(int array[]) {
		System.out.println("Enter the number of Right rotation: ");
		int rightPosition = sc.nextInt();
		while (rightPosition != 0) {
			int last = array[array.length - 1];
			for (int i = (array.length - 2); i >= 0; i--) {
				array[i + 1] = array[i];
			}
			array[0] = last;
			rightPosition--;
		}
		System.out.println("RightRotation of array of Elements ");
		display(array);
	}

	void duplicateElements(int array[]) {
		System.out.println("Duplicate elements in Array ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}

public class Array36To46 extends Array {
	public static void main(String[] args) {
		Array36To46 a=new Array36To46();
		int array[] = a.getInput();
		a.evenPosition(array);
		a.oddPosition(array);
		a.minMax(array);
		a.copyArray(array);
		a.frequencyOfArrayElements(array);
		a.sum(array);
		a.arrayLeftRotate(array);
		a.arrayRightRotate(array);
		a.duplicateElements(array);

	}
}
