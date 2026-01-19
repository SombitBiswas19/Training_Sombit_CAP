package interface_implementation;

public interface Calculator {
	void add(int a,int b); //public abstract is added automatically by interface
	void multi(int a,int b);
	void sub(int a,int b);
	/*public void m1() { //Abstract methods do not specify a body
		
	}*/
	public abstract void m1();
	abstract void m2();
	//Illegal modifier for the interface method m3; 
	//only public, private, abstract, default, static and strictfp are permitted
	//protected abstract void m3();  //CTE
	
	//Illegal combination of modifiers for the private interface method m3;
	//additionally only one of static and strictfp is permitted
	//private abstract void m3();
	
	private static void m3() {
		
	}
	
	
}