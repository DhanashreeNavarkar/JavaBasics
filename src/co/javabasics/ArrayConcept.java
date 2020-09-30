package co.javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array: to store similar data type values in variable
		/*disadvantage
		 * size is fixed (static) - to overcome this we use collections i.e. dynamic 
		 * similar data types- to overcome this we use object array
		 */
		//lowest bound=0
		//upper bound= n-1
		// one dimensional array 
		
		int i[] = new int[4];
		i[0] = 10;
		i[1]=20;
		i[2]= 30;
		i[3]= 40;	
		
		System.out.println(i[2]);
		//System.out.println(i[4]); location not found - java.lang.ArrayIndexOutOfBoundsException
		System.out.println(i.length);
		
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
			
			String s[]= new String[3];
			s[0]= "rest";
			s[1]= "hey";
			s[2]= "hii";
			System.out.println(s.length);
			
			//Object Array: Object is a class
			Object ob[]= new Object[5];
			ob[0] = 'c';
			ob[1] = 24.56;
			ob[2] = "say";
			ob[3] = "12/7/1995";
			ob[4]= true;
			System.out.println(ob.length);
			
			for(int k= 0; k<ob.length; k++) {
				System.out.println(ob[k]);
			}
			}

	}

}
