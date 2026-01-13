package staticvar;

public class Example {
	static int a=20; //static variable
	int b=30; //non-static variable
	static{
		//One time execution
		System.out.println("SB1");  //Start creating database connection before executing the  application.
		int a=10; // local variable to static block 
		System.out.println(a);
		System.out.println(Example.a);
		int b=40;; // local variable to static block 
		System.out.println(b);
		//System.out.println(Example.b); Error --> Cannot make a static reference to the non-static field Example.b
		m1(); //We can do function call but can't declare a function definition
	}
	public static void m1() {
		System.out.println("m1 method");

}

	public static void main(String[] args) {
			System.out.println("main");

	}
	static{
		System.out.println("SB2");
	}
	static{
		System.out.println("SB3");
	}

}
