package interface_implementation;

public class ChildTest implements Test {
	@Override
	public void m2()
	{
		System.out.println("Child Method overrides default method of parent");
	}
	public static void main(String[] args) {
		ChildTest t=new ChildTest();
		//t.m1();// we cannot access private method
		t.m2();  //default method
		Test.m3(); //static method
		System.out.println(Test.a); //variable access
	}
}
