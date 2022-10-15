package Abstraction;
public interface Interface1 {

	int a = 10; // Public+static+final
	void m1(); // Public+abstract
	void m2(); // Public+abstract
	
	default void m4() {
		System.out.println("M4 Interfce1");
	}
	default void m5() {
		System.out.println("M5 Interfce1");
	}
}
