package wrapper_class;

public class Driver {

	public static void main(String[] args) {
		int n=10;
		Integer i=n; //auto boxing
		int n2=i; //auto unboxing
		
		Integer i2=80; //auto boxing
		
		Character c1='A';
		System.out.println(c1);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer i1=Integer.valueOf("123"); //String to Integer WrapperClass
		System.out.println(i1+1);
		
		Boolean b=Boolean.valueOf("tru");  //default value false
		System.out.println(b);
		Boolean b1=Boolean.valueOf("True");  //default value false
		System.out.println(b1);
		Boolean b2=Boolean.valueOf("TRUE");  //default value false
		System.out.println(b2);
		Boolean b3=Boolean.valueOf("true");  //default value false
		System.out.println(b3);
		
		int a=Integer.parseInt("123"); //String->int
		long l=Long.parseLong("123"); //String->long 
		//java.lang.NumberFormatException: For input string: "123a"
		//int b11=Integer.parseInt("123a"); //String->int
		//System.out.println(b11);
		
		String s=Integer.toString(a);
		System.out.println(s);
	}
}
