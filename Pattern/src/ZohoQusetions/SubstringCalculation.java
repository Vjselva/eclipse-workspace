package ZohoQusetions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubstringCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(s.split(" ")));
		// System.out.println(l.size());
		s = l.get(0);
		String temp = "", k = "";
		for (int i = 0; i < s.length(); i++) 
		{
			temp += s.charAt(i);
			int count = 0;
			for (int j = 0; j < l.size(); j++) 
			{
				if (l.get(j).contains(temp)) 
				{
					count++;
				}
			}
			if (count == l.size()) {
				if (temp.length() >= k.length()) 
				{
					k = temp;
				}
			} 
			else 
			{
				temp = "";
			}
		}
		System.out.println(k);
	}

}
