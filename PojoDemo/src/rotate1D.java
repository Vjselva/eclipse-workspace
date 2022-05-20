import java.util.Scanner;

public class rotate1D
{
    public void rotate1(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element count: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array value: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("How many bits you want to rotate: ");
        int r=sc.nextInt();
        rotate1D obj=new rotate1D();
        obj.rotate1(arr,r);

    }
}