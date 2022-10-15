package Pack1;

public class MethodsRepeat {

	void m1() {
		System.out.println("M1");
	}

	int m2() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c; // return the value of c
	}
		
	void m3(int a, int b) {
		int c = a + b;	
	}

	int m4(int a, int b) {
		int c = a + b;  //100+200
		return c; // return the value of c
	}
	
	static String m5(String a, String b) {
		String c = a + b;  //100+200
		
		System.out.println(c);
		return "class"; // return the value of c
	}
	
	float m(String a, String b) {
		String c = a + b;  //100+200
		return 252.7f; // return the value of c
	}

	
	public static void main(String[] args) {
		MethodsRepeat obj= new MethodsRepeat(); //copy
		obj.m4(100, 200); //call to m4();
		
		int m= obj.m4(100, 200); //call+use
		System.out.println(m); ///300
		
		System.out.println(obj.m4(500, 600));  //1100
		
		System.out.println(obj.m5("Velocity", "Class"));
		
		
	}
}