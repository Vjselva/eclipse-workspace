package leetcode;

public class LinkedList
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	
	public static LinkedList Insert(LinkedList list ,int data)
	{
		LinkedList.Node new_node=list.new Node(data);
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
			 last=last.next;	
			}
			last.next=new_node;
		}
					
		return list;
		
	}
	public static void printlist(LinkedList list) 
	{
		
		System.out.println("Linked List Printing");
		Node n=list.head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
	}
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
	     
		for(int i=0;i<=10;i++)
		{
			
			list=Insert(list,i);	
			
		}
		
		printlist(list);
		
		
		
	}
}


