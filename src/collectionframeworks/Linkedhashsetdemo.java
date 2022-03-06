package collectionframeworks;

import java.util.LinkedHashSet;

public class Linkedhashsetdemo {

	public static void main(String[] args) {
		LinkedHashSet<String> data = new LinkedHashSet<>();
		data.add("Zalak");
		data.add("amit");
		data.add("Sumit");
		data.add("Supriya");
		
		for(String d : data) {
			System.out.println(d);
		}
	}
}
