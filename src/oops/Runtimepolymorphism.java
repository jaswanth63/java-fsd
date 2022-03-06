package oops;

class A {
	public int a;
}

class B extends A {
	int a = 5;
	
	void test() {
		a=5;
	}
}





abstract class Computer1 {

	abstract void compute();

	void test() {

	}

}

class Laptop extends Computer1 {

	void compute() {
		System.out.println("Laptop computing");
	}
}

class Desktop extends Computer1 {
	void compute() {
		System.out.println("Deskop Computing");
	}

}

abstract class Vehicle {
	abstract void run();
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}

	void run1() {

	}

}

public class Runtimepolymorphism {

	public static void main(String[] args) {

		

		Bike b = new Bike();
		b.run();

		Vehicle v1 = new Bike();
		v1.run();
	}

}
