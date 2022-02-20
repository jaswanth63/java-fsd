package java;



import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1,number2;
		int result = 0;
		char operator;
		Scanner s =new Scanner(System.in);
		System.out.println("enter number1");
		number1 = s.nextDouble();
		System.out.println("enter the operator  + ,- ,*, /");
		operator =s.next().charAt(0);
		System.out.println("enter number2");
		number2 = s.nextDouble();
		switch(operator){
		
		case('+'):
		  result = (int)(number1+number2);
		    break;
		case('-'):
			result = (int)(number1-number2);
		    break;
		case('*'):
			result = (int)(number1*number2);
		    break;
		case('/'):
			result =(int)(number1/number2);
		    break;
		default:
			System.out.println("enter valid operator");
			break;
			
			
		}
		System.out.println(number1+" "+operator+" "+number2+" "+ "="+result);
		

	}

}
