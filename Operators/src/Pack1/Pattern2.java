package Pack1;

public class Pattern2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print("*"); // space
			}

			for (int j = 5; j > i; j--) {
				System.out.print("*"); // star
			}

			System.out.println();
		}
	}
}
