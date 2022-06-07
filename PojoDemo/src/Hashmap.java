import java.util.*;

public class Hashmap {
	public static void main(String args[])
	{
		HashMap hs=new HashMap();
		
		hs.put(1, "selva");
		hs.put(2, "Hema");
		hs.put(3, "Raja");
		hs.put(4, "Jeeva");
		
		Set s=hs.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext())
		{
			Map.Entry e=(Map.Entry)it.next();
			System.out.println(e.getKey()+ " "+e.getValue());
		}
		
		
	}

}
