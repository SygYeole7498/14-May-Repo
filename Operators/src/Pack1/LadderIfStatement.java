package Pack1;

public class LadderIfStatement {

	public static void main(String[] args) {
		int a = 10;

		if (a < 10) {
			System.out.println("a");
		} 
		else if (a >10) {
			System.out.println("if2"); //c1=F; C2=T
		} 
		else if (a <= 10) {
			System.out.println("if3"); //c1=F;C2=F;C3=T
		} 
		else {
			System.out.println("esle"); //C1=C2=C3=F
		}

	}

}
