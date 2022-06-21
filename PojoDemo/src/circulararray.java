import java.util.ArrayList;

public class circulararray {
	public static void main(String args[]) {
		int k = 2;
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> queries = new ArrayList<Integer>();
		queries.add(0);
		queries.add(1);
		queries.add(2);
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = a.size() - k; i < a.size(); i++) {
			System.out.println(i);
			a.remove(i);
		}
		System.out.println(a);

//	    int temp=a.get(0);
//	    for(int i=0;i<a.size()-1;i++)
//	    {
//	        a.add(i,a.get(i+1));
//	        
//	    }
//	    a.add(a.get(a.size()-1),temp);
//		for (int i = 0; i < a.size();i++) 
//	      { 		      
//	          System.out.println(a.get(i)); 		
//	      }

//	    for(int i=0;i<queries.size();i++)
//	    {
//	        result.add(a.get(queries.get(i)));
//	    }
//	    System.out.println(result);
	}

}
