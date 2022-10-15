package Pack1;

public class NestedIF2 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		if (a < b) {
			System.out.println("if1"); // C1=T
			if (a > b) {
				System.out.println("if2"); // C1=C2=T
					if (a < b) {
						System.out.println(); // C1C2C3=T
					} else {
						System.out.println("inner 3");
					}

			} else {
				System.out.println("inner else1");
			}

		} else if (a < b) {
			System.out.println("else last");
		}

	}
}
