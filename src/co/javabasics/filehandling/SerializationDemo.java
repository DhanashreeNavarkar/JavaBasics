package co.javabasics.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	
	//Serialization is a mechanism of converting the state of an object into a byte stream. 

	public static void main(String[] args) throws Exception {

		Save s = new Save();
		s.i =4;
		System.out.println(s.i);
		
		File f = new File("D:\\Setups\\eclipse-workspace\\JavaBasics\\src\\co\\javabasics\\filehandling\\serialization.txt");
		FileOutputStream fos = new FileOutputStream(f); 
		
		System.out.println("File created");
		
		//since we are storing object we use ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(s);	
		
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Save obj1 = (Save) ois.readObject();
		System.out.println(obj1.i);
		
		
	}

}

//we cannot directly save an object value in file, hence we implement Serializable
class Save implements Serializable {
	
	int i;
	
}
