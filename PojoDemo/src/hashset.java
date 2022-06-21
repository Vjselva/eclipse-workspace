
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class hashset {
	public static void main(String args[]) {
		HashSet hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		HashSet hs1 = new HashSet(Arrays.asList(11, 12, 12, 19));
		System.out.println(hs);
		hs.addAll(hs1);
		System.out.println(hs);

		LinkedList ls = new LinkedList();
		String s = " ";
		System.out.println("Enter the integer value: ");
		do {
			ls.add(sc.nextInt());
			System.out.println("if Break press No");
			s = sc.nextLine();
			s = sc.nextLine();

		} while (!(s.equals("No")));

		TreeSet ts = new TreeSet(ls);
		System.out.println(ts);

	}
}
