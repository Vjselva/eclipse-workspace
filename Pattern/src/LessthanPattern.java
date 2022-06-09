import java.util.Scanner;

public class LessthanPattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int startValue = 1;
		sc.close();
		
		for(int i=1; i<=(number*2) -1; i++)
		{
			if(i <= number)
			{
				for(int spaces = 1; spaces <= (number - i); spaces++) {
					System.out.print(" ");
				}
				
				System.out.print(startValue++);
			} else {
				if(i == number + 1) {
					--startValue;
				}
				
				for(int spaces = 1; spaces <= (i - number); spaces++) {
					System.out.print(" ");
				}
				
				System.out.print(--startValue);
			}
			
			System.out.println();
		}
		
//		for(int i=1;i<=number-1;i++)
//		{
//			for(int j=number;j>=number-i;j--)
//			{
//				if(j==number-i) {
//					System.out.print(j);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
	}

}