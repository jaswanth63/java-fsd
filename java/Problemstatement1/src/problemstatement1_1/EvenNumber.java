package problemstatement1_1;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number:");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}

	}

}
