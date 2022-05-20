
import java.util.Scanner;

public class grandson {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row number");
        int r=sc.nextInt();
        System.out.println("coloum number");
        int c=sc.nextInt();
        String sarr[][]=new String[r][c];
        String s1="ronaldo";
        String s2=" ";
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sarr[i][j]=sc.next();
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 1; j<c; j++) {
                if(s1.equals(sarr[i][j]) && s2==" ") {
                    s2 = sarr[i][j-1];
                    i=0;
                    break;
                }
                if((s2.equals(sarr[i][j])))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}

