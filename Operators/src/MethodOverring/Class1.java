package MethodOverring;

public class Class1 {

	static {
		System.out.println("block1");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	static {
		System.out.println("block2");
	}
	
	
	/*
	 * int a = 10;
	 * 
	 * void M1() { System.out.println("Class1 M1"); }
	 * 
	 * static void M2(int a) { System.out.println("Class1 M2"); }
	 */

}
