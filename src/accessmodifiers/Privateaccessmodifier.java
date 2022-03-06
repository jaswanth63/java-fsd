package accessmodifiers;
class A {
	private int data = 40;
	
	void test() {
		System.out.println(data);
	}
}
public class Privateaccessmodifier {
	public static void main(String[] args) {
		A a = new A();
		a.test();
	
	}
}
