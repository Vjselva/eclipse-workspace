import java.util.Scanner;

/*
Enter the String 
a1b10
abbbbbbbbbb
 */
class Reverse {
	Scanner sc = new Scanner(System.in);

	void getInput() {
		System.out.println("Enter the String ");
		String string1 = sc.nextLine();
		repeatString(string1);
	}

	void repeatString(String string1) {
		int remainder = 0;
		String tempString = "";
		for (int i = 0; i < string1.length(); i++) 
		{
			if (string1.charAt(i) >= '0' && string1.charAt(i) <= '9')
			{
				remainder = (remainder * 10) + (string1.charAt(i) - '0');
			} 
			else if (remainder > 0) 
			{
				for (int j = 0; j < remainder; j++) 
				{
					System.out.print(tempString);
				}
				remainder = 0;
				tempString = "";
			}
			if (string1.charAt(i) > '9') 
			{
				tempString += string1.charAt(i);
			}
			if (i == (string1.length() - 1)) 
			{
				for (int j = 0; j < remainder; j++) 
				{
					System.out.print(tempString);
				}
			}
		}

	}

}

public class Reverse53 {
	public static void main(String[] args) {
		new Reverse().getInput();

	}

}
