import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Hashmap {
	public static void main(String args[])
	{	
		HashMap<Integer,Arraylistpojo> student= new HashMap<Integer,Arraylistpojo>(); 
		 int Rollno=001;
			Scanner sc=new Scanner(System.in);
			System.out.println("How Many student Details Do you want to insert : ");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{				
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
			student.put(i,arr);
			}
			int a1;
			System.out.println("1.find the student count");
			System.out.println("2.Coping one map to another map");
			System.out.println("3.Remove all details form hasmap");
			System.out.println("4.Check whether a map contains student details");
			System.out.println("5.Make a shalow copy of the instance");
			System.out.println("6.Make a Key set for the student hashmap");
			do
			{ 		
				System.out.println("enter your choice");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					//student.size();
					System.out.println("Student count: " +student.size());
					break;
				case 2:
					HashMap<Integer,Arraylistpojo> second= new HashMap<Integer,Arraylistpojo>(); 
					second.putAll(student);
					if(second.isEmpty())
					{
						System.out.println("Values not copied");
					}
					else
					{
						System.out.println("Values copied from original map to second map");
					}
					break;
					
				case 3:
					student.clear();
					if(student.isEmpty())
					{
						System.out.println("All values are removed");
					}
					else
					{
						System.out.println("values not removed");
					}
					break;
				case 4:
					System.out.println("Enter the key value: ");
					int key=sc.nextInt();
					if(student.containsKey(key))
					{
						System.out.println("Student value present in that list");
					}
					else
					{
						System.out.println("Key value Not present in that list");	
					}
				case 5:
					 HashMap<Integer, Arraylistpojo> clonedMap = new HashMap<Integer, Arraylistpojo>();
					 clonedMap = (HashMap)student.clone();
					 if(clonedMap.isEmpty())
					 {
						 System.out.println("Vales not copy from another Map");
					 }
					 else
					 {
						 System.out.println("Vales copied from another Map");
					 }
					 break;
					 
				case 6:
					Set<Integer> k = student.keySet();
					System.out.println("Set View of Keys in HashMap : "
	                           + k);
					break;
					
					
				}
				
				System.out.println("Do you want to continue press 5");
				a1=sc.nextInt();
	
			}while(a1==5);
	}

}
