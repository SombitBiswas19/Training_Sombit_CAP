package methods;

public class PowerOfNumber {
	public static void main(String[] args)
	{
		System.out.println(pow(2,3)); 
	}

	private static long pow(int base, int power) {
		long val=1l;
		for(int i=1;i<=power;i++)
		{
			val*=base;
		}
		return val;
	}
}
