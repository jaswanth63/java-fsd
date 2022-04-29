package problemstatement6_4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBook {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		options();
	}
		static void options() {
			HashMap<Integer,String> hm =new HashMap<>();
		String arr[]= {"1.add new phone book","2.search a phone number","3.exit"};
		int arr1[]= {1,2,3};
		for(int i=0;i<arr1.length;i++) {
			   System.out.println(arr[i]);
		   }
		
			   System.out.println("enter the option");
			   Scanner s = new Scanner(System.in);
			   int option = s.nextInt();
			  
					   switch(option) {
					   case 1:
						   
						   System.out.println("enter phone no ");
						   int phoneno=s.nextInt();
						   System.out.println("enter name ");

						   String name =s.next();
						   
						   hm.put(phoneno, name);
						   options();
						   break;
						   
					   case 2:
						   System.out.println("enter the name to search");
						   String str =s.next();
						   for(Entry<Integer, String> entry: hm.entrySet()) {

							      
							      if(entry.getValue().equalsIgnoreCase(str)) {
							        System.out.println( entry.getKey());
							        
							      }
							    else {
							   System.out.println("Not Found");
							    }
						   }
						   options();
						   break;
					   case 3:
						   System.out.println("Program Terminated");
						   break;
						   
					   }
		}

	

}
