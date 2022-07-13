package ATM;

import java.util.regex.Pattern;

public class ValidationPage {
	
	public static boolean checkNumber(String s)
	{
		if(s.length()==1 && Character.isDigit(s.charAt(0)))
		{
			return true;
		}
		
		return false;
	}
	public static boolean checkName(String name)
	{
		return Pattern.compile("^[a-zA-Z\\s]{3,30}$").matcher(name).matches();
	}
	public static boolean checkPanNumber(String panno) {
		
		return Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]{1}$").matcher(panno).matches();
	}
	public static boolean checkPassword(String password) {
	
		return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$").matcher(password).matches();
	}
	
}
