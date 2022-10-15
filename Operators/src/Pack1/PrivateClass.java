package Pack1;

public class PrivateClass {

	
	
	
	
	void m1() {
		System.out.println("m1");
	}
	
	void m1(int a) {
		System.out.println("m1 int a");
	}

	void m1(String s, float f) {
		System.out.println("m1  String s, float f");
	}

	void m1(float f, String s) {
		System.out.println("m1 String s, float f");
	}
	
	static void m1(char ch) {
		System.out.println("m2");
	}
	
	static void m2(int a) {
		System.out.println("m2 int a");
	}

	static void m2(String s, float f) {
		System.out.println("m2  String s, float f");
	}

	static void m2(float f, String s) {
		System.out.println("m2 String s, float f");
	}

}
