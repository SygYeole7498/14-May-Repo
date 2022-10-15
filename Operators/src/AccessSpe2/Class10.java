package AccessSpe2;

public class Class10 {

	public static void main(String[] args) {

		int[] l, g, h; // array
		int m, n[]; // m=array and n=variable
		// D+I
		int a[] = { 1, 4, 5, 10 }; // 4
		int[] b = { 1, 4, 5, 10 }; // 4

		String str="b";
		String str2= "A";
		System.out.println(str.compareTo(str2));
		// D
		int c[] = new int[2];
		int[] d = new int[1];
		// I
		c[0] = 10;
		c[1] = 30;

		System.out.println(c[0]);
		System.out.println(c[1]);
		// c[2]=40;
		d[0] = 100;
		System.out.println(d[0]);
		// d[1]=200;
		System.out.println(d[1]);
	}
}
