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
		
		
		Queue<Filecontent> filePriorityQueue = new PriorityQueue<>(7, idComparator);
		addDataToQueue(filePriorityQueue);
		
		pollDataFromQueue(filePriorityQueue);
		
	}
	

	public static Comparator<Filecontent> idComparator = new Comparator<Filecontent>(){
		
		@Override
		public int compare(Filecontent c1, Filecontent c2) {
            return (int) (c1.getCount()- c2.getCount());
        }
	};

	
	private static void addDataToQueue(Queue<Filecontent> filePriorityQueue) throws IOException {
		
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
//		    System.out.println(temp);
//		    System.out.println(count);
		    filePriorityQueue.add(new Filecontent(count,temp));
		      
		        
		}
}
	
	private static void pollDataFromQueue(Queue<Filecontent> filePriorityQueue) {
		while(true){
			Filecontent f = filePriorityQueue.poll();
			if(f == null) break;
			System.out.println("FILE DATA COUNT "+f.getCount()+" File Content " +f.getFilecontent());
		}
	}

}