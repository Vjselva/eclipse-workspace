/*
 enter the count 6
Enter the array Elements 
2
2
0
4
0
8
Shift 0 value and if same value double its value and shift 
4 4 8 0 0 0
 */
import java.util.Scanner;

public class ShiftArray0value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		System.out.print("Enter the array Elements ");
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < count - 1; i++) {
			if (array[i] == 0) {
				for (int j = i + 1; j < count; j++) {
					array[j - 1] = array[j];
				}
				array[count - 1] = 0;
			} else if (array[i] == array[i + 1]) {

				for (int j = i + 1; j < count; j++) {
					array[j - 1] = array[j];
				}
				array[i] = array[i] * array[i];
				array[count - 1] = 0;
			}

		}

		System.out.println("Shift 0 value and if same value double its value and shift ");
		for (int i = 0; i < count; i++) {
			System.out.print (array[i]+" ");
		}

	}
}