/*
 * Enter the array count: 
6
3
4
5
6
1
9
Asending desending order from last: 
4
5
3
6
1
9

 */

import java.util.*;
public class asendingdes {
    public static  void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array count: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int copyarr[]=new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int t=n/2;

        if(n%2==0)
        {
            t=t-1;
        }
        int k=t+1;
          
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                copyarr[i]=arr[t];
                t--;
            }
            else
            {
                copyarr[i]=arr[k];
                k++;
            }

            }
                
        System.out.println("Asending desending order from last: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(copyarr[i]);
        }
    }
}
