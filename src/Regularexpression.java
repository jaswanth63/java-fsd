import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpression {
	public static void main(String[] args) {
		String pattern = ".s";
		String input = "simplilearn";

		
		  Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(input);
		  
		  boolean result = m.matches(); System.out.println(result);
		 

		System.out.println(Pattern.matches("^(.+)@(.+)$", "jaswanth@simplilearn.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.-]+@(.+)$", "jaswanth@simplilearn.com"));
		
		System.out.println();

	}
}
