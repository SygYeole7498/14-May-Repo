package Constrcutor;

public class MainClass {
	
	public static void main(String[] args) {
		Class1 ref_variable1 = new Class1();
		System.out.println(ref_variable1.a);
		System.out.println(ref_variable1.b);
	
		Class1 ref_variable2 = new Class1(100);
		System.out.println(ref_variable2.a);
		System.out.println(ref_variable2.b);
		
		Class1 ref_variable4 = new Class1(1000, 500.00f);
		System.out.println(ref_variable4.a);
		System.out.println(ref_variable4.b);
		
		Class1 ref_variable3 = new Class1(100, "class");
		System.out.println(ref_variable3.a);
		System.out.println(ref_variable3.b);	
	}
}
