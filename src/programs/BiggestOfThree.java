package programs;

public class BiggestOfThree {
	public static void main(String[] args) {
		int a=10,b=40,c=30;
		if(a>b && a>c)
			System.out.println(a);
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		
		//2nd Method
		
		int big=(a>b)?a:b;
		if(big>c)
			System.out.println(big);
		else
			System.out.println(c);
	}

}
