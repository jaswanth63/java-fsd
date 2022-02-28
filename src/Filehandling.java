import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Filehandling {

	public static void main(String[] args) throws IOException {
	      
		    //writing in the file
		
			String s ="hello , created a file and writing data into it";
			Files.write(Paths.get("/home/tekijaswanthmph/Documents/file1"),s.getBytes());
			
			
			//append the file
			String data= "simplilearn java fsd project";
			File file = new File("/home/tekijaswanthmph/Documents/file2");
			FileWriter writer = new FileWriter(file);
			writer.append(data);
			writer.close();
			
			//read the file
			
			BufferedReader reader = new BufferedReader(new FileReader("/home/tekijaswanthmph/Documents/file2"));
			String line = reader.readLine();
			System.out.println(line);
		}
	}


