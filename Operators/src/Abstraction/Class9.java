package Abstraction;

public class Class9 implements Interface2, Interface1 {

	@Override
	//Mandatory to override common method in both Interface
	public void m4() {
		Interface2.super.m4(); //calling to m4 of I2
		Interface1.super.m4(); //Calling to m4 of I1
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
	}

}
