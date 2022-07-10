package ATM;

public class ValidationPage {
	
	public static boolean checkNumber(String s)
	{
		if(s.length()==1 && Character.isDigit(s.charAt(0)))
		{
			return true;
		}
		
		return false;
	}

}
