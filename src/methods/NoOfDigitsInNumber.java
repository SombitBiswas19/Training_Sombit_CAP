package methods;

public class NoOfDigitsInNumber {
	public static void main(String[] args) {
		Armstrong(153);
		Armstrong(1633);
		Armstrong(1634);
	}

	public static int no_of_digits(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}
	
	public static long pow(int base, int power) {
		long val=1l;
		for(int i=1;i<=power;i++)
		{
			val*=base;
		}
		return val;
	}
	
	public static void Armstrong(int num)
	{
		int count= no_of_digits(num);
		int sum=0,n=num;
		while(num>0)
		{
			int rem=num%10;
			sum+=pow(rem,count);
			num/=10;
		}
		if(sum==n)
			System.out.println("It is armstrong number.");
		else
			System.out.println("It is not armstrong number.");
	}
	
}
