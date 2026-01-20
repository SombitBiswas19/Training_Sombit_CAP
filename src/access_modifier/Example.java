package access_modifier;
//Illegal modifier for the class Example; only public, abstract & final are permitted
public class Example { 
	private static String a="private variable";
	
	private Example() 
	{
		System.out.println("Private constrcutor");
	}
	
	private static void m1()
	{
		System.out.println("Private m1 method");
	}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Example e=new Example();
		
	}
}
