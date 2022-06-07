import java.util.Scanner;

class ReverseString {
	void getInput() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String sentence = in.nextLine();
		String reversed = reverse(sentence);
		System.out.print("Reversed sentence : ");
		System.out.println(reversed);
	}

	String reverse(String sentence) {
		int index = sentence.indexOf(" ");
		if (index == -1) {
			return sentence;
		}
		// System.out.println(sentence.substring(index + 1));
		return reverse(sentence.substring(index + 1)) + " " + sentence.substring(0, index);
	}

}

public class ReverseString52 {
	public static void main(String[] args) {
		new ReverseString().getInput();
	}

}