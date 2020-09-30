package co.javabasics.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\Setups\\eclipse-workspace\\JavaBasics\\src\\co\\javabasics\\filehandling\\demo.txt");
	
		FileOutputStream fos = new FileOutputStream(file);
		
		//since we are storing date we use DataOutputStream
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Demo Content");
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
	}

}
