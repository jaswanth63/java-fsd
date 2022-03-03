
public class Longestsequence {

	static int lis(int arr[],int n) {
		int lis[] = new int[n];
		int i, j, max = 0;
		//initialize  value to all indexes
		for( i=0;i<n;i++) {
			
			lis[i]=1;
			
		}
		
		for(i=1;i<n;i++) {
			for(j=0;j<n;j++) {
				if(arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;

		
	}
	public static void main(String[] args) {
		int arr[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		int n = 16;
		System.out.println(lis(arr, n));
		

	}

}
