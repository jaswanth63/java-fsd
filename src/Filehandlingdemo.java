import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Filehandlingdemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		 createFileMethod1();
		 createFileUsingNIO();

		readFileContent();

	}

	private static void readFileContent() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C://temp/simplilearn3.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	}

	private static void createFileUsingNIO() throws IOException {
		// Java.nio package
		String data = "Hello Simplilearn!";
		Files.write(Paths.get("C://temp/simplilearn2.txt"), data.getBytes());

		List<String> lines = new ArrayList<String>();
		lines.add("1st line");
		lines.add("2nd line");
		lines.add("3rd line");

		Files.write(Paths.get("C://temp/simplilearn3.txt"), lines, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

	private static void createFileMethod1() throws IOException {
		File file = new File("c://temp/simplilearn1.txt");

		if (file.createNewFile()) {
			System.out.println("File created successfully");
		} else {
			System.out.println("File is already exist");
		}

		String data = "Simplilearn.. Hello !";

		
		  FileOutputStream fos = new FileOutputStream(file);
		  fos.write(data.getBytes()); fos.close();
		 

		FileWriter writer = new FileWriter(file);
		writer.append(data);
		writer.append(data);
		writer.close();
	}
}
