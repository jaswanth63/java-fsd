package multithreads;

class MyRunnable implements Runnable {

	public void run() {
		for(int i=0; i<5; i++) {
			try {
				
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

public class Threadsleep {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		
		
		t1.start();
		
		t1.join();
		
		t2.start();
	}

}
