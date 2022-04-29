package problemstatement1_3;
import java.util.Scanner;

public class TestBook {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String bookname=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        
        Book obj=new Book();
        obj.setBook_name(bookname);
        obj.setBook_price(price);
        System.out.println("Book Details");
        System.out.println("Book Name :"+obj.getBook_name());
        System.out.println("Book Price :"+obj.getBook_price());
		

	}

}
