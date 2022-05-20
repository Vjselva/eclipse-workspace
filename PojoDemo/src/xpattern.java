import java.util.Scanner;

public class xpattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(i==j)
                {
                    System.out.print(s.charAt(i));
                }
                else if(i+j==6)
                {
                    System.out.print(s.charAt(s.length()-i-1));
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