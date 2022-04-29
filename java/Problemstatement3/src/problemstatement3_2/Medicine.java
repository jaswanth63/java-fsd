package problemstatement3_2;

public class Medicine{
	public void displayLabel(){
	System.out.println("Company : Bayer Industries");
	System.out.println("Address : Hyderabad");
	}
	}
class Tablet extends Medicine{
	public void displayLabel() {
		System.out.println("Multivitamin tablets");
		
	}
}

class Syrup extends Medicine{
	public void displayLabel(){
	System.out.println("Cough syrup");
	}
	}
class Ointment extends Medicine{
	public void displayLabel(){
	System.out.println("Soframycin ointment");
}
}
