/*
 java.lang.Object
java.util.Date

subclassses

	Date, Time, Timestamp
 */

package Date;

import java.text.SimpleDateFormat;
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
		
	}
}


public class DateClass {
	
	public static void main(String[] args) {
		new DateFunctions().getDate();
		
	}

}
