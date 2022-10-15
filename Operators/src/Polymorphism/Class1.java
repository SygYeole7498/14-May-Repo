package Polymorphism;

public class Class1 {

	void m1() {
		System.out.println("M1 without argument");
	}
	
	static void m1(int a) {
		System.out.println("static M2 without argument");
	}

	void m1(int a, String b) 
	{
		System.out.println("M1 int a String b");
	}

	void m1(String a) {
		System.out.println("M1 String a");
	}
	
	

	static void m2(int a, String b) {
		System.out.println("static M2 int a String b");
	}

	static void m2(String a) {
		System.out.println("static M2 String a");
	}

}
