public class Exceptionex {
	public static void main(String[] args) throws Exception {

		// display();
		calculate();

	}

//	static void display() throws Exception
//	{
//			int a=5/20; throw new ArithmeticException("not able to divide");
//	
//	}
	static void calculate() {
		int a = 5 / 0;
	}

}
