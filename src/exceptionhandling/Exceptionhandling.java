package exceptionhandling;

public class Exceptionhandling {
public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		String s = null;
		
		try {
			int c = a/b;	// Breaking the upcoming flow of program
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Exception occurred, please contact to admin");
		} catch(Exception e) {
			System.out.println("Generic exception");
		} finally {
			
			System.out.println("Finally block executed");
		}
		
		
		System.out.println("End of program");
		
				

	}
}
