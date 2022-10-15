package Abstraction;

public class MinaClass {

	public static void main(String[] args) {
		Class2 c1 = new Class3();
		c1.m1(); // child class
		c1.m2(); // abstract
		c1.m3(); // child class

		Interface1 I1 = new Class4();
		I1.m1();
		I1.m2();
		I1.m4();
		Interface1.m3();  //Calling to static 
	}
}
