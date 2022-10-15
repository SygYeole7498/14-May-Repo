package Casting;

public class mainClass {
public static void main(String[] args) {
	
	//RTP//DMD// Up-casting
	Class2 obj1= new Class3();
	obj1.m2();
	obj1.m1();
	
	//Down Casting :- Does not support
	Class3 obj2= (Class3) new Class2();
	obj2.m1();
	obj2.m2();
	obj2.m3();
	
	
}
}
