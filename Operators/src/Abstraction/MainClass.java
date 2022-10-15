package Abstraction;

public class MainClass {

	public static void main(String[] args) {
		Class5 c5= new Class5();
		c5.m1(); //Class5
		c5.m2(); //Class5
		
	//Modified should be call(i.e.Interface2)... 
	//In Suggestion displayed of Inteface2 
	//Bcoz in Class5 Interface2 is first Implemented
		c5.m4();//Executed of Interface2
	}
}
