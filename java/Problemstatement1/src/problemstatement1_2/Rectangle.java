package problemstatement1_2;
import java.util.Scanner;

public class Rectangle {

	int length;
	int breadth;
	int area;
	
	public Rectangle(){
		
		length=0;
		breadth=0;	

	}
	public void userinput() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the length value:");
		length=s.nextInt();
		System.out.println("Enter the breadth value:");
		breadth=s.nextInt();

		
	}
	public void area() {
		 area = length*breadth;
		
	}
	public void details() {
		System.out.println("length of rectangle :"+length);
		System.out.println("breadth of rectangle :"+breadth);

		System.out.println("Area of rectangle :"+area);

		
		
	}

}
