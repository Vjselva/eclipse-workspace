
public class StaticMethodOverload {
	public static void display()
	{
		System.out.println("Normal display");
	}
	 void display(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		StaticMethodOverload st=new StaticMethodOverload();
		st.display();
		st.display(99);
	}
}
