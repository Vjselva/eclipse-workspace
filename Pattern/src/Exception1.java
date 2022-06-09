
class Parent
{
	private int i=10;
	protected void getter() {
		System.out.println(i);
	}
}
public class Exception1  extends Parent{

	public static void main(String[] args) {
		int i=20;
		Exception1 exception1=new Exception1();
		exception1.getter();
		
	}
}
