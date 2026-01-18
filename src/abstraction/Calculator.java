package abstraction;

public abstract class Calculator { //The type Calculator must be an abstract class to define abstract methods
	public abstract int add(int a,int b);
	
	public abstract int multi(int a,int b);
	
	//For abstract class, we can't create the object of this class.
	//So, to access the concrete method we have to use upcasting method.
	public int sub(int a,int b) { //Concrete method
		return a-b;
	}
}
