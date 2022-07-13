/*
 java.lang.Object
java.util.Date

subclassses

	Date, Time, Timestamp
 */

package Date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//import java.sql.Date;

class DateFunctions
{
	void getDate()
	{
		Date d1 = new Date();
        System.out.println("Current date is " + d1);
        Date d2 = new Date(2323223232L);
        System.out.println("Date represented is "+ d2 );
//		Deprecated Functions
//		Date(int year, int month, int date, int hrs, int min);
//		Date(int year, int month, int date, int hrs, int min, int sec)
//      Date(int year, int month, int date, int hrs, int min, int sec)
//      Date(String s)
//		
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");  
        String strDate = dateFormat.format(new Date());  
        System.out.println(strDate);
	}
	void list()
	{
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("selva");
		al.addAll(al1);
		System.out.println(al);
		
		
	}
}


public class DateClass {
	
	public static void main(String[] args) {
		new DateFunctions().getDate();
		new DateFunctions().list();
		
	}

}
