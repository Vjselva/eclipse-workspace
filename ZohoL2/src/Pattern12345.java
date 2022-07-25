
public class Pattern12345 {

	public static void main(String[] args) {

		String str = "12345";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i == j || j == str.length() - i - 1) {
					System.out.print(str.charAt(j));
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}

}
