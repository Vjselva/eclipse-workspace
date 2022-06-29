package Date;

import java.util.Date;

class ImportantFunc
{
	void dateFunctions()
	{
		
		        // Creating date
		        Date d1 = new Date(2000, 11, 21);
		        Date d2 = new Date();  // Current date
		        Date d3 = new Date(2010, 1, 3);
		  
		        boolean a = d3.after(d1);
		        System.out.println("Date d3 comes after date d2: " + a); //check after date or not
		  
		        boolean b = d3.before(d2);
		        System.out.println("Date d3 comes before date d2: " + b); //check before date or not
		  
		        int c = d1.compareTo(d2);
		        System.out.println(c); // if return 0 its equal , return less than 0--> before date , return greater than 0 after date
		 
		  
		        System.out.println("Miliseconds from Jan 1 "+
		                "1970 to date d1 is " + d1.getTime());
		  
		        System.out.println("Before setting "+d2);
		        d2.setTime(204587433443L);
		        System.out.println("After setting "+d2);
		    
		
	}
	
}

public class ImportantMethods {
	public static void main(String[] args) {
		new ImportantFunc().dateFunctions();
	}
	

}
