package Exception;

import java.util.Scanner;

class PasswordCheck {
	void passwordCheck() throws PasswordNotStrongException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you password ");
		String password = sc.next();
		if (password.length() < 8) {
//			try {
//				throw new PasswordNotStrongException("Password is not strong");
//			} catch (PasswordNotStrongException e) {
//				System.out.println(e);
//			}
			throw new PasswordNotStrongException("Password is not strong");

		}
	}
}

public class CustomException {
	public static void main(String[] args) throws PasswordNotStrongException {
		new PasswordCheck().passwordCheck();
	}

}
