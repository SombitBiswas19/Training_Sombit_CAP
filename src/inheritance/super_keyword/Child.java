package inheritance.super_keyword;

public class Child extends Parent {
	int a=20;
	
	public void m1()
	{
		System.out.println("Child");
	}
	
	public void m2()
	{
		System.out.println(a); // accessing current object variable using this keyword
		System.out.println(super.a); // accessing parent member using super keyword
		super.m1(); // accessing parent member using super keyword
		this.m1(); // accessing current object method using this keyword
		System.out.println(this); // returning the address of current object
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c);
		c.m2();
	}
}
