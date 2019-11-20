package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable{
	private int number;
	public ThreadedGreeter(int n) {
		number = n;
	}
	
	@Override
	public void run() {
		System.out.println("Hello from thread: " + number);
		if(number < 50) {
			Thread t = new Thread(new ThreadedGreeter(number + 1));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
