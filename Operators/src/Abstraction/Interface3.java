package Abstraction;

public interface Interface3 {

	void m1(); //common
	
	default void m3() {
		System.out.println("M3 INTERFACE3");
	}
	default void m4() {
		System.out.println("M4 INTERFACE3");
	}
}
