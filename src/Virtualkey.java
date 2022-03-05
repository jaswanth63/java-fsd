import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Virtualkey {

	public static void main(String[] args) throws IOException {
		System.out.println("WELCOME.");
		
		options();

	}
	static void options() throws IOException {
		
		String arr[]= {"1.Retrieve Files","2.Business operations","3.close"};
		int arr1[]= {1,2,3};
		for(int i=0;i<arr1.length;i++) {
			   System.out.println(arr[i]);
		   }
		
			   System.out.println("enter the option");
			   Scanner s = new Scanner(System.in);
			   int option = s.nextInt();
			  
					   switch(option) {
					   case 1:
						   retrievefile();
						   System.out.println("\n");
						   options();
						   break;
						   
					   case 2 :
						   System.out.println("\n");
						   option1();
						   break;
					case 3 :
						System.out.println("application closed");
						   System.out.println("\n");
						   break;
					   }
				   
			   
		}
	static void option1() throws IOException {
		 String arr2[]= {"4.Add file","5.Delete file","6.search file","7.go back to main menu"};  
		   int arr3[]= {1,2,3,4};
			for(int i=0;i<arr3.length;i++) {
				   System.out.println(arr2[i]);
			   }
		
	      System.out.println("enter the option");
			   Scanner s1 = new Scanner(System.in);
			   int option1 = s1.nextInt();
			  
					   switch(option1) {
					   case 4:
						   addfile();
						   System.out.println("\n");
						   option1();
						   
					   break;
					   case 5:
						   deletefile();
						   System.out.println("\n");
						  option1();
					   break;
					   case 6:
						   searchfile();
						   System.out.println("\n");
					   option1();
					   break;
					   
					   
					   case 7:
						   System.out.println("going back to main menu");
						   System.out.println("\n");
						   options();
					   break;
						   
					   }
		   
				   
			   
		   
			   
	}
	
	static void retrievefile() {
		
	int filecount =0;
	ArrayList<String> files = new ArrayList<>();
	File directoryPath = new File("/home/tekijaswanthmph/Documents");
	File[] listOfFiles = directoryPath.listFiles();
	filecount = listOfFiles.length;
	
	
	
	for (int i = 0; i < filecount; i++) {
	  if (listOfFiles[i].isFile()) {
	    files.add(listOfFiles[i].getName());
	  } 
	}
	String[] str = new String[files.size()];
	 
    for (int i = 0; i < files.size(); i++) {
        str[i] = files.get(i);
    }
	
    String[] sorted_filenames = sort_sub(str, str.length);
	
	for(String currentFile: sorted_filenames) {
		System.out.println(currentFile);
	}
}
	static void addfile() throws IOException  {
		
		System.out.println("enter file name to add");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		String path ="/home/tekijaswanthmph/Documents/";
		File f = new File(path+"/"+filename);

		if (f.createNewFile()) {
			System.out.println("File created successfully");
		} else {
			System.out.println("File is already exist");
		}
		    }
		
	
	
	static void deletefile() {
		System.out.println("enter file name to delete");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
		String path ="/home/tekijaswanthmph/Documents/";
		File f = new File(path+"/"+filename);

    if (f.delete()) {
        System.out.println("File deleted successfully");
    }
    else {
        System.out.println("Failed to delete the file");
    }
}
	
	static void searchfile()  {
		System.out.println("enter file name to search");
		Scanner s = new Scanner(System.in);
		String filename = s.nextLine();
	    String path ="/home/tekijaswanthmph/Documents/";
	    File f = new File(path+"/"+filename);
	    if(f.exists() && f.isFile()) { 
	        System.out.println(path+filename+" : found");
	    } else {
	        System.out.println(path+filename+" : not found");
	    }
        }  
	protected static String[] sort_sub(String array[], int size){
		String temp = "";
		for(int i=0; i<size; i++){
			for(int j=1; j<(size-i); j++){
				if(array[j-1].compareToIgnoreCase(array[j])>0){
					temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

	}

