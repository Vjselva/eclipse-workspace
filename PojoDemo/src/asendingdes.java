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
          /*  for(int i=0;i<n;i++)
            {
                if(i%2==0) {
                    for(int j=i;j<=t;j++) {
                        copyarr[i] = arr[t-(j/2)];
                        break;
                    }
                 }
                else {
                    for(int j=t;j<n;j++) {
                        copyarr[i]=arr[j];
                        break;
                    }
                }*/
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
                /* for(int i=0;i<=t;i++)
                {
                    copyarr[j]=arr[t-i];
            }
        }
       for(int i=t+1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j%2!=0)
                {
                    copyarr[j]=arr[i];
                }
            }
        }*/
        System.out.println("Asending desending order from last: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(copyarr[i]);
        }
    }
}