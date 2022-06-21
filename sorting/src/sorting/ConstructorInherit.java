package sorting;
class Parent
{
	Parent()
	{
		System.out.println("hai");
	}
}
class Child extends Parent
{
	Child()
	{
		//super();
		System.out.println("Child");
		
	}
}
public class ConstructorInherit {
	public static void main(String[] args) {
		Child ab=new Child();
	}
	

}
