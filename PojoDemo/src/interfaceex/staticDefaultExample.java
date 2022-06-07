package interfaceex;

public class staticDefaultExample implements staticDefault{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface display method");
	}
	public void message()
	{
		System.out.println("Its a class method");
	}
		public static void main(String args[])
		{
			staticDefaultExample sde=new staticDefaultExample();
			staticDefault s=new staticDefaultExample();//---> data Binding
			System.out.println(s);
			s.display();
			s.input();
			
			sde.message();
			sde.display();
			staticDefault.print();
			sde.input();
			
			
		}
		
		
	}


