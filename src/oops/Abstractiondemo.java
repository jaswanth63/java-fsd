package oops;

abstract class Shape {
	
	abstract void draw() ;
	
	void test() {
		System.out.println("Test is executed");
	}
}

  class Circle extends Shape {

	
	@Override
	void draw() {
		System.out.println("Circle draw method called");
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Rectangle draw method called");
	}
}



public class Abstractiondemo {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		
		Shape s2 = new Rectangle();
		s2.draw();

	}

}
