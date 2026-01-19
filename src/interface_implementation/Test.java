package interface_implementation;

public interface Test {
	//for final variable we have to initialize value
	public static final int a=10;
	int b=20; //here it will take default value of variable as public static final
	static int c=90; //Implicitly it will add public static final
	public static int d=40;
	
	private void m1() //helper method for default method
	{
		System.out.println("private method");
	}
	default void m2()
	{
		System.out.println("default method");
		m1(); // when we need to do operation in default but don't want to show the internal information.
	}
	public static void m3()
	{
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		int c=30;
		System.out.println("hii");
	}
}
