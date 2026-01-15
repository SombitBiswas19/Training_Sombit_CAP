package inheritance.supercall_statement;

public class Child extends Parent {
	long phone;
	
	public Child(String name,long phone)
	{
		//this.name=name;//Implicit super constructor Parent() is undefined. Must explicitly invoke another constructor
		super(name);
		this.phone=phone;
	} 
	
	public static void main(String[] args) {
		Child c=new Child("XYZ",800);
		System.out.println(c.name);
		System.out.println(c.phone);
	}
}
