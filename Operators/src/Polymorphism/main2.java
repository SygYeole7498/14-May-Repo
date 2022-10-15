package Polymorphism;

public class main2 {

	public static void main(String[] args){
		Class3 obj1 = new Class3();
		obj1.m1(); //Class3
		obj1.m2(); //Class3
		
		Class2 obj2 = new Class3();  //RTP  //Dynamic Method Dispatch
		
		obj2.m1();  //Class2  //Class3
		obj2.m2();  //Class2  //Class2
		
			}

}
