package operators;

public class Arithmetic_operator {

	public static void main(String[] args) {
		int a=5,b=6;
		int c;// declaration without initialization
		c=a+b; //initialization and addition binary operator
		
		//Addition and Concatenation
		System.out.println(c);
		System.out.println("XYZ"+c);
		System.out.println(c+"XYZ");
		System.out.println("XYZ"+c+"ABC");
		System.out.println(c+"XYZ"+"ABC");
		System.out.println("XYZ"+"ABC"+c);
		
		int d=a-b; // subtraction binary operator
		System.out.println(d);
		int e=a*b; // multiplication binary operator
		System.out.println(e);
		int f=a/b; // division binary operator
		System.out.println(f);
		int g=a%b; // modulus binary operator
		System.out.println(g);
		System.out.println('c'+'a'); //char+char
		System.out.println('A'+1);
		System.out.println((char)('A'+1)); //typecasting
	}

}
