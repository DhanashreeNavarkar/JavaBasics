package co.javabasics.filehandling;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setRollNo(29);
		st1.setName("Dhanashree");
		
		Student st2 = new Student();
		st2.setRollNo(30);
		st2.setName("Sanket");
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		
		College c = new College();
		c.setStudents(list);
		
		try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("D:\\Setups\\eclipse-workspace\\JavaBasics\\src\\"
					+ "co\\javabasics\\filehandling\\college.xml")));
			x.writeObject(c);
			x.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}

}
