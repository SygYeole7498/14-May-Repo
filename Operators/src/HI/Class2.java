package HI;

public class Class2 extends Class1 {

	int b = 20;
	int c = 50;

	Class2() {
		super(60);
	}

	void m1() {
		super.a = 10;
		this.b = 40;
		super.c = 49;
		this.c = 38;

		System.out.println("Class2 M1");
	}

}
