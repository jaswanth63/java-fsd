package oops;

class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}
	
	float add(int a, int b, int c) {
		return a+b+c;
	}
	
}


public class Compiletimepolymorphism {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.add(1, 2));

		System.out.println(c.add(1, 1, 2));
	}

}
