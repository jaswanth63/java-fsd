import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Emailid {
	

	private static Scanner s;

	public static void main(String[] args) {
		
		
		ArrayList<String> mailid = new ArrayList<>();
		mailid.add("abc@gmail.com");
		mailid.add("raju@gmail.com");
		mailid.add("hello@gmail.com");
		mailid.add("lokesh@gmail.com");
		mailid.add("priya@gmail.com");
		mailid.add("rahul@gmail.com");
		mailid.add("zara@gmail.com");
		mailid.add("farook@gmail.com");
		mailid.add("tina@gmail.com");
		
	Scanner s = new Scanner(System.in);
		System.out.println("enter email id");
		String input =s.nextLine();
		
		if(mailid.contains(input)) {
			System.out.println(input+" "+"is found");
			
		}else {
			System.out.println(input+" "+"is not found");
		}
		}
	}


