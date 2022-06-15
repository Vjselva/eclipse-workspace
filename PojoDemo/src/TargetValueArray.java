import java.util.Scanner;

public class TargetValueArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array count ");
		int count=sc.nextInt();
		int array[]=new int[count];
		System.out.println("Enter Array Elements ");
		for(int i=0;i<count;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter Target Elements ");
		int target=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			for(int j=i;j<count;j++)
			{
				if(array[i]+array[j]==target)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		
	}

}
