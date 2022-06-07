import java.util.ArrayList;
import java.util.Scanner;

public class Xorexample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array count: ");
		int count = sc.nextInt();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int a[] = new int[count];
		int j = 0;
		System.out.println("Enter array values without zero");
		for (int i = 0; i < count; i++) {
			a[i] = sc.nextInt();
			if (j != 0) {
				ar.add(j ^ a[i]);
			}
			j = a[i];
		}
		int max = ar.get(0);
		for (int i = 1; i < ar.size(); i++) {
			if (max < ar.get(i)) {
				max = ar.get(i);
			}
		}
		System.out.println(max);
	}
}
