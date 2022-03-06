package collectionframeworks;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList<String> data = new LinkedList<>();

		data.add("Rishu");
		data.add("Rod");
		data.add("Sumit");
		
	

		for (String d : data) {
			System.out.println(d);
		}
	}
}
