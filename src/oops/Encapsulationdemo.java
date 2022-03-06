package oops;

class Computer {
	String processor = "Intel_PRocessor";
	
}

class Human {
	private String kideney = "kidney";

	public String getKideney() {
		return kideney;
	}

	public void setKideney(String kideney) {
		this.kideney = kideney;
		
	}
}

public class Encapsulationdemo {

	public static void main(String[] args) {
		Computer c = new Computer();
		System.out.println(c.processor);
		
		Human h = new Human();
		System.out.println(h.getKideney());
		h.setKideney("Kideney1");
		System.out.println(h.getKideney());
		

	}

}