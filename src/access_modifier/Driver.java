package access_modifier;

public class Driver {
	
	protected class hoho{
		
	}
	
	public static void main(String[] args) {
		//Example e=new Example(); //The constructor Example() is not visible-> Private constructor
		//Advantage of private constructor: we can't create object inside other class
		//Used for singleton class
		//System.out.println(Example.a); //The field Example.a is not visible-> private static variable
	}
}
