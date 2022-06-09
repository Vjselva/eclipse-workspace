/*
Enter the count to print C pattern: 7

*******
*
*
*
*
*
*******
 */

import java.util.*;

class Cpattern implements Common{

	
	public void getInput() {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the count to print C pattern: ");
		int n = obj.nextInt(); 
		pattern(n);
		
	}

	public void pattern(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
			}
			System.out.println();

		}
		
	}
	

}

public class Cpattern55 {
	public static void main(String[] args) {
		new Cpattern().getInput();
	}
}
