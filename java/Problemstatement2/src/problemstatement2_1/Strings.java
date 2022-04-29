package problemstatement2_1;


public class Strings {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

	      String str = args[0];
	      
	      String rev = "";
	      
	 
	      int length = str.length();
	      System.out.println(length);
	      
	      String Upper = str.toUpperCase();
	      System.out.println(Upper);
	 
	      for ( int i = length - 1; i >= 0; i-- ) {
	         rev = rev + str.charAt(i);
	      }
	      if (str.equals(rev)) {
	         System.out.println(str+" is a palindrome");
	      }
	      else {
	         System.out.println(str+" is not a palindrome");
	      }
	      

	}

}
