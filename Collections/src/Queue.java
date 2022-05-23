import java.util.*;



public class Queue {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Queue");
		System.out.println("2.Dequeue");
		
		System.out.println("Enter your Choice: ");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		
			PriorityQueue<String> queue=new PriorityQueue<String>();  
			System.out.println("How many student name Do you want to add in Queue");
			int count=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Names");
			System.out.println("----- --- -----");
			for(int i=0;i<count;i++)
			{
				String name=sc.nextLine();
				queue.add(name);
			}
			System.out.println("Fetch head value by element():"+queue.element());  
			System.out.println("Fetch head value by peek()"+queue.peek());  
			System.out.println("List of the queue elements:");  
			Iterator itr=queue.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			queue.remove();  
			queue.poll();  
			System.out.println("after removing two elements:");  
			Iterator<String> itr2=queue.iterator();  
			while(itr2.hasNext()){  
			System.out.println(itr2.next()); }
			break;
		
		case 2:
			 Deque<String> deque=new ArrayDeque<String>();  
			 System.out.println("How many student name Do you want to add in Deque");
				int count1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Names");
				System.out.println("----- --- -----");
				for(int i=0;i<count1;i++)
				{
					String name=sc.nextLine();
					deque.add(name);
				}
				
				System.out.println("Dequeue Elements.");  
			    for(String s:deque){  
			        System.out.println(s);  
			    }  	
			    deque.offer("Aravind");  
			    deque.add("Asath");  
			    deque.offerFirst("Kathir");  
			    deque.pollLast();  //poll() and pollFirst() same in its function
			    System.out.println("After using offer(), offerfirst(), pollLast() methods.");  
			    for(String s:deque){  
			        System.out.println(s);  
			    }  
			    break;
			    
		default:
			System.out.println("Please enter available choice only");
			
				
	  

	}
}
}
	