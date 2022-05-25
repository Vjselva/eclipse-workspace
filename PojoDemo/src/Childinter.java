import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;

interface Parent
{
	public void print();
	void anau();
	
	
}
interface vani
{
	void van();
}
class Child implements Parent , vani
{
	public void print()
	{
		System.out.println("child");
	}
	public void anau()
	{
		System.out.println("zsdf");
	}
	public void van()
	{
		System.out.println("van");
	}
}
 abstract class Kalai implements Parent
{
	public void print()
	{
		System.out.println("kalai");
	}
}
public class Childinter {

	public static void main(String[] args) {
		Child c= new Child();
		c.print();
		c.van();
		Parent p= new Parent() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void anau() {
				// TODO Auto-generated method stub
				
			}
		};
	
	
	}

}