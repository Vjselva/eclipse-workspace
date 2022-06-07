package Enumex;

public enum Month {
	JANUARY("spring"), FEBRUARY {
		public void meet() 
		{
			System.out.println("this is feb");
		}

	},
	MARCH, APRIL, MAY("summer"), JUNE, JULY, AUGUST, SEPTEMPER, OCOTOBER, NOVEMBER, DECEMBER;

	public void meet() 
	{
		System.out.println("remaining months");
	}

	String t;

	Month(String s) 
	{
		t = s;
	}

	Month() 
	{
		t = "empty";
	}
}