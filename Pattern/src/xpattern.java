import java.util.Scanner;

public class xpattern {
	public static void main(String args[])
	{
	System.out.println("Enter the count : ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    String arr[]=new String[n];
    if(n%2==0)
    {
        System.out.println("must enter odd number");
    }
    else
    {	System.out.println("enter the string ");
        for(int i=0;i<=arr.length;i++)
        {
          arr[i]=sc.nextLine();
        }
    }

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j)
            {
                System.out.print(arr[i]);
            }
            else if(i+j==7)
            {
                System.out.print(arr[n-i]);
            }
            else
            {
            	System.out.print(" ");
            }
        }
        System.out.println();
    }
}

}