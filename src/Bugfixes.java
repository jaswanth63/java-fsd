import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Bugfixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Welcome!!");
		System.out.println("how can i help you?");
		choice();
	}
   static void choice() {
	   String arr[] = {"1.I want to view my expenditure","2.i want to add my expenditure","3.i want to delete my expenditure","4.i want to sort my expenditure","5.i want to search an expenditure","6.close"};
	   int arr1[]= {1,2,3,4,5,6};
	   for(int i=0;i<arr1.length;i++) {
		   System.out.println(arr[i]);
	   }
	   LinkedList<Integer> list = new LinkedList<>();
	   list.add(1000);
	   list.add(2500);
	   list.add(500);
	   list.add(4000);
	   list.add(7800);
	   list.add(3200);
	   while(true) {
	   System.out.println("enter the option");
	   Scanner s = new Scanner(System.in);
	   int option = s.nextInt();
	   for(int j =1;j<arr1.length;j++) {
		   if(option==j) {
			   switch(option) {
			   case 1:
                   System.out.println("Your expenses are:"+"\n"+list);
                   
                   break;
               case 2:
                   System.out.println("Enter the value  \n");
                   int value = s.nextInt();
                   list.add(value);
                   System.out.println("Your expenses is updated\n");
                  
                   System.out.println(list+"\n");
                   

                   break;
               case 3:
                   System.out.println("You are deleting all your expenses \n");
                   int con_choice = s.nextInt();
                   if(con_choice==option){
                          list.clear();
                       System.out.println(list+"\n");
                       System.out.println("All your expenses are deleted!\n");
                   } 
                   
                   break;
               case 4:
                   sortExpenses(list);
                   choice();
                   
               case 5:
                   searchExpenses(list);
                  
                   break;
               case 6:
                   close();
                   break;
               default:
                   System.out.println("please select the right choice!");
                   break;
			   }
		   }
	   }
	   
	   }
   }
  static void close() {
       System.out.println("Closing your application \nThank you!");
           }
   static void searchExpenses(LinkedList<Integer> list) {
       int l = list.size();
       System.out.println("Enter the expense you need to search:\t");
       //
       Scanner s = new Scanner(System.in);
       int input = s.nextInt();
       //Linear Search
       for(int i=0;i<l;i++) {
       	if(list.get(i)==input) {
       		System.out.println("Found the expense " + input + " at " + i + " position");
       	}
       }
   }
   static void sortExpenses(LinkedList<Integer>list) {
       int l=  list.size();
      //Complete the method. The expenses should be sorted in ascending order.
       
       Collections.sort(list);
       System.out.println("Sorted expenses: ");
       for(Integer i: list) {
       	System.out.print(i + " ");
       }
       
       System.out.println("\n");
      
   }
}
