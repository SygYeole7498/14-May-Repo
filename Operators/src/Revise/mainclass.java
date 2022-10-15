package Revise;

public class mainclass {
	public static void main(String[] args) {
		Class2 obj1 = new Class2();
		obj1.m1();
		obj1.m2();

		Class3 obj2 = new Class3();
		obj2.m1();
		obj2.m2();
		
		Class2 obj3= new Class3(); //RTP//DMD//Upcasting
		
		obj3.m1(); //Class2   //Class3
		obj3.m2(); //Class2  //Method Hiding 
		
		Encapsulation e= new Encapsulation();
		System.out.println(e.getStudentRoll());
		e.setStudentRoll(12345);
		
		System.out.println(e.getStudentRoll());
		int a= e.getStudentRoll();
		System.out.println(a);
	}
}
