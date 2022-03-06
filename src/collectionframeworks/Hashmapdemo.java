package collectionframeworks;


	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Set;

	public class Hashmapdemo {

		public static void main(String[] args) {

			HashMap<Integer, String> map = new HashMap<>();

			map.put(1, "Amit");
			map.put(2, "Rahul");
			map.put(3, "Jai");
			map.put(3, "Zalak");
			map.put(null, "Akshay");
			map.put(null, "Akansha");

			System.out.println(map.get(1));
			System.out.println(map.get(3));

			Set<Integer> keys = map.keySet();
			for(Integer d: keys) {
				System.out.println(d);
			}
			
			Collection<String> values = map.values();
			for(String d: values) {
				System.out.println(d);
			}

		}
	}

