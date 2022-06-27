import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterviewHall {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		Queue<Integer> totalMembers =new LinkedList<Integer>(); 
		for(int i=1;i<=n;i++) {
			totalMembers.add(i);
		}
	
		try {
			for(int i=0;i<n;i++) {
				loop(totalMembers);
			totalMembers.poll();
			
				Thread.sleep(1000);
			}	
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		sc.close();
	}
	public static void loop(Queue<Integer>totalMembers ) {
		int m=0;
		for(Integer item:totalMembers) {
			if(m<5) {
				System.out.print(item+" | ");
			}
			else {
				break;
			}
			m++;
			
		}
		System.out.println();
	}
	
}