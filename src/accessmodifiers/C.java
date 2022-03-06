package accessmodifiers;

public class C {
int a = 5;
	
	void a() {
		b();
	}
	
	void b() {
		c();
		int k = 5;
	}
	
	void c() {
		int i = 5;
		int j = 6;
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.a();
	}
}
