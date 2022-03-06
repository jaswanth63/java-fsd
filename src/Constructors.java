class Q {
	int i;
	int j;
	
	
	
	
	Q(int i, int j) {
		this.i = i;
		this.j = j;
	}
}



class F  {
	int i;
	String s ;
	
	
	
	public F(int i) {
		
	}
	
	public F() {
		
	}
}


class C extends F {
	public C() {
		System.out.println("C constructor is called");
	}
}
public class Constructors {
	public static void main(String[] args) {
		
		
		
		C c = new C();
	}
}
