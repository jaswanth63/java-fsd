package collectionframeworks;

import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {

		TreeSet<String> data = new TreeSet<>();
		data.add("Zalak");
		data.add("Amit");
		data.add("Sumit");
		data.add("Supriya");

		for (String d : data) {
			System.out.println(d);
		}

	}

}
