package Exam;

import java.util.Scanner;

public class SumMeanMid {

	public static void main(String[] args) {
		float sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arrray count");
		int count = sc.nextInt();
		int array[] = new int[count];
		int array1[] = new int[count];
		System.out.println("Enter array values ");
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
			array1[i] = array[i];
			sum += array[i];
		}

		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

//		System.out.println(sum);
		float mean = sum / count;
		float mid = count % 2 == 0 ? (array[count / 2] + array[(count / 2) - 1]) / 2 : array[count / 2];
//		System.out.println(mean+" "+mid);
//		for(int i=0;i<count;i++)
//		{
//			System.out.println(array[i]);
//		}
		boolean flag = false;
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if ((array1[i] + array1[j]) > mid && (array1[i] + array1[j]) <= mean) {
					System.out.println("(" + array1[i] + "," + array1[j] + ")");
					flag = true;
				}
			}
		}
		if (!flag) {
			System.out.println("()");
		}

	}

}
