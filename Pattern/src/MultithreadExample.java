
public class MultithreadExample extends Thread {

	public void run() 
	{
		for (int i = 0; i <= 50; i = i + 2) 
		{
			System.out.println("Thread 1" + i);
		}
	}
	public static void main(String[] args) 
	{
		MultithreadExample multithread = new MultithreadExample();
		multithread.start();
		ThreadExample te=new ThreadExample();
		Thread t1=new Thread(te);
		t1.start();
		for (int i = 0; i <= 50; i = i + 3) 
		{
			System.out.println(" main " + i);
		}

	}

}
class ThreadExample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(2000);
				System.out.println("Runnable Thread");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}