package staticvar;

public class Program {
	public static void palindrome(int num) {
		int num1=0,n=num;
		while(num>0)
		{
			int rem=num%10;
			num1=(num1*10)+rem;
			num/=10;
		}
		
		if(n==num1)
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}
	
	public static boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
