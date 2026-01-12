package methods;

public class BiggestOfThree {
	public static void main(String[] args)
	{
		biggestofthree(1,2,3);
	}
	public static void biggestofthree(int a,int b,int c)
	{
		if(a>b && a>c)
			System.out.println("Biggest Number is "+a);
		else if(b>c)
			System.out.println("Biggest Number is "+b);
		else
			System.out.println("Biggest Number is "+c);
	}
}
