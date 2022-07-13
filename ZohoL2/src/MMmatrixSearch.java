import java.util.Scanner;

public class MMmatrixSearch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Row number ");
		int row = sc.nextInt();
		System.out.print("Column Number ");
		int col = sc.nextInt();
		int array[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int temp = 0;
		System.out.print("Enter the searching array count ");
		int count = sc.nextInt();
		int search[] = new int[count];
		if (count <= row || count <= col) {
			System.out.print("Enter searching array ");
			for (int i = 0; i < count; i++) {
				search[i] = sc.nextInt();
			}
		}
		boolean flag = false;
		boolean flag1 = false;
		String result;
		outerloop: for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (array[i][j] == search[temp]) {
					if (col - j >= count) {
						for (int k = j + 1; k < j + count; k++) {
							if (array[i][k] == search[++temp]) {
								flag = true;
								continue;

							} else {
								flag = false;
							}
						}

					}
					temp = 0;
					if (row - i >= count) {
						for (int k = i + 1; k < i + count; k++) {
							if (array[k][j] == search[++temp]) {
								flag1 = true;
								continue;

							} else {
								flag1 = false;
							}
						}

					}

					result = (flag == true) ? "array find in left to right" : " not found in left to right";
					System.out.println(result);

					result = (flag1 == true) ? "array find in top to bottom" : " not found in top to bottom";
					System.out.println(result);
					if (flag == true || flag1 == true) {
						break outerloop;
					}
				}

			}

		}

	}

	static void checkStatus(boolean flag, int check) {
		String result = "";
		if (check == 1) {
			result = flag == true ? "array find in left to right" : " not found in left to right";
		}
		if (check == 2) {
			result = flag == true ? "array find in top to bottom" : " not found in top to bottom";
		}
		System.out.println(result);
	}

}
