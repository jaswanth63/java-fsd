package problemstatement2_2;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =13;
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		 for (int i = 1; i <= count; ++i)
	        {
	            System.out.print(n1+" ");

	            int sumOfPrevTwo = n1 + n2;
	            n1 = n2;
	            n2 = sumOfPrevTwo;
	        }

	}

}
