package staticvar;
import methods.DisariumNumber;

public class StaticVariable {
	static int a=10;
	static int b;
	static String pm="Ami";
	static String s;
	public static void main(String[] args) {
		e1();
		e2();
		e3();
	}

	private static void e2() {
		int a=20; //local var
		System.out.println(a); //priority high of local var
		//Access using Classname
		System.out.println(StaticVariable.a);  //accessing static var of class StaticVariable means global var
		
	}

	private static void e1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(pm);
		System.out.println(s);
		
	}
	
	public static void e3()
	{
		System.out.println(Student.name);
		DisariumNumber.checkdisariumnumber(121); // If we call from different package the method should be public
		
	}

}
