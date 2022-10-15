package Abstraction;

public interface Interface4 extends Interface3{

	void m1(); // common

	void m2();

	//COMMON
	default void m3() {
			System.out.println("M3 INTERFACE4");
	}
	
	default void m5() {
		System.out.println("M5 INTERFACE4");
}
}
