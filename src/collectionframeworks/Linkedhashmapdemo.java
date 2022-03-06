package collectionframeworks;

import java.util.LinkedHashMap;
import java.util.Set;

public class Linkedhashmapdemo {

	public static void main(String[] args) {

		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("first", "Zalak");
		linkedHashMap.put("second", "Amit");
		linkedHashMap.put("third", "Subham");

		
		Set<String> keys = linkedHashMap.keySet();
		for(String key : keys) {
			System.out.println(key);
		}

	}

}
