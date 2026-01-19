package interface_implementation;

public class C22 extends C11 implements I11{
	/*
	public void m1()
	{
		
	}
	public int m1()
	{
		
	}
	Diamond problem happens
	bcz in one class we cannot write two method with same name,formal args and different return type.
	*/
	
	public void m1()
	{
		System.out.println("bye");
	}
}


interface I11 { 
	void m1();
	public static final int a=18;
	/*I1()  Interfaces cannot have constructors
	{
		
	}*/
	//public static int b; //it should be of type public static final
	//public int c; //it should be of type public static final
	
}

/*
 * interface I2{ int m1(); }
 */

class C11
{ 
	void m1() 
	{ 
		System.out.println("hi"); 
	} 
}
 


