package Constrcutor;

public class Class1{
	int a = 10;
	float b;

	Class1() {

	}

	Class1(int c) {
		a = c;
		b = 200f;
	}

	Class1(int c, String s) {
		this.a = c;
		b = 500f;
	}

	Class1(int a, float b) {
		this.a = a;
		this.b = b;
	}

}
