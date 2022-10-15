package Pack1;

public class IncreementDecrement {
	public static void main(String[] args) {

		int a = 10;

		System.out.println(a++);  // 1st Use 10 then increment to 11
		System.out.println(a);	  // 11 
		a++; 					  // a=a+1 //12  increment to 12
		System.out.println(a); 	  // 12
		System.out.println(++a);  // 1st increment to 13 then use..
		++a; 					  //increment to 14
		System.out.println(a); 	  // 14
		System.out.println(--a);  // 1st decrement to 13 use..
		System.out.println(a--);  // 1st use 13 then decrement to 12
		System.out.println(a);    // 12

	}
}
