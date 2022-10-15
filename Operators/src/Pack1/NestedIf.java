package Pack1;

public class NestedIf {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a < b) {

			if (a < b) { // nested if

				System.out.println("nested if"); // c1=c2=true; }

			}
		}

		if (a < b) {

			if (a < b) { // nested if
				System.out.println("if1"); // c1=c2=true;
			} else {
				System.out.println("esle2"); // C1=T ; C2=F
			}

		} else {
			System.out.println("outer"); // C1=F
		}

	}
}
