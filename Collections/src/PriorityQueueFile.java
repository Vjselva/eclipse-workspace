import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class PriorityQueueFile {

	public static void main(String[] args) throws IOException {
		
		//PriorityQueue example with Comparator
		Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
		addDataToQueue(customerPriorityQueue);
		
		pollDataFromQueue(customerPriorityQueue);
		
	}
	
	//Comparator anonymous class implementation
	public static Comparator<Customer> idComparator = new Comparator<Customer>(){
		
		@Override
		public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId()- c2.getId());
        }
	};

	//utility method to add random data to Queue
	private static void addDataToQueue(Queue<Customer> customerPriorityQueue) throws IOException {
		
		File folder = new File("F://Files/");
		File filesList[] = folder.listFiles();
		//System.out.println(listOfFiles.length);
		 for(File file : filesList) {
		 FileReader fr = new FileReader(file);
		 int count=0;
		 String temp="";
		 int i=0;
		    while ((i = fr.read()) != -1)
		    {
		      count++;
		      temp+=(char)i;
		    }
		    System.out.println(temp);
		    System.out.println(count);
		    customerPriorityQueue.add(new Customer(count,temp));
		      
		        
		}
}
	
	//utility method to poll data from queue
	private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
		while(true){
			Customer cust = customerPriorityQueue.poll();
			if(cust == null) break;
			System.out.println("Processing Customer with ID="+cust.getId()+" file content " +cust.getName());
		}
	}

}