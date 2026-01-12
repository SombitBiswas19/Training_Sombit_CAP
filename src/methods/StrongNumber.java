package methods;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		/* A Strong Number (or Factorion) is a number that equals 
		the sum of the factorials of its individual digits. */
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a number for checking strong number: ");
		int num=sc.nextInt();
		checkstrongnumber(num);
	}

	private static void checkstrongnumber(int num) {
		int n=num,sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum+=fact(rem);
			n/=10;
		}
		if(num==sum)
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" isn't a strong number");
		
	}

	private static int fact(int n) {
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}

}
