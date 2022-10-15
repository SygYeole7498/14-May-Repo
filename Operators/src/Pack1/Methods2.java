package Pack1;
public class Methods2 {
	public static void main(String[] args) {
		//To call non-static method we required object of class
		Methods2 obj = new Methods2();// object
		obj.m1(); // call to non-static method m1

		// Not possible because return type M1 method is void is "void"
		// int a= obj.m1();
		// System.out.println(obj.m1());

		// Call to non-static M2 method and use returned value from method
		System.out.println(obj.m2());
		int b = obj.m2();
		System.out.println(b);

		// Call to non-static M3 method with arguments
		obj.m3(40, 50, "Class");
		obj.m3(100, 200, "Class");
	}
	void m1() {
		System.out.println("M1");
	}
	int m2() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c; //return the value of c
	}
	void m3(int a, int b, String s) {
		int c = a + b;
		int h = b;
	}
	int m4(int a, int b) {
		int c = a + b;
		return c; //return the value of c
	}

}
