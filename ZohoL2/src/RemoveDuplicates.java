import java.util.Scanner;

public class RemoveDuplicates {
	// right rotate
	public static void main(String[] args) {

		int array[] = { 2, 7, 2, 5, 3, 1, 3, 7 };
		int length = array.length;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j]) {
					for (int k = j; k < length - 1; k++) {
						array[k] = array[k + 1];
					}
					length--;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}

	}

}
