import java.util.Scanner;

class Sorting {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.println("Enter the array count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		System.out.println("Enter Array Elements ");
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		ascendingDescendingSort(array);
	}

	void ascendingDescendingSort(int array[]) {
		int value = (array.length - 1) / 2 + 1;
		int temp;
		// System.out.println(value);
		System.out.println("Sorted Array ");
		while (value > 0) {
			for (int i = 0; i < array.length - 2; i++) {
				if (i % 2 == 0) {
					if (array[i] < array[i + 2]) {
						temp = array[i];
						array[i] = array[i + 2];
						array[i + 2] = temp;

					}
				} else {
					if (array[i] > array[i + 2]) {
						temp = array[i];
						array[i] = array[i + 2];
						array[i + 2] = temp;

					}
				}
				value--;

			}
		}
		display(array);
	}

	void display(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}

public class Sorting54 {
	public static void main(String[] args) {
		new Sorting().getInput();
	}

}
