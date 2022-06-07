import java.util.Arrays;
import java.util.Scanner;

class MergeArray
{	
	Scanner sc=new Scanner(System.in);
	void getInput()
	{ 	System.out.println("Enter the first array count ");
		int count=sc.nextInt();
		int array[]=new int[count];
		array=getArray(count);
		System.out.println("Enter the second array count ");
		count=sc.nextInt();
		int array1[]=new int[count];
		array1=getArray(count);
		merge2Array(array,array1);
		
		
		
	}
	int[] getArray(int count)
	{
		int temp[]=new int[count];
		System.out.println("Please Enter the sorted elements ");
		for(int i=0;i<count;i++)
		{
			temp[i]=sc.nextInt();
		}
		return temp;
	}
	void removeDuplicate(int array[])
	{	
		int temp[]=new int[array.length];
		int j=0;
		for(int i =0;i<array.length-1;i++)
		{
			if(array[i]!=array[i+1])
			{
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[array.length-1];
	   display(temp,j);
	}
	void display(int[] temp, int j) {
		for(int i=0;i<=j;j++)
		{
		 System.out.println(temp[i]);	
		}
	}
	void merge2Array(int array[],int array1[])
	{
		int copyArray[]=new int[array.length+array1.length];
		int j=0;
		for(int i=0;i<array.length;i++)
		{
			copyArray[j++]=array[i];
		}
		for(int i=0;i<array1.length;i++)
		{
			copyArray[j++]=array1[i];
		}
		Arrays.sort(copyArray);
		removeDuplicate(copyArray);
	}
	
}
public class MergeTwoArray {
	
	public static void main(String[] args) {
		new MergeArray().getInput();
        
	}

}