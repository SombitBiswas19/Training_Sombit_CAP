package staticvar;
import helper_method.Laptop;

public class Example2 {
	int a1;
	static int a2;
	static Laptop s1; //static
	Laptop s2; //non static
	
	public Example2(){
		System.out.println(a1); 
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(s1); 
		System.out.println(s2);
		System.out.println(this.s2); 
	}
	
	public void m1()
	{
		System.out.println(a1); // non-static method can use non-static var directly by name
		System.out.println(a2); // non-static method can use static var directly by name
		System.out.println(this.a1); // non-static method can use this for accessing non-static var 
		System.out.println(s1); // non-static method can use non-static var of non-primitive datatype directly by name
		System.out.println(s2); // non-static method can use non-static var of non-primitive datatype directly by name
	}
	
	public static void m2()
	{
		Example2 e=new Example2();
		System.out.println(e.a1); // static method cann't use non-static var directly by name-> create object of the class
		System.out.println(a2); // static method can use static var directly by name
		//System.out.println(this.a1); // static method cann't use this for accessing non-static var 
		System.out.println(s1); // static method can use static var of non-primitive datatype directly by name
		System.out.println(e.s2); // static method cann't use non-static var of non-primitive datatype directly by name-> create object of the class
	}
	public static void main(String[] args) {
		System.out.println(s1);
		Example2 e=new Example2();
		e.s2=new Laptop();
		System.out.println(e.s2);
		e.m1();
		m2();
	}
} 
