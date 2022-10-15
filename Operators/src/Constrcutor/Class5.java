package Constrcutor;

public class Class5 {

	static int a=20;
	int b=10;
	
	Class5(){
		a++;
		b++;
	}
	
	public static void main(String[] args) {
		Class5 obj = new Class5();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		Class5 obj2 = new Class5();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		Class5 obj3 = new Class5();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		Class5 obj4 = new Class5();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	}

}
