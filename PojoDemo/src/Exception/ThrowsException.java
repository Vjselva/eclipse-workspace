package Exception;

import java.util.Scanner;

class ThrowsEx 
{
	void dividebyZero() throws Exception
	{
		int i=1;
		System.out.println(i);
	}
}


public class ThrowsException {
	
	public static void main(String[] args) throws Exception 
	{
		new ThrowsEx().dividebyZero();
	}


}
