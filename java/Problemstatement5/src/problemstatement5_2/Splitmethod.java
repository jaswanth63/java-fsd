package problemstatement5_2;

public class Splitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt= (" 23  +  45  -  (  343  /  12  ) ");
		String[] w=txt.split("\\s");
		
		for(String w1:w){  
			System.out.println(w1); 
			
		}
	}

	}


