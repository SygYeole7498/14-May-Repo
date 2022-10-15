
public class Class500 {
	public static void main(String[] args) {
		String S1 = "velocitccvel  vel"; // 1 //SCPA
		String S2 = "velocity"; // 0
		String S3 = new String("Velocity"); // 1 //HEAP
		String S4 = new String("Class"); // 2 //SCPA and HEAP
		String S5 = new String("Velocity"); // 1 //HEAP
		String S6 = new String("Class"); // 1 //HEAP
		String S7 = "Class"; // 0
		System.out.println(S1.equals(S2)); // false
		System.out.println(S1.equalsIgnoreCase(S2));// true
		System.out.println(S1.length());
		System.out.println(S1.concat(S7)); // +
		System.out.println(S1.contains("Vel"));
		System.out.println(S1.endsWith("ity"));
		System.out.println(S1.startsWith("el"));
		System.out.println(S1.charAt(4));
		System.out.println(S1.indexOf('V')); // -1
		System.out.println(S1.indexOf('V', 1)); // -1
		System.out.println(S1.isBlank()); // X
		System.out.println(S1.isEmpty()); // use
		System.out.println(S1.replace('c', 'z'));
		System.out.println(S1.replace("vel", "xyz"));
		System.out.println(S1.toLowerCase());
		System.out.println(S1.toUpperCase());

	}

}
