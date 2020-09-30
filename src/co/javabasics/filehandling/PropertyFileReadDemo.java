package co.javabasics.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReadDemo {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\Setups\\eclipse-workspace\\JavaBasics\\src\\co\\javabasics\\filehandling\\config.properties");
		
		Properties p = new Properties();
		InputStream i = new FileInputStream(f);
		
		p.load(i);
		
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("pass"));
		p.list(System.out);

	}

}
