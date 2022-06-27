import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		List s=new ArrayList(Arrays.asList(1,2,3,4));
		LinkedList l=new LinkedList(s);
		System.out.println(l);
		s.add(8);
		System.out.println(l);
		
	}

}
