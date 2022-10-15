
public class stringPck {

	public static void main(String[] args) {

		String s1 = "Velocity"; 			// 1 //SCPA
		String s2 = "Velocity"; 			// point to SCPA Same add S1
		String s3 = new String("Class"); 	// 2 one into SCPA and One Heap points to Heap
		String s4 = "Velocity"; 			// point to SCPA same add S1 and S2 m/o created due s1
		String s5 = new String("Class"); 	// 1 Heap
		String s6 = new String("Syg"); 		// 2 one into SCPA and One Heap points to Heap
		String s7 = "Syg"; 					// point SCPA m/o created due S6
		String s8 = new String("Class"); 	// 1 Heap
		String s9 = new String("Velocity"); // 1 Heap
		String s10 = new String("Syg"); 	// 1 Heap
		String s11 = "Class"; 				// point to SCPA m/o created due s3
		
		System.out.println(s1==s2);   //true
		System.out.println(s3==s2);  //false
		System.out.println(s3==s5);  //false
		System.out.println(s2==s9);  //false
		
		System.out.println(s2.equals(s9));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
