
import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		
		int m=60;
		int n=90;
		
		int k= m;
		m=n;
		n=k;

		int a[] = { 1, 3, 5, 0, 7, 8, 3, 2, 0 };
		
		Arrays.sort(a);   //Assending Sort
		
		int c[] = new int[10];

		// Method is use to Sort the Array in ascending order
		// Arrays.sort(a); // Ascending 0,1,3,5
		/*
		 * int m = 0; // Reverse Array for (int i = lastIndex; i >= 0; i--) { c[m] =
		 * a[i]; // 1.c[0]=a[3] 2.c[1]= a[2] 3.c[2]=a[1] 4.c[3]= a[0] m++; }
		 */
		// Print all values of Array
		int lastIndex = a.length - 1;
		Arrays.sort(a); // 0,1,3,5

		for (int i = 0; i <= lastIndex; i++) {
			System.out.println(a[i]);
		}
		
		

	}

}
