package exceptionhandling;

class EmployeeNotFoundException extends Exception {
	
}
class Employee {
	
	Employee readEmployee(int empId) throws EmployeeNotFoundException {
		if(empId == 0) {
			throw new EmployeeNotFoundException();
		}
		return null;
	}
	
}


public class Customexception {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		try {
			e.readEmployee(0);
		} catch (EmployeeNotFoundException e1) {
			e1.printStackTrace();
		}
		
	}
}
