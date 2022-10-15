
public interface Interface2 {
	static void m1() {
		System.out.println("static Interface");
	}

	default void m2() {
		System.out.println("default Interface");
	}

	private void m3() {
		System.out.println("private Interface");
	}
}
