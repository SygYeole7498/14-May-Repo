package Pack2;

public class Class2 extends Class1 {
	
	//If in Parent class (private) :-then in child class (private, default, protected, public)
	//default :- default, protected, public
	//protected:- protected, public
	//public:- public
	private void m1() {
	}

	protected void m2() {
	}

	void m3() {
	}

	public void m4() {
	}
	
	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
