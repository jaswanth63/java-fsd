package collectionframeworks;

import java.util.PriorityQueue;

public class PriorityQueuedemo {
public static void main(String[] args) {
		
		PriorityQueue<String> data = new PriorityQueue<>();
		
		data.add("Rod");
		data.add("Amit Sharma");
		data.add("Jaishankar");
		data.add("zalak");
		
		System.out.println(data.element());
		System.out.println(data.element());
		
		System.out.println(data.peek());
		
		System.out.println(data.poll());
		System.out.println(data.poll());
		
		System.out.println(data.remove());
		System.out.println(data.remove());
		

	}
}
