
public class Array1 {

	public static void main(String[] args) {
		
		int m,n;
		
		int [] i,j; //both as Array
		int k[], l; //k=Array and l= variable
		
		int a[]= new int[5];
		
		String []b= new String[5];
		
		a[0]=59;
		a[1]=60;
		a[4]=60;
		
		System.out.println(a[0]);
		
	//	b[6]="Velocity";
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		String []c = {"class", "velocity", "India"}; //3
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
	}
	
	
}
