package co.javabasics.strings;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "$%^&12 Selenium ^&**& $World&*&&*%^ Java";
		System.out.println(str);
		
		//Regular expression [a-z A-Z 0-9]
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
