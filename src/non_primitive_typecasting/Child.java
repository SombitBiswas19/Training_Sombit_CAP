package non_primitive_typecasting;

public class Child extends Parent {
	public void m2()
	{
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		Parent p=c; //UpCasting -> Done implicitly by compiler
		p.m1();
		//p.m2(); //The method m2() is undefined for the type Parent 
		//We can't access the child member using Parent reference variable
		
		Child c2=(Child)p; //DownCasted to same child object-> we need typecast operator explicitly
		c2.m1();
		c2.m2();
	}
}
