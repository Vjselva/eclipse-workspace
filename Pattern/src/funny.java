import java.util.ArrayList;
import java.util.Arrays;

public class funny {
	public static void main(String args[])
	{
		String s="acxz";
	StringBuilder s2 = new StringBuilder();
    s2.append(s);
    s2.reverse();
    int arr[]=new int[s.length()];
    int arr1[]=new int[s.length()];
    ArrayList<Integer> l1= new ArrayList<Integer>();
   ArrayList<Integer> l2= new ArrayList<Integer>();
    for(int i=0;i<s.length();i++)
    {
        arr[i]=s.charAt(i);
        arr1[i]=s2.charAt(i);
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.println("first"+arr[i]);
        System.out.println("second"+arr1[i]);
    }
    
    for(int i=0;i<arr.length-1;i++)
    {
        l1.add(Math.abs(arr[i]-arr[i+1]));
        l2.add(Math.abs(arr1[i]-arr1[i+1]));
    }
    System.out.print("list 1 value");
    for(int f : l1)
    {
    	System.out.println(f);
    }
    System.out.print("list 2 value");
    for(int f : l2)
    {
    	System.out.println(f);
    }
     if (l1.equals(l2))
     {
         System.out.println("Funny");
     }
     else
     {
     
   System.out.println("Not funny");
     }

	}
}