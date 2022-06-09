package AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class PrivateExample {

	private void display()
	{
		System.out.println("We have some private value");
		String s="abcdefgaah";
	    ArrayList<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
	    //Set<String> hs=new HashSet<String>();
	    System.out.println(myList);
	}
	public static void main(String[] args) {
		PrivateExample p = new PrivateExample();
		p.display();
	}
}
