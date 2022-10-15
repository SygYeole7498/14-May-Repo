package Abstraction;

public abstract class Class1 {

	final static int a = 19;
	
	int b= 49;
	static int c=50;

	Class1() {
		System.out.println("Class1 C");
	}

	abstract void m1(); // abstract//incomplete
	abstract void m3(); // abstract//incomplete

	void m2() { // concrete method //complete
		System.out.println("Void M2 Abstract Class");
	}
}
