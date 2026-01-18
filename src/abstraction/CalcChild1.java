package abstraction;

public class CalcChild1 extends Calculator{
	//The type CalcChild1 must implement the inherited abstract method Calculator.add(int, int)
	@Override
	public int add(int a,int b)
	{
		return a+b;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void m1() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		//Can't create object of the abstract class
        //Calculator c=new Calculator(); /Cannot instantiate the type Calculator
		Calculator c=new CalcChild1(); //Object is of child type. Object method will get called.
		System.out.println(c.add(5,5));
		System.out.println(c.multi(5,5));
		System.out.println(c.sub(2, 4));
		
		//We can't access the child method after upcasting
		//c.m1(); //We can only use the methods which are inherited of the parent only.
		
		CalcChild1 c1=new CalcChild1();
		System.out.println(c1.add(2, 3));
		c1.m1();
		System.out.println(c1.multi(2, 3));
		System.out.println(c1.sub(5,3));
	}

}
