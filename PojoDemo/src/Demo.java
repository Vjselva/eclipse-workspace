import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(8,8,14,10,3,5,14,12));
		//ArrayList<Integer> temp=new ArrayList<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();   
	    result.add(arr.size()); 
	    Collections.sort(arr);
	    while((arr.size()-1)>=1)
	    {  
	      Integer i=Collections.min(arr);
	      while(arr.contains(i))
	    	  {
	    	  	  
	                arr.remove(i);          
	        }
	        System.out.println("after remove list"+arr);
	        result.add(arr.size());
	      
	    }
	     System.out.println(result);
		System.out.println(arr.size());
	    }
	}
