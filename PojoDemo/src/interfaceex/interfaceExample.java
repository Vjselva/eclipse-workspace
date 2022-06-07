package interfaceex;
/*
 * 
 * An interface in Java is a blueprint of a class. 
 * A Java interface contains static constants and abstract methods.
 */
public class interfaceExample implements Bike {

	@Override
	public void color() {
		System.out.println("Car color is green");
		
	}

	@Override
	public void speed() {
		System.out.println("Car speed is 450CC");
		Bike bike = new Bike() {

			@Override
			public void color() {
				
				
			}


			@Override
			public void speed() {
				// TODO Auto-generated method stub
				
			}
			
		};
		bike.color();
		
	}

	
	public void speed1() {
		System.out.println("Car speed is 450CC");
		
	}
	public static void main(String[] args) {
		
		interfaceExample ie=new interfaceExample();//first class
		ie.color();
		ie.speed();
		interfaceexample2 ie2=new interfaceexample2();//second class
		ie2.insurance();
		ie2.casepay();
		ie2.color();
		ie2.speed();
		interfaceClass ic=new interfaceClass();//interface inner classs
		ic.interfaceClassMethod();
		
		
	}
	

}
class interfaceexample2 implements Bike,Price {

	@Override
	public void insurance() {
		System.out.println("You need to pay month and month 800");
		
	}

	@Override
	public void casepay() {
		System.out.println("You are fully paid");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color : blue");
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed : 500cc");
	}


}
