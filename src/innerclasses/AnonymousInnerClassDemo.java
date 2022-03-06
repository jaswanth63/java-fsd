package innerclasses;

abstract class A {
	public abstract void hello() ;
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		
		A a = new A() {
			
			@Override
			public void hello() {
				System.out.println("Inside annonymous inner class");
				
			}
		};
		
		a.hello();
	}

}
