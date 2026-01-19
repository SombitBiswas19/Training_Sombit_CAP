package interface_implementation;

public class C2 extends C1 implements I1,I2 {
	public static void main(String[] args) {
		I1 i1=new C2(); //Upcasting
		C1 c1=new C2(); //Upcasting
		I2 i2=new C2(); //Upcasting
	}
}
class C1{
	
}

interface I1 extends I2,I3{ //Multiple inheritance
	
}
interface I2{
	
}
interface I3{
	
}
