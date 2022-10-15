package Abstraction;

public interface Interface2{

	void m1(); // Public+abstract
	void m2(); // Public+abstract
	
	//Override from Interface1 and Modify
	default void m4() {
		System.out.println("M4 Interfce2");
	}
	
	default void m3() {
		System.out.println("M3 Interfce2");
	}

}
