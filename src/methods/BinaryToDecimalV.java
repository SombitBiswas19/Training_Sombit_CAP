package methods;

import java.util.Scanner;

public class BinaryToDecimalV {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Binary to Decimal
		System.out.print("Enter a binary number: ");
		long num=sc.nextLong();
		while(!checkbinary(num))
		{
			System.out.println("Enter valid binary number!! Every digit should be 0 or 1.");
			System.out.print("Enter a binary number: ");
			num=sc.nextLong();
		}
		System.out.println("The decimal result is: "+ bin2dec(num)); 
		//Decimal to Binary
		System.out.print("Enter a decimal number: ");
		long num1=sc.nextLong();
		System.out.println("The binary result is: "+ dec2bin(num1));
	}

	private static boolean checkbinary(long num) {
		while(num>0)
		{
			long rem=num%10;
			if(rem<0 || rem>1)
			{
				return false;
			}
			num/=10;
		}
		return true;
	}

	private static long dec2bin(long num1) {
		long binary = 0;
	    long place = 1; 

	    while (num1 > 0) {
	        long rem = num1 % 2;
	        binary = binary + rem * place;
	        place *= 10; //the position where the next binary digit goes
	        num1 = num1 / 2;
	    }
	    return binary;
	}


	private static long bin2dec(long num) {
		int i=0;
		long sum=0;
		while(num>0)
		{
			long rem=num%10;
			sum+=rem*pow(2,i);
			i++;
			num/=10;
		}
		return sum;
	}
	
	private static long pow(long base, int n) {
		long ans=1;
		for(int i=0;i<n;i++)
		{
			ans*=base;
		}
		return ans;
	}

}
