package co.javabasics;

public class TwoDArray {
	
	public static void main(String args[]) {
		
		String a [][]= new String [3][5];
		System.out.println(a.length);	//no of rows
		System.out.println(a[0].length);	//no of columns
		a[0][0] = "A";
		a[0][1] = "B";
		a[0][2] = "C";
		a[0][3] = "D";
		a[0][4] = "E";
		
		a[1][0] = "F";
		a[1][1] = "G";
		a[1][2] = "H";
		a[1][3] = "I";
		a[1][4] = "J";
		
		a[2][0] = "K";
		a[2][1] = "L";
		a[2][2] = "M";
		a[2][3] = "N";
		a[2][4] = "O";
		
		for (int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}
