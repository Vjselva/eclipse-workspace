package FlightBooking;

import java.util.regex.Pattern;

public class FlightValidation {

	public static boolean checkNumber(String option) {
		if (option.length() == 1 && Character.isDigit(option.charAt(0))) {
			return true;
		}

		return false;
	}

	

}
