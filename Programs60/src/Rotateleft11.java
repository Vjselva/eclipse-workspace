
/*
 Original Array 
 1  2  3 
 4  5  6 
 7  8  9 
Rotated Array 
 3  6  9 
 2  5  8 
 1  4  7 
 */
import java.util.Scanner;

class Rotate {

	Scanner sc = new Scanner(System.in);

	int[][] getInput() {
		int size;
		System.out.println("Enter the Array Size ");
		size = sc.nextInt();
		int array[][] = new int[size][size];
		System.out.println("Enter the array elements ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		return array;

	}
}

class RotateDisplay extends Rotate {

	void display(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}
	}

}

class RotateArray extends RotateDisplay {
	
	void rotateMethod(int array[][]) {
		int result[][] = new int[array.length][array.length];
		for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {
			for (int j = 0; j < array.length; j++) {
				result[k][j] = array[j][i];

			}
		}
		System.out.println("Rotated Array ");
		display(result);
	}
}

public class Rotateleft11 {
	public static void main(String[] args) {
		RotateDisplay rotateDisplay = new RotateDisplay();
		int array[][] = rotateDisplay.getInput();
		System.out.println("Original Array ");
		rotateDisplay.display(array);
		RotateArray rotateArray = new RotateArray();
		rotateArray.rotateMethod(array);

	}

}
