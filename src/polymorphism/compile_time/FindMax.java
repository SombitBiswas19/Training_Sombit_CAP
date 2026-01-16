package polymorphism.compile_time;

public class FindMax {
	public int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public float max(float a,float b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public float max(int a,float b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public int max(int a,int b,int c)
	{
		if(a>b && b>c)
			return a;
		else if(b>c && b>a)
			return b;
		else 
			return c;
	}
	
	public static void main(String[] args) {
		FindMax f=new FindMax();
		System.out.println(f.max(1, 2));
		System.out.println(f.max(1.2f, 2.2f));
		System.out.println(f.max(1, 0.5f));
		System.out.println(f.max(2, 3, 1));
	}
}
