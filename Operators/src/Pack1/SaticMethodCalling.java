package Pack1;

public class SaticMethodCalling {
	int a = 19;
	static int b = 20;
	public static void main(String[] args) {
		// How to call to static method :- by using class name directly...
		SaticMethodCalling.m1(); // call by class name
		SaticMethodCalling.m2(); // call by class name
		SaticMethodCalling.m3(243); // call by class name static with argument

		int b = SaticMethodCalling.m3(536);
		System.out.println(b);
		System.out.println(SaticMethodCalling.m2());

		// Q. Can we call static method by using object :- Yes.
		SaticMethodCalling obj = new SaticMethodCalling(); // copy
		obj.m1();
		obj.m2();
		obj.m3(0);
	}
	static void m1() {
		a++; // we cannot use Non-static variables in static method
		b++; // we can use only static variables in static method
	}
	int m6() {
		a++;
		b++;
		return a;
	}
	static int m2() {
		int d = 10; // each variable declared in static method is by default static
		return 45;
	}
	static int m3(int c) {
		c++;
		return c;
	}

}
