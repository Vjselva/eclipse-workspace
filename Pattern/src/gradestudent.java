import java.util.Scanner;

public class gradestudent {
	public static void main(String args[])
	{   
		int choice;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Mark :");
		System.out.println("----- ---- -----");
		int mark=sc.nextInt();
		String result;
		result=(mark>=80 && mark<=100)? "A Grade": (mark>=60 && mark<80)? "B Grade": (mark>=40 && mark<60)? "C Grade": mark<40 ? "Fail":"Invalid mark";
		System.out.println(result);
		
		System.out.println("Do You want to contine press 5");
		choice=sc.nextInt();
		}while(choice==5);
		
	}

}
