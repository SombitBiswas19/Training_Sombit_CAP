package methods;

public class Calculator {
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		add(2147483647,15);
		sub(15,60);
		mul(123,999);
		div(20,3);
		modu(20,3);
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void div(float a, float b)
	{
		System.out.println(a/b);
	}
	public static void modu(int a, int b)
	{
		System.out.println(a%b);
	}

}
