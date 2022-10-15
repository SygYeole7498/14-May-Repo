package Casting;

public class Class1 {

	public static void main(String[] args) {

		// implicit :- L to H
		int a = 10;
		double d = a;
		int b = (int) 56.89; // Explicit H to L
		System.out.println(b);
		// int b= true;
		float f = a;
		long l = a;
		char ch = 'z';
		int n =(int) l;
		l= (long) d;
		float f1= l;
		char m= (char) n;
		System.out.println(m);
	}
}
