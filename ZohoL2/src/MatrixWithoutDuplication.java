import java.util.Scanner;

public class MatrixWithoutDuplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Row ");
		int row = sc.nextInt();
		System.out.println("Coloumn ");
		int col = sc.nextInt();
		int array[][] = new int[row][col];
		String sarr[] = new String[row];
		String temp;
		int flag, l = 0;
		for (int i = 0; i < row; i++) {
			temp = "";
			for (int j = 0; j < col; j++) {
				array[i][j] = sc.nextInt();
				temp += array[i][j] + " ";
			}
			sarr[i] = temp;
			for (int k = i - 1; k >= 0; k--) {
				if (sarr[i].equals(sarr[k])) {
					sarr[i] = " ";
					break;
				}
			}

		}

		System.out.println("Without duplicate ");
		for (int i = 0; i < sarr.length - l; i++) {
			if (sarr[i] != " ") {
				System.out.println(sarr[i]);
			}
		}

	}
}


