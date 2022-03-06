package innerclasses;

class OuterClass1 {
	private String msg = "Simplilearn";

	class InnerClass1 {
		void hello() {
			System.out.println(msg);
		}
	}
}

public class MemberInnerClassDemo {

	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
		
		OuterClass1.InnerClass1 inner = outer.new InnerClass1();
		inner.hello();
	}
}
