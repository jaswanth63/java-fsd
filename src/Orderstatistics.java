
import java.util.Arrays;
import java.util.Scanner;


public class Orderstatistics {

	public static void main(String[] args) {
		int[] arr = { 12, 2, 1, 5, 7,8, 5, 3 };

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter kth element to search in array:");
			int k = sc.nextInt();
			
			int result = Orderstatistics.kthSmallestElement(arr, k);
			System.out.println("result:" + result);	
		}
		

	}

	static int kthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}

}
