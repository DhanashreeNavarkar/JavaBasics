package co.javabasics.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileWriteDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\Setups\\eclipse-workspace\\JavaBasics\\src\\co\\javabasics\\filehandling\\config.properties");
		Properties prop = new Properties();
		OutputStream os = new FileOutputStream(file);
		
		prop.setProperty("uname", "Sanjay");
		prop.setProperty("pass", "Rekha");
		
		prop.store(os, null);
		
	}

}
