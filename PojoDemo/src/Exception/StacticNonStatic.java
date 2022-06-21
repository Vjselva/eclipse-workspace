package Exception;

class StaicBlock
{   
	StaicBlock()
	{
		System.out.println("Parent constructor ");
	}
	static 
	{
		System.out.println("Classs 2 static ");
	}
	{
		System.out.println("parent empty");
	}
	
}

public class StacticNonStatic extends StaicBlock {
	StacticNonStatic()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("empty method");
	}
	static
	{
		System.out.println("1.static");
	}
	static
	{
		System.out.println("2.static");
	}

	public static void main(String[] args) {
		
		StacticNonStatic st=new StacticNonStatic();
		StacticNonStatic.gain();
		//StaicBlock sb=new StaicBlock();
		System.out.println("main method");
	}
	public static void gain()
	{
		System.out.println("static method");
	}
}
