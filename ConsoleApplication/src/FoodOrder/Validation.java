package FoodOrder;

import java.util.regex.Pattern;

public class Validation {

	public static boolean checkNumber(String option) {
		if (option.length() == 1 && Character.isDigit(option.charAt(0))) {
			return true;
		}

		return false;
	}

	public static boolean checkName(String name) {
		// TODO Auto-generated method stub
		return Pattern.compile("^[a-zA-Z\\s]{3,30}$").matcher(name).matches();
	}

	public static boolean checkMobileno(String mobileno) {
		boolean flag=false;
		if(mobileno.length()==10)
		{
			for(int i=0;i<mobileno.length();i++)
			{
				if(Character.isDigit(i))
				{
					flag=true;
				}
			}
		}
		return flag;
	}

	public static boolean checkPassword(String password) {
	
		return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$").matcher(password).matches();
	}

	public static boolean foodPriceCheck(String price) {
		boolean flag=false;
		if(price.length()<6)
		{
			for(int i=0;i<price.length();i++)
			{
				if(Character.isDigit(price.charAt(i)))
				{
					flag=true;
				}
			}
		}
		return flag;
	}

}
