package problemstatement6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> arr=new ArrayList<String>();
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter  number of students :");
		int n=s.nextInt();
		System.out.println("Enter  student names :");
		
		for (int i=0; i<n; i++) {
			
			arr.add(s.next());
			
		}
		System.out.println("student list :");
		
		for (String x : arr) {
			
			System.out.println("Enter the name of serachable student :");
			String str=s.next();
			int position=Collections.binarySearch(arr,str);
			System.out.println("position of"+str+"is :"+position);

	}
  }
}
