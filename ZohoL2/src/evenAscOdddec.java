import java.util.Scanner;

public class evenAscOdddec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array count ");
		int count = sc.nextInt();
		int array[] = new int[count];
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < count - 2; i++) {
			if (i % 2 == 0) {
				for (int j = i + 2; j < count; j=j+2) {
					if (array[i] < array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			} else {
				for (int j = i + 2; j < count; j=j+2) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.println(array[i]);
		}

	}

}
