import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linkedist {
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("selva");  
		  al.add("jeeva");  
		  al.add("hema");  
		  al.add("viji");  
		  al.add("jeeva"); 
		  
		  LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("selva");  
          ll2.add("ganesh");  
          
          
          al.addFirst("Lokesh");  
          al.addLast("Harsh");
          System.out.println("Add first and last "+al);
          al.addAll(ll2);
          System.out.println("After Add all method "+al);
          al.remove("hema");  
          al.removeFirst(); 
          al.removeLast();  
          System.out.println("After remove methods "+al);
          al.removeFirstOccurrence("Gaurav");
          
          
		  
		  //Iterator itr=al.iterator();  
		  //while(itr.hasNext()){  
		   //System.out.println(itr.next());  
		  }  
		 }  


