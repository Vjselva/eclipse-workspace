package Mail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class Mail {
	static HashMap<String, UserDetail> userdetail = new HashMap<String, UserDetail>();

	public void registration() {
		UserDetail detail = new UserDetail();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n \tCreate Z-Mail account\n");
		boolean end = true;
		while (end) { // for name
			System.out.print("\nName ");
			String name = sc.next();
			if (!MailValidation.checkName(name)) {
				System.out.println("\n Name should contails Characters Only allowed (3 to 30)!!");
			} else {
				detail.setName(name);
				end = false;
			}
		}
		end = true;
		while (end) { // for age
			System.out.print("\nage ");
			String age = sc.next();
			if (MailValidation.checkAge(age)) {
				int age1 = Integer.parseInt(age);

				if (!(age1 >= 18 && age1 <= 100)) {
					System.out.println("\nAge must be within 18 to 100");
				} else {
					detail.setAge(age1);
					end = false;
				}
			} else {
				System.out.println("Age Must contain Numbers only !!");
			}
		}
		end = true;
		while (end) { // for mobile no
			System.out.print("\nMobile No ");
			Long mobileno = sc.nextLong();
			if (!MailValidation.checkMobileNo(mobileno)) {
				System.out.println("\nMobile Must contains 10 Numbers!!");
			} else {
				detail.setMobileno(mobileno);
				end = false;
			}

		}
		end = true;
		String mail = "";
		while (end) { // for zmail id
			System.out.print("\n Email Name ");
			mail = sc.next();
			mail += "@zmail.com";
			if (userdetail.containsKey(mail)) {
				System.out.println("\nMail Id alreay Exist. Try another..!!!");
			} else {
				end = false;
			}
		}
		end = true;
		while (end) { // for password
			System.out.print("\nPassword ");
			String Password = sc.next();
			if (!MailValidation.checkPassword(Password)) {
				System.out
						.println("\nPassword Must Contain 1 upper 1 lower 1 Special character more than 5 characters ");
			} else {
				detail.setPassword(Password);
				end = false;
			}
		}
		userdetail.put(mail, detail);
		
		System.out.println("Mail Id created [ "+mail+" ]");
		// display();

	}

	void display() {
		for (Map.Entry<String, UserDetail> us : userdetail.entrySet()) {
			System.out.println("mail id " + us.getKey());
			UserDetail value = us.getValue();
			System.out.println("accound holder details " + value.toString());
		}

	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t-- Login --");
		System.out.print("\n  Mail ID ");
		String mail = sc.next();
		System.out.print("  Password ");
		String password = sc.next();
		if (userdetail.containsKey(mail)) {

			if (userdetail.get(mail).getPassword().equals(password)) {
				UserOption(mail);
			} else {
				System.out.println("\n-- Password Wrong --");
			}
		} else {
			System.out.println("\n-- Mail Id doesnt exits --");
		}

	}

	private void UserOption(String mail) {
		Scanner sc = new Scanner(System.in);

		int ch;
		do {
			System.out.println("\nWelcome " + userdetail.get(mail).getName());
			System.out.println(" 1.Compose \n 2.Inbox \n 3.SendItems");
			String option = sc.next();
			if (MailValidation.checkNumber(option)) {
				int choice = option.charAt(0) - '0';
				switch (choice) {
				case 1:
					compose(mail);
					break;
				case 2:
					inbox(mail);
					break;
				case 3:
					senditem(mail);
					break;

				}
			} else {
				System.out.println("Enter valid options - Numbers Only");
			}

			System.out.println("If you want to continue Press 5");
			ch = sc.nextInt();
		} while (ch == 5);

	}

	private void senditem(String mail) {
		int count = 0;
		System.out.println("\n\t SEND ITEMS");
		if (userdetail.containsKey(mail)) {
			ArrayList<SendMail> sendmail = userdetail.get(mail).getSendMail();
			for (int i = 0; i < sendmail.size(); i++) {
				SendMail inbox = sendmail.get(i);
				if (inbox.getType() == "senditem") {
					count++;
					System.out.println("\nFrom " + inbox.getFrom() + "               Date:" + inbox.getDate());
					System.out.println("To   " + inbox.getTo() + "\n----------------------------");
					System.out.println("Subject " + inbox.getSubject());
					System.out.println("Message " + inbox.getMessage());
					System.out.println("\n\n #####################################");

				}
			}
		}
		if (count == 0) {
			System.out.println("\n\t\t--Empty-- ");
		}

	}

	private void inbox(String mail) {
		int count = 0;
		System.out.println("\n\t INBOX");
		if (userdetail.containsKey(mail)) {
			ArrayList<SendMail> sendmail = userdetail.get(mail).getSendMail();
			for (int i = 0; i < sendmail.size(); i++) {
				SendMail inbox = sendmail.get(i);
				if (inbox.getType() == "inbox") {
					count++;
					System.out.println("From " + inbox.getFrom() + "               Date:" + inbox.getDate());
					System.out.println("To   " + inbox.getTo() + "\n----------------------------");
					System.out.println("Subject " + inbox.getSubject());
					System.out.println("Message " + inbox.getMessage());
					System.out.println("#####################################\n");

				}
			}
		}
		if (count == 0) {
			System.out.println("\n\t\t--Empty-- ");
		}

	}

	private void compose(String mail) {
		Scanner sc = new Scanner(System.in);
		System.out.println("From " + userdetail.get(mail).getName());
		System.out.print("To ");
		String toMail = sc.nextLine();
		if (userdetail.containsKey(toMail)) {
			System.out.print("Subject ");
			String subject = sc.nextLine();
			System.out.print("Message ");
			String message = sc.nextLine();
			SendMail sender = new SendMail();
			sender.setFrom(mail);
			sender.setTo(toMail);
			sender.setSubject(subject);
			sender.setMessage(message);
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
			String strDate = dateFormat.format(new Date());
			sender.setDate(strDate);
			sender.setType("senditem");

			ArrayList<SendMail> al = new ArrayList<SendMail>();
			al.add(sender);
			userdetail.get(mail).setSendMail(al);

			SendMail receiver = new SendMail();
			receiver.setFrom(mail);
			receiver.setTo(toMail);
			receiver.setSubject(subject);
			receiver.setMessage(message);
			receiver.setDate(strDate);
			receiver.setType("inbox");
			ArrayList<SendMail> al1 = new ArrayList<SendMail>();
			al1.add(receiver);
			userdetail.get(toMail).setSendMail(al1);
			// display();

		} else {
			System.out.println("\nUser doesn't Exist - Enter vaild Mail");
		}

	}

}
