package MultiLevel;

public class MainClass {
public static void main(String[] args) {
	Class1 obj= new Class1();
	obj.m1(); //only m1 class1
	
	Class2 obj2= new Class2();
	obj2.m1();
	obj2.M2();
	
	Class3 obj3 = new Class3();
	obj3.m1();
	obj3.M2();
	obj3.m3();
	

}
}
