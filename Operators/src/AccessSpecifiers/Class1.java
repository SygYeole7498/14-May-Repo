package AccessSpecifiers;

public class Class1 {

	private int a = 10;
	int b = 10; // default
	protected int c = 19;
	public int d = 40;

	private void m1() {
		System.out.println("Class1 m1");
	}

	void m2() {
		System.out.println("Class1 m2");
	}

	protected void m3() {
		System.out.println("Class1 m3");
	}

	public void m4() {
		System.out.println("Class1 m4");
	}

}
