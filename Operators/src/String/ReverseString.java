package String;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Velocity"; //
		String str2= ""; //""+y   y+t= yt  yticoleV
		
		for (int i=str.length()-1 ; i>=0; i--) {
			//System.out.print(str.charAt(i));  //76543210	
			str2= str2+str.charAt(i);
		}	
		System.out.println(str2);
	}
}
