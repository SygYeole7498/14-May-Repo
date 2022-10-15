
public class StringClass2 {
	public static void main(String[] args) {
		String str = "Veloecityecityertuycity"; // 1 SCPA
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('e')); // -1 if not present
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.indexOf('e', 5));
		System.out.println(str.length());
		System.out.println(str.contains("city"));
		System.out.println(str.equals("velocity"));
		System.out.println(str.equalsIgnoreCase("veloCITY"));
		System.out.println(str.toUpperCase()); //
		System.out.println(str.toLowerCase());
		str = str.toLowerCase(); // veloecitye
		System.out.println(str.concat("syg")); // + and concat();
		System.out.println(str.startsWith("v"));
		System.out.println(str.endsWith("e"));
		
		
		System.out.println(str.replace('e', 'z'));
		System.out.println(str.replace("city", "class"));
		System.out.println(str.replaceAll("city", "class"));
		System.out.println(str.replaceFirst("e", "z"));
		String str1 = " ";
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
		System.out.println("********************");
		String str2 = "This is Velocity Class";
		String str3[] = str2.split(" ");
		System.out.println(str3[0]);
		System.out.println(str3[1]);
		System.out.println(str3[2]);
		System.out.println(str3[3]);
		char ch= '9';
		int a= ch;
		System.out.println(a);
		String str4 = "ABCDZF";
		String str5 = "ABCDa";
		System.out.println(str4.compareTo(str5))
	}
}
