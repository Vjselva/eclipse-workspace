package Mail;

import java.util.regex.Pattern;

public class MailValidation {

	public static boolean checkNumber(String option) {
		if(option.length()==1 && Character.isDigit(option.charAt(0)))
		{
			return true;
		}
		return false;
	}

	public static boolean checkName(String name) {
		
		return Pattern.compile("^[a-zA-Z\\s]{3,30}$").matcher(name).matches();
	}

	public static boolean checkMobileNo(Long mobileno) {
		// TODO Auto-generated method stub
		String mobileNo=String.valueOf(mobileno);
		return Pattern.compile("^(0/91)?[7-9][0-9]{9}$").matcher(mobileNo).matches();
	}
	
	public static boolean checkPassword(String password) {
		
		return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$").matcher(password).matches();
	}

	public static boolean checkAge(String age) {
		boolean flag=false;
		if(age.length()<=3)
		{
			for(int i=0;i<age.length();i++)
			{
				if(Character.isDigit(age.charAt(i)))
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
			
		}
		return flag;
	}

	
	
	
	

}
