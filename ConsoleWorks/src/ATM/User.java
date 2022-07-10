package ATM;

import java.util.HashMap;
import java.util.Scanner;

public class User {
	static HashMap<Long, Userdetails> user = new HashMap<Long, Userdetails>();
	static Long accountNumber = 100009000800208L;
	Scanner sc = new Scanner(System.in);

	void createAccount() {
		Userdetails us = new Userdetails();

		System.out.println("\n\t-- Account Creation --");
		System.out.print("  Name ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("  Age ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("  Gender ");
		String gender = sc.nextLine();
		System.out.print("  Pan Number ");
		String panno = sc.nextLine();
		System.out.print("  Password ");
		String password = sc.next();
		us.setName(name);
		us.setAge(age);
		us.setGender(gender);
		us.setPanno(panno);
		us.setBalance(500);
		us.setPassword(password);
		user.put(++accountNumber, us);

		System.out.println("\nYour Account is created your account Number [" + accountNumber + "]");

	}

	void userOption(Long accountNumber) {
		int ch;
		do {
			System.out.println("\n\t ----- Z-ATM -----");
			
			System.out.println("\n \t Welcome " + user.get(accountNumber).getName());
			System.out.println("\n1.CheckBalance     2.Withdraw");
			System.out.println("3.Deposit          4.MoneyTransfer");
			System.out.println("                   5.Exit");
			String option = sc.next();
			if (ValidationPage.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				switch (choice) {
				case 1:
					checkBalance(accountNumber);
					break;
				case 2:
					Withdraw(accountNumber);
					break;
				case 3:
					deposit(accountNumber);
					break;
				case 4:
					moneyTransfer();
					break;
				default:
					System.out.println("Your Option is Invalid");
					System.out.println(".. Thank You Save Trees ..");

				}

			} else {
				System.out.println("\n\t$-- Please enter vaid options --$");
			}

			System.out.print("\nIf you want to Continue PRESS 0");
			ch = sc.nextInt();
		} while (ch == 0);
	}

	private void moneyTransfer() {
		System.out.print("\nTransfer Account Number");
		Long acctno = sc.nextLong();
		if (user.containsKey(acctno)) {
			System.out.print("Transfer Amount ");
			Double tamount = sc.nextDouble();
			Userdetails us = user.get(acctno);
			us.setBalance(us.getBalance() + tamount);
			System.out.println(us.getName());
			System.out.println("\n\t -- Amount Tranfered to " + us.getName() + " --");
		} else {
			System.out.println("\n\t$-- Accouunt Doesn't Exist --$");
		}

	}

	private void deposit(Long accountNumber) {
		System.out.println("\nDeposit Amount");
		Double amount = sc.nextDouble();
		if (amount > 0) {
			Userdetails us = user.get(accountNumber);
			us.setBalance(us.getBalance() + amount);
			System.out.println("\n --- Your Money Deposited ---");
		}

	}

	private void Withdraw(Long accountNumber) {

		System.out.println("\nWithdraw Amount ");
		double wamount = sc.nextDouble();
		if (wamount > 0 && wamount <= user.get(accountNumber).getBalance()) {
			Userdetails us = user.get(accountNumber);
			us.setBalance(us.getBalance() - wamount);
			System.out.println("\n --- Count Your Cash before leaving,Collect Your card ---");

		}

	}

	private void checkBalance(Long accountNumber) {

		Userdetails us = user.get(accountNumber);
		System.out.println("\n\t-- YOUR CURRENT BALANCE " + us.getBalance() + " ---");

	}

	void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t -- Login --");
		System.out.print("\nAccount Number ");
		Long accountNo = sc.nextLong();
		sc.nextLine();
		System.out.print("Password ");
		String password = sc.next();
		if (user.containsKey(accountNumber)) {
			Userdetails us = user.get(accountNo);
			if (us.getPassword().equals(password)) {
				userOption(accountNumber);
			} else {
				System.out.println("\n$-- Wrong PassWord --$");
			}

		} else {
			System.out.println("\n $-- Your account Doesn't Exist --$");
		}

	}
}
