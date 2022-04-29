package problemstatement8_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



class ThreadA implements Runnable{
	 

	    public void run() {

	              

	        try {
	            Scanner read = new Scanner (new File("/home/tekijaswanthmph/Documents/file2"));
	            read.useDelimiter(",|\n");
	            String number;

	            while(read.hasNext())
	            {                
	              number = read.next();
	              

	              ArrayList<String> n = new ArrayList<String>();
	              n.add(number);

	              

	              System.out.println(number);
	              
	            }

	            read.close();

	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	      }
	   }
	


class ThreadB extends Thread {
	

   public void run( ) {

	   int fact =1;
	   
	   for(int x =1 ;x<=5;x++) {
		   fact=1;
	   
      for(int j = 1; j <= x; j++) {
    	  fact = fact *j;
        
      }
      System.out.println("Factorial of"+ x+" is "+fact);
   }
        
	}
}


public class Demo {
	
		
		
	
   public static void main(String args[]) {
	   ThreadA r1=new ThreadA();
        Thread a = new Thread(r1);
        ThreadB b = new ThreadB();
      
        a.start();
        b.start();
      
   }
}

