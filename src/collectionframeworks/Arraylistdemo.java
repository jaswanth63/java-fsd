package collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {
	
	void test(ArrayList<Integer> data) {
		data.add(99);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[3];
		a[0] = 7;
		a[1] = 8;
		a[2] = 9;

		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(8);
		list.add(7);
		
		
		Iterator<Integer> listItr = list.iterator();
		
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		for(Integer val : list) {
			System.out.println(val);
		}
		
		new Arraylistdemo().test(list);
		
		
	}
}
