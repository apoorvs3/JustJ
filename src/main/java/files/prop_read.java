package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class prop_read {
	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/main/java/props/object.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop.get("salary"));
	}
	
}

