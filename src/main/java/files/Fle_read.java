package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Fle_read {
	public static void main(String[] args) throws IOException {
		File f =new File("./src/main/java/props/xyz.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		
		String line = null;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		
		reader.close();
	}
}
