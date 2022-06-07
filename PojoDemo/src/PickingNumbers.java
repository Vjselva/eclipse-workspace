import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PickingNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList());
		Collections.sort(a);
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	    for(int i=0;i<a.size();i++)
	    {
	        if(!(hs.containsKey(a.get(i))))
	        {
	            hs.put(a.get(i),1);
	        }
	        else
	        {
	            hs.put(a.get(i),hs.get(a.get(i))+1);
	        }
	    }
	    for(Map.Entry Entry:hs.entrySet())
	    {
	    	System.out.println("key "+Entry.getKey()+ "value "+Entry.getValue());
	    }
	    int max=0;
	    //int tot=0;
	    for(int i=0;i<=a.get(a.size()-1);i++)
        {	int tot=0;
           if(hs.containsKey(i) && hs.containsKey(i+1))
           {
               tot=hs.get(i)+hs.get(i+1);
               max=tot>max?tot:max;
           } 
           else
           {
        	  if(hs.containsKey(i))
        	  {
        		  tot=hs.get(i)+0;
        			}
        	  else if(hs.containsKey(i+1))
        	  {
        		  tot=0+hs.get(i+1);
        	  }
        	  max=tot>max?tot:max;
           }
           
        }
	   System.out.println(max);
		
	}

}
