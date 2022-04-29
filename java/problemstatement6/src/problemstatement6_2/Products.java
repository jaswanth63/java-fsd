package problemstatement6_2;

import java.util.Hashtable;
import java.util.Scanner;

public class Products {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Hashtable<String,String> hm = new Hashtable<String,String>();
		System.out.println(" Enter the Product id and name ");
		for (int i=0 ;i<10;i++)
		{
			hm.put(sc.next(), sc.next());
		}
		System.out.println(" The product list is : ");
		System.out.println(hm);
		System.out.println(" Enter the product id to be searched : ");
		String sid=sc.next();
		if(hm.containsKey(sid))
			System.out.println(hm.get(sid));
		else
			System.out.println(" Do not exists ");
		
		System.out.println(" Enter the product id to be removed :");
		String id =sc.next();
		hm.remove(id);
		System.out.println(" Item removed ");
		System.out.println(" The Product list is :");
		System.out.println(hm.toString());
		

	}

}
