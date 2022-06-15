package ZohoQusetions;

public class PasswordEncryption {
	public static void main(String[] args) {
		
	String realString="Selvaz";
	String encryptString="";
	String normalString="";
	for(int i=0;i<realString.length();i++)
	{
		encryptString+=(char)(realString.charAt(i)+1);
	}
	System.out.println(encryptString);
	for(int i=0;i<realString.length();i++)
	{
		normalString+=(char)(encryptString.charAt(i)-1);
	}
	System.out.println(normalString);
	}
	
	

}
