import java.util.ArrayList;
import java.util.Collections;

public class list1 {
	public static void main(String args[])
	{
		ArrayList l=new ArrayList();
		ArrayList l2=new ArrayList();
		ArrayList l3=new ArrayList();
		l.ensureCapacity(3);
		l.add(10);//-->0
		l.add(20);//-->1
		l.add("Selva");//-->2
		l.add(10);//-->3
		//l.add(7,455);
		l.add(4,455);
		
		l2.add(10);
		l2.add(90);
		l2.add(8);
		l2.add(0,000);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(l.size());
		l.clear();
		System.out.println(l.size());
		System.out.println(l.addAll(l));
		System.out.println(l.contains(20));
		System.out.println(l.hashCode());
		System.out.println(l.indexOf(20));
		System.out.println(l.isEmpty());
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.equals(l2));
		System.out.println(l.get(3));
		System.out.println(l.containsAll(l2));
		System.out.println(l.remove(0));
		System.out.println(l.toString());
		System.out.println(l.toArray());
		System.out.println(l.subList(2, 4));
		Collections.sort(l2);
		System.out.println(l2);
		System.out.println(l3.size());
		
		
		
	}

}
