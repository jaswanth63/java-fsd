package oops;

class Human1 {
	String eyes="Eye";
	String hand="Hand";
	String legs="Leg";
}

class Employee extends Human1 {
	int salary=40000;
	
	
}

class Employee1 {
	int salary = 33333;
}

class Programmer extends Employee1 {
	int bonus = 222;
	
	int getSalary() {
		return salary+bonus;
	}
}
 

public class Inheritancedemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.hand);
		
		Programmer p = new Programmer();
		System.out.println(p.getSalary());
		

	}

}
