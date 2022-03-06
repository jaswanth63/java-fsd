package innerclasses;

class OuterClass2 {
	private String msg = "Simplilearn";
	
	void display() {
		
		class InnerClass2 {
			void msg() {
				System.out.println(msg);
			}
		}
		
		InnerClass2 innerObj = new InnerClass2();
		innerObj.msg();
	}
}


public class LocalInnerClassDemo {

	public static void main(String[] args) {
		OuterClass2 outer = new OuterClass2();
		outer.display();

	}

}
