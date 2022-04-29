package problemstatement6_3;

import java.util.Iterator;
import java.util.LinkedList;

public class TestEmployee {
	
	public static LinkedList<Employee> addInput(){
		Employee e1 = new Employee(101,"rahul","hyderabad") ;
		Employee e2 = new Employee(102,"vihas","bangalore") ;
		Employee e3 = new Employee(103,"seeta","Chennai") ;
		LinkedList<Employee> ls = new LinkedList<Employee>();
		ls .add(e1);
		ls.add(e2);
		ls.add(e3);
		return ls;
		
	}
	public static void display(LinkedList<Employee> ls) {
		// TODO Auto-generated method stub
      Iterator<Employee> itr = ls.iterator();
		
		while(itr.hasNext()) {
		Employee value = itr.next();
		System.out.println(value.getEmpNo()+"\t"+value.getEmpName()+"\t"+value.getEmpAddress());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> ls = addInput();
		display(ls);
		

	}

}
