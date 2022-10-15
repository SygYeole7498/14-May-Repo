package Polymorphism;

public class main {

	public static void main(String[] args) {
		Class1 obj1= new Class1();
		
		obj1.m1();
		obj1.m1(59, "String");
		obj1.m1("");
		obj1.m2();
		obj1.m2(69, "String");
		obj1.m2("");
	}
	
	//main method overloading
	public static void main() {
		Class1 obj1= new Class1();
		
		obj1.m1();
		obj1.m1(69, "String");
		obj1.m1("");
	}
	
	
}
