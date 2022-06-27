package Date;
import java.io.*;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class Dateformat
{
	void format()
	{
		  Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		    String strDate = formatter.format(date);  
		    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
		  
		    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
		  
		    formatter = new SimpleDateFormat("dd MMMM yyyy");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
		  
		    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
		  
		    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
		    strDate = formatter.format(date);  
		    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	}
	
	void timeStamp()
	{
		Date now = new Date();
        System.out.println("Current Date in milliseconds is :" + now.getTime());
        // Display the instant in three different time zones
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        System.out.println(now);
        TimeZone.setDefault( TimeZone.getTimeZone("GMT"));
        System.out.println(now);
        TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
        System.out.println(now);
        TimeZone.setDefault( TimeZone.getTimeZone("Australia/Sydney"));
        System.out.println(now);
        TimeZone.setDefault( TimeZone.getTimeZone("America/Phoenix"));
        System.out.println(now);
        TimeZone.setDefault( TimeZone.getTimeZone("America/New_York"));
        System.out.println(now);
        TimeZone.setDefault( TimeZone.getTimeZone("IST"));
        System.out.println(now);
        
	}
	
}

public class SimpledateFormat
{
	public static void main(String[] args) {
		//System.out.println("hai");
		new Dateformat().format();
		new Dateformat().timeStamp();
		
	}
}