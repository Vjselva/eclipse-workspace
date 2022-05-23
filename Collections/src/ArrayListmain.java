import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListmain {
	public static void main(String args[])
	{   int Rollno=001;
		int a1=0;
		ArrayList<Arraylistpojo> student=new ArrayList<Arraylistpojo>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many student Details Do you want to insert : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		Arraylistpojo arr=new Arraylistpojo();
		System.out.println("Enter Student Details");
		System.out.println("----- ------- -------");
		arr.setRollNo(Rollno++);
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
		student.add(arr);
		}
		
		System.out.println("Student Details");
		System.out.println("------- -------");
		
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
		
		System.out.println("1.Insert Details in Firts position");
		System.out.println("2.Retrieve details by using Index");
		System.out.println("3.update student details by given Roll No");
		System.out.println("4.Remove the third element from a array list");
		System.out.println("5.search for the student info By Roll No");
		System.out.println("6.Copying one arraylist into another list");
		System.out.println("7.Test whether student list is empty or not");
		System.out.println("8.Trim the arraylist size");
		System.out.println("9.Increase the Arraylist size");
		System.out.println("10.Emptying student List");
		System.out.println("11.Print All Student List");
		
		
		
		int a;
		do
		{
		int roll;
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				Arraylistpojo arr=new Arraylistpojo();
				System.out.println("Enter Student Details");
				System.out.println("----- ------- -------");
				arr.setRollNo(Rollno++);
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
				student.add(1,arr);
				break;
			case 2:
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
			case 3:
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
					}
				  }
				break;
			
			case 4:
				student.remove(3);
				break;
				
			case 5:
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
			case 6:
				Arraylistpojo arr1=new Arraylistpojo();
				ArrayList<Arraylistpojo> stu2=new ArrayList<Arraylistpojo>();
				System.out.println("Enter Student Details");
				System.out.println("----- ------- -------");
				arr1.setRollNo(Rollno++);
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
			
			case 7:
				boolean ans = student.isEmpty();
		        if (ans == true)
		            System.out.println("The ArrayList is empty");
		        else
		            System.out.println("The ArrayList is not empty");
		        break;
		        
			case 8:
				student.trimToSize();
				System.out.println(student.size());
				break;
			
			case 9:
				student.ensureCapacity(500);
				System.out.println(student.size());
				break;
				
				
			case 10:
				student.clear();
				break;
			
			case 11:
				System.out.println("Student Details");
				System.out.println("------- -------");
				
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
				break;
				
				
		}
		
		System.out.println("Do you want to contine Press 5");
		a1=sc.nextInt();
		}while(a1==5);
	}
		
		
}
