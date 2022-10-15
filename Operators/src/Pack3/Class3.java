package Pack3;

import Pack2.Class1;

public class Class3 extends Class1{
	public static void main(String[] args) {
		
		Class1 obj= new Class1();
		//obj.m2();
		obj.m4();
		
		Class3 obj1= new Class3();
		obj1.m2(); //protected
		obj1.m4();
	}
}
