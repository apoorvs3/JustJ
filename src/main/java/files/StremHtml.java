package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StremHtml {
	public static void main(String[] args) throws IOException {
	
	// stream connectivity
	File f = new File("./src/main/java/props/xyz.html");
	FileWriter fw = new FileWriter(f, true);
	BufferedWriter writer = new BufferedWriter(fw);
	
	
	writer.write("<html> <body> <title> Some title </title> <h1>Typing in the HTML </h1> </body> </html>");
	
	writer.close();
	}
	
}
