import java.util.Scanner;

public class MinandMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count ");
		int count=sc.nextInt();
		System.out.println("Enter array elements ");
		int array[]=new int[count];
		int result[]=new int[count];
		for(int i=0;i<count;i++)
		{
			array[i]=sc.nextInt();
			result[i]=check(array[i]);
		}
		for(int j=0;j<count;j++)
		{
			System.out.println(result[j]);
		}
	}

	static int check(int i) {
		int sum=0,mul=1,remainder;
		while(i!=0)
		{
			remainder=i%10;
			sum+=remainder;
			mul*=remainder;
			i=i/10;
			
		}
		
		return sum>mul?sum:mul;
	}
	
	

}
