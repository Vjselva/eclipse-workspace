package leetcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class parenthesevalidation {
	public static void main(String args[]) {
		String s;
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("}", "{");
		hs.put(")", "(");
		hs.put("]", "[");
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		String t = "true";
		//System.out.println(s.length());
		Stack<String> par = new Stack<String>();
		if(s.length()==1)
		{
			t="false";
			
		}
		for (int i = 0; i < s.length(); i++) 
		{
			String f = Character.toString(s.charAt(i));
			// System.out.println(f);
			if (hs.containsValue(f)) 
			{
				par.push(f);
			} 
			else 
			{
				String match = par.pop();
				// System.out.println(match);
				// System.out.println(hs.get(f));
				if (match.equals(hs.get(f))) 
				{
					continue;
				} 
				else 
				{
					t = "false";
					break;
				}
			}
			// System.out.println(par);
			// System.out.println(t);
		}
		String result = t == "true" ? "Parentheses Matched" : "Parentheses Not Matched";
		System.out.println(result);

	}

}
