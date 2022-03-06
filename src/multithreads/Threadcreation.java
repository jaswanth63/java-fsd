package multithreads;
class MultiThread1 extends Thread {

	public void run() {
		System.out.println("Thread is running...");
	}
}
class ThreadRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is running....");
	}
}
public class Threadcreation {
public static void main(String[] args) {
		
		MultiThread1 thread = new MultiThread1();
		thread.start();
		
		Runnable runnableObj = new ThreadRunnable();
		Thread t1 = new Thread(runnableObj);
		t1.start();

	}
}
