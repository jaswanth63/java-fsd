package java;

public class Typecasting {
public static void main(String[] args) {
		
		int x = 7;
		// automatically converts from integer to long
		long y = x;
		
		int z = (int) y;
		System.out.println(z);
		
		char a = 'A';
		int b = a;
		System.out.println(b);
		
		float c = a;
		System.out.println(c);
		
		double d = 42.09;
		int e = (int)d;
		System.out.println(e);
	}
}
