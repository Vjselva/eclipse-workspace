
/*
Enter the number: 4
********
***__***
**____**
*______*
**____**
***__***
********

 */
import java.util.Scanner;
class Pattern5 implements Common
{
	public void getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		pattern(n);
	}
	public void pattern(int n)
	{
		int k = 2;
		for (int i = 0; i < n * 2 - 1; i++) {
			for (int j = 0; j < n * 2; j++) {
				if (i < n && j >= n - i && j <= n + i - 1) {
					System.out.print("_");
				} else if (i >= n && j >= n - k && j <= n + k - 1) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}

			}
			if (i >= n) {
				k--;
			}

			System.out.println();
		}
	}
}
public class Pattern58 {
	public static void main(String args[]) {
		new Pattern5().getInput();
	}
}