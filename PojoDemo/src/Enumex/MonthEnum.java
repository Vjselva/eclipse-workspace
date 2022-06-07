package Enumex;

import java.util.ArrayList;

public class MonthEnum {
	public static void main(String[] args) 
	{
		// enum in variable
		Month m = Month.JANUARY;
		System.out.println(m);
		System.out.println(Month.JANUARY);
		Month.FEBRUARY.meet();
		Month.MAY.meet();

		// loop for enum
		Month arr[] = Month.values();
		for (Month m1 : arr) 
		{

			System.out.println("Month type " + m1.t + " Month Index " + m1.ordinal());
		}
		// emum in list
		ArrayList<Month> ls = new ArrayList<Month>();
		ls.add(Month.JANUARY);
		ls.add(Month.FEBRUARY);
		ls.add(Month.MARCH);
		ls.add(Month.AUGUST);
		ls.add(Month.DECEMBER);
		System.out.println(ls);

	}

}
