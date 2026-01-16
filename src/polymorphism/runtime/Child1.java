package polymorphism.runtime;

public class Child1 extends Parent1 {
//	@Override
//	public static void home()  // new implementation of home is given by child
//	{
//		System.out.println("Child static method");
//	}
	public static void bike()
	{
		System.out.println("Royal Enfield");
	}
	
	public static void main(String[] args) {
		Parent1 p=new Child1();
		p.home();
	}
}
