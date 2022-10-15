package MethodOverring;

public class Main {
public static void main(String[] args) {
	
	Class1 obj1 = new Class1();
	obj1.M1();
	obj1.M2(10);
	Class2 obj2 = new Class2();
	obj2.M1();
	obj2.M2(20);
	
	Class1 obj3 = new Class2();  //Run Time Polymorphism// Dynamic Method DispatchD
	obj3.M1();
	obj3.M2(45); 
	
}
}
