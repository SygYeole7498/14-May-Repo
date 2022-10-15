
public class StringReverse {

	public static void main(String[] args) {
		
		String str= "Velocity";  //8   LI=7
		int LastIndex= str.length()-1;
		String str1="";
		
		for(int i= LastIndex; i>=0; i--) {
			
			System.out.print(str.charAt(i)); //yticoleV
			
			str1= str1+str.charAt(i);
		}
		
		
	}
}
