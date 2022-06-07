/*
 *  JVM executes static blocks before the main method at the time of class loading
 	cannot access a non-static member (method , variable) from a static context
	this and super can't be used in static 
*/
class Parent {
	static int a = 0;
	int b = 0;;
	static // static block when class loads it will execute
	{
		System.out.println("From static block");
		// cannot return anything
	}

	public static void method() // The static method can access only static type data
	{
		a = 1;
		// b=1;// unable to access non static member inside static block
		System.out.println("Its a static Method no need to create a object to access it ");
		// can't overide
	}

	public void normalMethod() {
		a++; // common for all the objects
		b++;
		System.out.println("Static value " + a);
		System.out.println("Instance value " + b);
	}
}

public class Static_8 extends Parent {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.normalMethod();
		Parent p1 = new Parent();
		p1.normalMethod();
		Parent p2 = new Parent();
		p2.normalMethod();
		Parent.method();
//		 public void method()
//		 {
//			 System.out.println("Its a child class method, try to override a static method");
//		 }
	}
}