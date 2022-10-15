package AccessSpe2;

import AccessSpecifiers.Class1;

public class Class2 extends AccessSpecifiers.Class1 {

	public static void main(String[] args) {
		AccessSpecifiers.Class1 obj1 = new AccessSpecifiers.Class1();
		
		obj1.m4(); // public
	//	obj1.m3();

		Class2 obj2 = new Class2();

		obj2.m3(); // protected
		obj2.m4(); // public

	}
}
