package inheritance;

public class Child extends Parent {
	int b=20;
	
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a); //No error because a is a member of Parent class
		System.out.println(c.b);
		c.m1(); //No error because a is a member of Parent class
		
		Parent p=new Parent();
		System.out.println(p.a); // Through child we can access parent
		p.m1();
		//System.out.println(p.b); // Through parent we can not access child
	}
}
