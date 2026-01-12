package methods;
import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2=sc.nextInt();
		sc.close();
		primeinrange(n1,n2);
	}

	private static void primeinrange(int n1, int n2) {
		for(int i=n1;i<=n2;i++)
		{
			if(checkPrime(i))
				System.out.println(i);
		}
	}

	private static boolean checkPrime(int n) {
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
