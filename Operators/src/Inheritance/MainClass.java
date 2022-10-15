package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		Class2 obj1= new Class2();
		obj1.m1();
		//obj1.m2();
		
		Class1 obj2 = new Class1();
		obj2.m2(); //Class1 //Child Class
		obj2.m1(); //Class2 //Parent Class
	}
}
