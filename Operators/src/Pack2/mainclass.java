package Pack2;

public class mainclass {

	public static void main(String[] args) {

		Class1 obj1= new Class1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.m1(); 
		obj1.m2();
		
		Class3 obj2= new Class3();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		obj2.m1();
		obj2.m2();
		
		Class1 obj3= new Class3();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		obj3.m1();
		obj3.m2();


	}

}
