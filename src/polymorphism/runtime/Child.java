package polymorphism.runtime;

public class Child extends Parent {
	@Override
	public void home()  // new implementation of home is given by child
	{
		System.out.println("Red");
	}
	public void bike()
	{
		System.out.println("Royal Enfield");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.home();  //Blue 
		
		Child c=new Child();
		c.home();  //Red
		c.bike();  //Royal Enfield
		
		p=c; //Upcasting Parent p=new Child();
		p.home();  //Red
		
		c=(Child) p; //Downcasting Child c=(Child)p;
		c.home(); //Red
		c.bike(); //Royal Enfield
		
	}
}
