package HI;

final class maincalss {

	public class c1 {

	}

	public static void main(String[] args) {

		Class2 obj1 = new Class2();
		obj1.m1();
		obj1.m2();

		Class3 obj12 = new Class3();
		obj12.m1(); // 1

		Class1 obj3 = new Class1(10);
		obj3.m1();// class1
	}
}
