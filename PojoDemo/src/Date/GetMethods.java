package Date;

import java.util.Calendar;

class GetInstance
{
	void getMethods()
	{
		
		 Calendar calendar = Calendar.getInstance(); // create instance without new keyword.. using getInstance static Method
		 
		 
		 // add in days , months, year
	        calendar.add(Calendar.DATE, -15);
	        System.out.println("15 days ago: " + calendar.getTime());
	        calendar.add(Calendar.MONTH, 4);
	        System.out.println("4 months later: " + calendar.getTime());
	        calendar.add(Calendar.YEAR, 2);
	        System.out.println("2 years later: " + calendar.getTime());
		 
		// Calendar--> get()method
	        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR)); // get a year
	        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));  //get a date
	        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE)); // get a minute
	        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND)); // get a second
	        
	      // maximum method 
	        System.out.println("Maximum number of days in a week: " + calendar.getMaximum(Calendar.DAY_OF_WEEK)); // return maximum day of the week
	        System.out.println("Maximum number of weeks in a year: " + calendar.getMaximum(Calendar.WEEK_OF_YEAR)); // return maximum week of the year
		
	      // Minimum method
	     
	        System.out.println("Minimum number of days in week: " + calendar.getMinimum(Calendar.DAY_OF_WEEK));
	        System.out.println("Minimum number of weeks in year: " + calendar.getMinimum(Calendar.WEEK_OF_YEAR));
	}
}


public class GetMethods {
	public static void main(String[] args) {
		new GetInstance().getMethods();
		
	}

}
