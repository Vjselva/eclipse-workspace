package EmployeeDetailsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		new Maincontent().initial();
	}
}

class Maincontent

{
	static ArrayList<Employee> al = new ArrayList<Employee>();
	static int id = 1001;

	void initial() {
		int ch;
		do {
			System.out.println("\n  -- Enter your chioce -- ");
			System.out.println("1.Add Employee Details ");
			System.out.println("2.View Employee Details ");
			System.out.println("3.Order EmployeeList by AGE");
			System.out.println("4.Order EmployeeList by NAME");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addInformation();
				break;
			case 2:
				viewInformation();
				break;
			case 3:
				orderByAge();
				break;
			case 4:
				orderByName();
				break;
			}

			System.out.print("\nIf you want to contine press 0 ");
			ch = sc.nextInt();
			sc.nextLine();
		} while (ch == 0);

	}

	private void orderByName() {
		Collections.sort(al, new NameComparator());
		System.out.println("\n-- Employee List Ordered By NAME -- \n");
		System.out.println();

		for (Employee e : al) {
			System.out.println(e.toString());
		}

	}

	void orderByAge() {
		Collections.sort(al, new AgeComparator());
		System.out.println("\n-- Employee List Ordered By AGE --");
		for (Employee e : al) {
			System.out.println(e.toString());
		}

	}

	void viewInformation() {

		if (al.isEmpty()) {
			System.out.println("No records found");
		} else {
			for (Employee e : al) {
				System.out.println(e.toString());
			}
		}

	}

	void addInformation() {

		System.out.print("How Many employee ? ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while (count != 0) {
			Employee e = new Employee();
			sc.nextLine();
			System.out.println();
			System.out.print("Employee name ");
			String name = sc.nextLine();
			System.out.print("Employee Age ");
			int age = sc.nextInt();
			System.out.print("Employee Salary ");
			double salary = sc.nextDouble();
			System.out.print("Employee Address ");
			String address = sc.nextLine();
			sc.nextLine();
			e.setId(++id);
			e.setName(name);
			e.setAge(age);
			e.setSalary(salary);
			e.setAddress(address);
			al.add(e);
			count--;

		}

	}
}
