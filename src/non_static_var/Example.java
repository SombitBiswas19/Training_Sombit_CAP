package non_static_var;

public class Example {
	{
		System.out.println("N-S 1");  // Non static block initialization
	}
	{
		System.out.println("N-S 2");
	}

	public static void main(String[] args) {
		System.out.println("main start");
		Example e1=new Example(); // for non static block access we have to create the object first then it will run
		System.out.println("main end");

	}

}
