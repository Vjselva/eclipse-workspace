import java.util.Arrays;
import java.util.Scanner;

class AlternateSorting {

	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.println("Enter the array count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		System.out.println("Enter Array Elements ");
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		alternateSorting(array);
	}

	void alternateSorting(int array[]) {
		int start = 0;
		int lastPosition = array.length - 1;
		int temp[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				temp[i] = array[lastPosition];
				lastPosition--;
			} else {
				temp[i] = array[start];
				start++;
			}
		}
		System.out.println("After Alternate sorting ");
		display(temp);
	}

	void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

public class AlternateSorting10 {

	public static void main(String[] args) {
		new AlternateSorting().getInput();
	}
}
