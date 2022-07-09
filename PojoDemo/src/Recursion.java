
public class Recursion {

	public static void main(String[] args) {
		String s = "one two three";
		System.out.println(recursion(s));
	}

	static String recursion(String s) {
		String temp = "";
		String temp1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ' || i == 0) {
				temp = s.charAt(i) + temp;
				if (i == 0) {
					return temp;
				}

			} else {
				for (int k = 0; k < i; k++) {
					temp1 += s.charAt(k);
				}
				break;

			}
		}
		return temp + " " + recursion(temp1);

	}

}
