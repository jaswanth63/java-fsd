package problemstatement2_3;

public class Array {
	public static void main(String[] args) {
		 int [] arr = new int [] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0}; 
		 int sum =0;
		 int temp =0;
		 int avg = 0  ;
		 int min = arr[0]; 
		 for(int i=0 ;i<=14;i++) {
			 sum=sum+arr[i];
		 }
		 arr[15]=sum;
		 for(int j=0;j<arr.length;j++) {
			 temp = temp + arr[j];
			 avg = temp/arr.length;
			  
		 }
		 arr[16]= avg;
		 for (int i = 0; i < arr.length; i++) {  
	             
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
		 arr[17]=min;
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" "); 
			 
		 }
			  
		 
		 
		
		
	}

}
