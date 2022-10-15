package Encapsulation;

public class main {
	public static void main(String[] args) {
		Class1 obj1 = new Class1();
		
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());
		obj1.setA(30);
		obj1.setB("Velocity Class");
		
		System.out.println(obj1.getA());
		System.out.println(obj1.getB());

	}
}
