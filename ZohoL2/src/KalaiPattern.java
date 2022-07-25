import java.util.Scanner;

public class KalaiPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <=count; i++) {
			for (int j = i; j <=count; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if(i!=count)
				{
				if (k == 1 || k==i) {
					System.out.print(" "+k);
				} 
				else {
					System.out.print("  ");
				}
				}
				else
				{
					System.out.print(" "+k);
				}
			}
			System.out.println();
		}
	}

}
