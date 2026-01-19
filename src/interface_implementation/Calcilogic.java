package interface_implementation;

public class Calcilogic implements Calculator {
	@Override
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	@Override
	public void multi(int a,int b)
	{
		System.out.println(a*b);
	}
	@Override
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
}
