package _06_Wait_and_Notify;

/*

Below are two threads. One thread increments the counter
and the other thread prints the result. If you run the
program as it is, you'll notice that the output in not
sequential.
Your goal is to modify the code inside the threads so that 
they are in synch. Use synchronized, wait, and notify to make
it so that t1 will only increase counter after t2 has printed 
the previous result. The output should be the numbers 0 to 100000
printed in order.
  
*/

public class SynchedSplitLoops {
	static int counter = 0;
	static final Object mutex = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (mutex) {
				for (int i = 0; i < 100000; i++) {
					
					// 1. Wait here until t2 calls notify
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						System.out.println("Interrupted t1 thread");
					}
					
					counter++;
					
					// 5. Notify t2 to wake up wake up AFTER counter++
					mutex.notify();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (mutex) {
				for (int i = 0; i < 100000; i++) {
					
					// 2. Print counter
					System.out.println(counter);
					
					// 3. Notify t1 to wake up
					mutex.notify();
					
					// 4. Wait until t1 calls notify, which only happens AFTER counter++
					try {
						mutex.wait();
					} catch (InterruptedException e) {
						System.out.println("Interrupted t2 thread");
					}
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.err.println("Could not join threads");
		}

	}
}