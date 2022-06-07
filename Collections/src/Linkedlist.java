import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String args[])
	{   
		int a1=0;
		LinkedList<Arraylistpojo> student=new LinkedList<Arraylistpojo>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many student Details Do you want to insert : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		student.add(addDetails());
		}

		printdetails(student);
		System.out.println("---------------CHOICES----------------");
		System.out.println("3.Insert Details in Firts position");
		System.out.println("4.Retrieve details by using Index");
		System.out.println("5.update student details by given Roll No");
		System.out.println("6.Remove the third element from a array list");
		System.out.println("7.search for the student info By Roll No");
		System.out.println("9.Copying one arraylist into another list");
		System.out.println("10.Shuffle student List");
		System.out.println("11.Reverse student List");
		System.out.println("12.Extract student List");
		System.out.println("13.Compare student List");
		System.out.println("14.swap two Student details in a list"); 
		System.out.println("15.Join two student List");
		System.out.println("16.Clone student List into another list");
		System.out.println("17.Emptying Student List");
		System.out.println("18.Test whether student list is empty or not");
		//System.out.println("19.Trim the arraylist size");
		//System.out.println("20.Increase the Arraylist size");
		System.out.println("19.Print All Student List");
		System.out.println("--------------------------------------==");
		
		
		
		int a;
		do
		{
		int roll;
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		ArrayList<Arraylistpojo> stu2=new ArrayList<Arraylistpojo>();
		switch(ch)
		{	
		
			case 3:
				
				student.add(0,addDetails());
				break;
			case 4:
//				Arraylistpojo arr=new Arraylistpojo();
				System.out.println("Enter the Index Number");
				int index=sc.nextInt();
				System.out.println("Student Details By Index "+index);
				System.out.println("------- ------- -- ----- --");
				System.out.println("______________________________");
				System.out.println("|Roll No |"+student.get(index).getRollNo());
				System.out.println("|Name    |"+student.get(index).getName());
				System.out.println("|Age     |"+student.get(index).getAge());
				System.out.println("|Gender  |"+student.get(index).getGender());
				System.out.println("|Mobile  |"+student.get(index).getMobile());
				System.out.println("|Email   |"+student.get(index).getEmail());
				System.out.println("------------------------------");
				break;
			case 5:
				System.out.println("Enter the Roll Number");
				roll=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your updated Name");
				String name=sc.nextLine();
				for(Arraylistpojo obj:student) 
				  {
					if(obj.getRollNo()==roll)
					{
						obj.setName(name);
						System.out.println("| Roll no: "+obj.getRollNo()+"| Name:"+obj.getName()+"| Age:"+obj.getAge()+"| Gender:"+obj.getGender() );
					}
				  }
				break;
			
			case 6:
				String s=student.remove(2)!=null?"Removed":"Not Removed";
				System.out.println(s);
				break;
				
			case 7:
				System.out.println("Enter the Roll Number");
				roll=sc.nextInt();
				for(Arraylistpojo obj:student) 
				  {
					if(obj.getRollNo()==roll)
					{
					System.out.println("______________________________");
					System.out.println("|Roll No |"+obj.getRollNo());
					System.out.println("|Name    |"+obj.getName());
					System.out.println("|Age     |"+obj.getAge());
					System.out.println("|Gender  |"+obj.getGender());
					System.out.println("|Mobile  |"+obj.getMobile());
					System.out.println("|Email   |"+obj.getEmail());
					System.out.println("------------------------------");
					}
				
				  }
				break;
			case 9:
				Arraylistpojo arr1=new Arraylistpojo();
				System.out.println("Enter Student Details");
				System.out.println("----- ------- -------");
				System.out.println("Rollno : ");
				arr1.setRollNo(sc.nextInt());
				sc.nextLine();
				System.out.println("Name : ");
				arr1.setName(sc.nextLine());
				System.out.println("Age : ");
				arr1.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("Gender : ");
				arr1.setGender(sc.nextLine());
				System.out.println("Email : ");
				arr1.setEmail(sc.nextLine());
				System.out.println("Mobile : ");
				arr1.setMobile(sc.nextLine());
				stu2.add(arr1);
				student.addAll(stu2);
				break;	
				
			case 10:
				Collections.shuffle(student);
				printdetails(student);
				break;
			
			case 11:
				Collections.reverse(student);
				printdetails(student);
				break;
			case 12:
				//ArrayList<Arraylistpojo> sublist=new ArrayList<Arraylistpojo>();
				System.out.println("Enter the from Index: ");
				int d=sc.nextInt();
				System.out.println("Enter the to Index: ");
				int e=sc.nextInt();
				List<Arraylistpojo> sublist=student.subList(2, 4);
				printdetails1(sublist);
				break;
				
				
			case 13:
				String g=student.equals(stu2)?"Student List and coping list are equal ":"Student List and coping list are not equal";
				System.out.println(g);
				break;
				
			case 14:
				System.out.println("Enter two index which you want to swap");
				int firstIndex=sc.nextInt();
				int secondIndex=sc.nextInt();
				Collections.swap(student, firstIndex, secondIndex);
				printdetails(student);
				
			case 15:
				student.addAll(stu2);
				printdetails(student);
				break;
				
			case 16:
				LinkedList<Arraylistpojo> student1=new LinkedList<Arraylistpojo>(student);
				System.out.println("Cloned list data");
				printdetails(student);
				break;
			       // student1 = (Arraylistpojo)student.clone();
			
			case 17:
				student.clear();
				String t= student.isEmpty()?"Details Cleared":"Details Not cleard";
				System.out.println(t);
				break;
				
			case 18:
		        if (student.isEmpty())
		            System.out.println("The ArrayList is empty");
		        else
		            System.out.println("The ArrayList is not empty");
		        break;
		        
//			case 19:
//				student.trimToSize();
//				System.out.println(student.size());
//				break;
//				
//			case 20:
//				student.ensureCapacity(500);
//				System.out.println(student.size());
//				break;
//			
			case 21:
				printdetails(student);
				break;
				
				
		}
		System.out.println();
		System.out.println("Do you want to contine Press 5");
		a1=sc.nextInt();
		}while(a1==5);
		
	}
	

	public static void printdetails(LinkedList<Arraylistpojo> student)
	{
		System.out.println("Student Details");
		System.out.println("------- -------");
		if(!student.isEmpty())
		{
		for(Arraylistpojo obj:student) 
		  {
			System.out.println("______________________________");
			System.out.println("|Roll No |"+obj.getRollNo());
			System.out.println("|Name    |"+obj.getName());
			System.out.println("|Age     |"+obj.getAge());
			System.out.println("|Gender  |"+obj.getGender());
			System.out.println("|Mobile  |"+obj.getMobile());
			System.out.println("|Email   |"+obj.getEmail());
			System.out.println("------------------------------");
		
		  }
		}
		else
		{
			System.out.println("NO DATA FOUND");
		}
	}
	
	public static void printdetails1(List<Arraylistpojo> student)
	{
		System.out.println("Student Details");
		System.out.println("------- -------");
		if(!student.isEmpty())
		{
		for(Arraylistpojo obj:student) 
		  {
			System.out.println("______________________________");
			System.out.println("|Roll No |"+obj.getRollNo());
			System.out.println("|Name    |"+obj.getName());
			System.out.println("|Age     |"+obj.getAge());
			System.out.println("|Gender  |"+obj.getGender());
			System.out.println("|Mobile  |"+obj.getMobile());
			System.out.println("|Email   |"+obj.getEmail());
			System.out.println("------------------------------");
		
		  }
		}
		else
		{
			System.out.println("NO DATA FOUND");
		}
	}
	
	public static Arraylistpojo addDetails()
	{    //Rollno=001;
		Arraylistpojo arr=new Arraylistpojo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details");
		System.out.println("----- ------- -------");
		System.out.println("Rollno : ");
		arr.setRollNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Name : ");
		arr.setName(sc.nextLine());
		System.out.println("Age : ");
		arr.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Gender : ");
		arr.setGender(sc.nextLine());
		System.out.println("Email : ");
		arr.setEmail(sc.nextLine());
		System.out.println("Mobile : ");
		arr.setMobile(sc.nextLine());
		//student.add(arr);
		return arr;
	}
		
}
