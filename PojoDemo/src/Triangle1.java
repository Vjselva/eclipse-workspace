import java.util.Scanner;

public class Triangle1 {
 public static void main(String args[])
 {
	 Scanner obj=new Scanner(System.in);
	 int n=obj.nextInt();
	 for(int i=0;i<=n;i++)
	 {
		 for(int j=0;j<=n-i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=0;k<=i*2;k++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
 }
}
