import java.util.TimerTask;

public class Timer {
 public static void main(String[] args) {
	 new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		                System.out.println("HAI");
		                System.out.flush();
		            }
		        }, 
		        1000000 
		);
}

}
