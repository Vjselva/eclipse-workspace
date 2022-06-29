class cat
{
	void drink(int d)
	{
		System.out.println("Hai Hai");
	}

}
public class Catclass extends cat {
	void drink(double x)
	{
		System.out.println("bye bye");
	}
	public static void main(String[] args) {
		Catclass c = new Catclass();
		
		c.drink(12.0);
		c.drink(12);
	}

}
