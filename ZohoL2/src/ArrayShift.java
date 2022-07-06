import java.util.Scanner;

public class ArrayShift {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array count ");
		int count=sc.nextInt();
		int array[]=new int[count];
		int temp=0;
		//int cursor=0;
		for(int i=0;i<count;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=array.length-1;i>temp;i--)
		{
			if(array[i]==0)
			{
				for(int j=i;j>temp;j--)
				{
					array[j]=array[j-1];
					
				}
				i++;
				array[temp]=0;
				temp++;
				
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
