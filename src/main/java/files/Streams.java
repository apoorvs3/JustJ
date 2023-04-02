package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Streams {
	public static void main(String[] args) throws IOException {
	
		// stream connectivity
	File f = new File("./src/main/java/props/xyz.csv");
	FileWriter fw = new FileWriter(f, true);
	BufferedWriter writer = new BufferedWriter(fw);
	
	//write inside
//	writer.write("first line");
//	writer.newLine();
//	writer.write("Second line");
//	writer.write("Third line");
//	writer.newLine();
//	writer.write("fourth line");
	
	
//	for(int i=0; i< 100; i++) {
//		writer.newLine();
//		writer.write("writing the "+i+ " th line");
//	}
	
	for(int row=0; row<5; row++) {
		for(int cols=0; cols<5; cols++) {
			int num =(int)(Math.random()* 100);
			writer.write(num +",");
		}
		writer.newLine();
	}
	
	writer.close();
	}
	
}
