package access_modifier.p2;
import access_modifier.e1.C1;

public class C2 extends C1{
	public static void main(String[] args) {
		//It is accessing the protected variable of C1 class
		//System.out.println(C1.s); //The field C1.s is not visible-> when we didn't make this as child of C1.
		System.out.println(C1.s); //After inheriting the C1 class.
		
		//C1 c=new C1(); //The constructor C1() is not visible->Direct object creation is not possible.
		//using super call statement we can create the object of C1
		
		C2 c=new C2();
		System.out.println(c.s);
	}
}
