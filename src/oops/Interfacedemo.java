package oops;

interface Shape1 {
	void draw() ;
	
	
}

interface Shape2 {
	void draw() ;
	
	
}

class Circle1 implements Shape1, Shape2 {

	@Override
	public void draw() {
		System.out.println("Circle is called");
	}
}


public class Interfacedemo {
	public static void main(String[] args) {
}
}