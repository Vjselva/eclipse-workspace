package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
	static HashMap<Long, Userdetails> user = new HashMap<Long, Userdetails>();
	static Long accountNumberGenarator = 100009000800208L;

	void createAccount() {
		Userdetails us = new Userdetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t-- Account Creation --");
		boolean end = true;
		String name;
		while (end) {
			System.out.print("  Name ");
			name = sc.nextLine();
			if (!ValidationPage.checkName(name)) {
				System.out.println("\n User name containes 3 to 30 Characters only!!\n ");

			} else {
				us.setName(name);
				end = false;
			}
		}
		end = true;
		while (end) {
			System.out.print("  Age ");
			int age = sc.nextInt();
			if (!(age >= 18 && age <= 100)) {
				System.out.println("\nAge must be within 18 to 100\n");
			} else {
				us.setAge(age);
				end = false;
			}
		}
		System.out.print("  Gender : 1.Male  2.female  3.others");
		String option = sc.next();
		if (ValidationPage.checkNumber(option)) {
			int choice = option.charAt(0) - '0';
			switch (choice) {
			case 1:
				us.setGender("Male");
				break;
			case 2:
				us.setGender("Female");
				break;
			case 3:
				us.setGender("Others");
				break;
			default:
				System.out.println("\nPlease Enter a Valid options only 1 to 3!!\n");
			}
		} else {
			System.out.println("\nPlease Enter a Valid options only 1 to 3!!\n");
		}
		end = true;
		while (end) {
			System.out.print("  Pan Number ");
			String panno = sc.next();
			if (!ValidationPage.checkPanNumber(panno)) {
				System.out.println("\nPan Number Contains 5 Uppercase and 4 Numbers and 1 Uppercase value\n");
			} else {
				us.setPanno(panno);
				end = false;
			}
		}
		end =true;
		while(end)
		{ 
			System.out.print("  Password ");
			String password = sc.next();
			if(!ValidationPage.checkPassword(password))
			{
				System.out.println("\nPassword Contains 1 Uppercase 1 lowercase 1 special character and totally 8 characters\n");
			}
			else
			{
				us.setPassword(password);
				end=false;
			}
		}
		us.setBalance(500);
		user.put(++accountNumberGenarator, us);
		System.out.println("\nYour Account is created your account Number [" + accountNumberGenarator + "]\n");
		display();
	}

	void display() {
		for (Map.Entry<Long, Userdetails> us : user.entrySet()) {
			System.out.println("account number " + us.getKey());
			Userdetails value = us.getValue();
			System.out.println("accound holder details " + value.toString());
		}
	}

	void userOption(Long accountNumber) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n\t ----- Z-ATM -----");

			System.out.println("\n \t Welcome " + user.get(accountNumber).getName());
			System.out.println("\n1.CheckBalance     2.Withdraw");
			System.out.println("3.Deposit          4.MoneyTransfer");
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
					moneyTransfer(accountNumber);
					break;
				default:
					System.out.println("Your Option is Invalid");
					System.out.println("\n.. Thank You Save Trees ..");

				}

			} else {
				System.out.println("\n\t$-- Please enter vaid options --$");
			}

			System.out.print("\nIf you want to Continue PRESS 0");
			ch = sc.nextInt();
		} while (ch == 0);
	}

	private void moneyTransfer(Long accountNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nTransfer Account Number ");
		Long acctno = sc.nextLong();
		if (user.containsKey(acctno)) {
			System.out.print("Transfer Amount ");
			Double tamount = sc.nextDouble();
			if (tamount > 0 && tamount <= user.get(accountNumber).getBalance()) {
				Userdetails us = user.get(acctno);
				us.setBalance(us.getBalance() + tamount);

				System.out.println("\n\t -- Amount Tranfered to " + us.getName() + " --");
			} else {
				System.out.println("\n --- Transferd amount should be within your balance ---");
			}
		} else {
			System.out.println("\n\t$-- Accouunt Doesn't Exist --$");
		}

	}

	private void deposit(Long accountNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDeposit Amount ");
		Double amount = sc.nextDouble();
		if (amount > 0) {
			Userdetails us = user.get(accountNumber);
			us.setBalance(us.getBalance() + amount);
			System.out.println("\n --- Your Money Deposited ---");
		} else {
			System.out.println("\n$-- Amount Should be higher than 0 --$");
		}

	}

	private void Withdraw(Long accountNumber) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nWithdraw Amount ");
		double wamount = sc.nextDouble();
		if (wamount > 0 && wamount <= user.get(accountNumber).getBalance()) {
			Userdetails us = user.get(accountNumber);
			us.setBalance(us.getBalance() - wamount);
			System.out.println("\n --- Count Your Cash before leaving,Collect Your card ---");

		} else {
			System.out.println("\n$-- Withdraw amount should be within your balance --$");
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
		if (user.containsKey(accountNo)) {
			Userdetails us = user.get(accountNo);
			if (us.getPassword().equals(password)) {
				userOption(accountNo);
			} else {
				System.out.println("\n$-- Wrong PassWord --$");
			}

		} else {
			System.out.println("\n $-- Your account Doesn't Exist --$");
		}

	}
}
