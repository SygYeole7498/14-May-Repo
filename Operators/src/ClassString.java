
public class ClassString {

	public static void main(String[] args) {
		//immutable
		String s = "Class";// stored in constant pool area 
		String s2 = "Class"; //seperate morory will not create  
		String s6 = new String("Class"); //seperate memory
		String s1 = new String("Velocity");//seperate memory
		String s4 = new String("Velocity"); //seperate memory

		System.out.println(s1 == s4); // address//location
		System.out.println(s.equals(s6)); //data

	}

}


