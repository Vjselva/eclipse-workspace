package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class TwoStrings {

	public static void main(String[] args) {
		String s1="hai";
		 HashSet<String> hs=new HashSet<String>(Arrays.asList(s1.split("")));
	     HashSet<String> hs1=new HashSet<String>(Arrays.asList(s1.split("")));
	     int size=hs.size()+hs1.size();
	     hs.addAll(hs1);
	     
	    
	     if(size==hs.size())
	     {
	        System.out.println("NO");
	     }
	    System.out.println("YES");
	}
}
