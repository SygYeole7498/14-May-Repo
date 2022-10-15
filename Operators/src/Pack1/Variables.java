package Pack1;

public class Variables {

	int a=10; // Non-Static// Global// Instance variable
	static int b= 20;  //static Global variable
	public static void main(String[] args) {
		Variables v= new Variables();
		v.m1();
		v.m2();
	}
	void m1() {
		int a=30; //local variable
		System.out.println(a); //priority goes to local
		
		System.out.println(this.a); //calling to local variable
		System.out.println(b); //
		System.out.println(this.b); //
		//static int d=40; //x	
	}
	
	static  void m2() {
		int b=40;
		System.out.println(b);
		//System.out.println(this.b); //X
	}

	
}
