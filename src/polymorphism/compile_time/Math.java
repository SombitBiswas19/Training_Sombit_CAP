package polymorphism.compile_time;

public class Math {
	public void add(int a,int b)
	{
		System.out.println("Two int type data");
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Three int type data");
		System.out.println(a+b+c);
	}
	public void add(float a,float b)
	{
		System.out.println("Two float type data");
		System.out.println(a+b);
	}
	public void add(double a,double b)
	{
		System.out.println("Two double type data");
		System.out.println(a+b);
	}
	public int add(int a,int b,int c,int d)
	{
		System.out.println("Four int type data");
		return a+b+c+d;
	}
	public double add(float a,double b)
	{
		System.out.println("One float and one double type data");
		return a+b;
	}
	
	public static void main(String[] args) {
		Math m=new Math();
		m.add(2, 3);
		m.add(1, 2, 3);
		m.add(2.3f, 9.5f);
		m.add(2.3, 9.5);
		System.out.println(m.add(1, 2, 3, 4));
		System.out.println(m.add(1.5f, 10.9));
	}
}
