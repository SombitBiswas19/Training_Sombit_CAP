package methods;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		/* A Disarium number is a number that is equal to the sum of the
		   powers of its digits with respect to their positions. */
		Scanner sc=new Scanner(System.in);
		System.out.println("Give a number for checking disarium	number: ");
		int num=sc.nextInt();
		checkdisariumnumber(num);
	}

	private static void checkdisariumnumber(int num) {
		int count=countdigit(num),n=num;
		long sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+pow(rem,count);
			count--;
			num/=10;
		}
		if(sum==n)
			System.out.println(n+" is disarium number.");
		else
			System.out.println(n+" isn't disarium number.");
	}

	private static long pow(int rem, int n) {
		long ans=1;
		for(int i=1;i<=n;i++)
		{
			ans*=rem;
		}
		return ans;
	}

	private static int countdigit(int num) {
		int count=0;
		while(num>0)
		{
			count+=1;
			num/=10;
		}
		return count;
	}

}
