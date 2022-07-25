package leetcode;

class Stack
{
	int array[]=new int[10];
	int top;
	Stack()
	{
		top=-1;
	}
	boolean isEmpty()
	{
		return(top==-1);
	}
	boolean isfull()
	{
		return(top>50);
	}
	void push(int data)
	{
		if(top>=50)
		{
			System.out.println("Stack overflow");
			return ;
		}
		array[++top]=data;
	}
	int pop()
	{
		
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
	 int data= array[top];
	 top--;
	 return data;
	 
	}
	int peek()
	{
		return array[top];
	}
	
	void print()
	{
		System.out.println("Stack [ ");
		for(int i=0;i<=top;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.print("]");
	}
}

public class StackImplementaion {
	
	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		System.out.println(s.isEmpty());
		System.out.println(s.isfull());;
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.isEmpty());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.isEmpty());
		System.out.println(s.isfull());;
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.print();
		
	}

}
