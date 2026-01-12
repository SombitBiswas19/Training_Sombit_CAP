package methods;

import java.util.Scanner;

public class Decimal2Octal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Decimal to Octal
		System.out.print("Enter a decimal number: ");
		long num=sc.nextLong();
		System.out.println("The octal result is: "+ dec2oct(num)); 
		//Octal to Decimal 
		System.out.print("Enter a octal number: ");
		long num1=sc.nextLong();
		while(!checkoctal(num1))
		{
			System.out.println("Enter valid octal number!! Every digit should be >0 and <7.");
			System.out.print("Enter a octal number: ");
			num1=sc.nextLong();
		}
		System.out.println("The decimal result is: "+ oct2dec(num1));
	}
	
	private static boolean checkoctal(long num)
	{
		while(num>0)
		{
			long rem=num%10;
			if(rem>7 || rem<0)
			{
				return false;
			}
			num/=10;
		}
		return true;
	}
	
	private static long oct2dec(long num1) {
		int i=0;
		long sum=0;
		while(num1>0)
		{
			long rem=num1%10;
			sum+=rem*pow(8,i);
			i++;
			num1/=10;
		}
		return sum;
	}

	public static long pow(long base, int n) {
		long ans=1;
		for(int i=0;i<n;i++)
		{
			ans*=base;
		}
		return ans;
	}

	private static long dec2oct(long num) {
		long octal = 0;
	    long place = 1; 

	    while (num > 0) {
	        long rem = num % 8;
	        octal = octal + rem * place;
	        place *= 10; //the position where the next binary digit goes
	        num = num / 8;
	    }
	    return octal;
	}

}
