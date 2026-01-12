package methods;

import java.util.Scanner;

public class Digit_1_in_decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Decimal to Binary
		System.out.print("Enter a decimal number: ");
		long num1=sc.nextLong();
		long binary=dec2bin(num1);
		System.out.println("The binary result is:  "+binary);
		System.out.println("The numnber of 1's is in "+ num1+" is "+digitcount(binary));
	}
	private static int digitcount(long binary) {
		int count=0;
		while (binary > 0) {
	        int rem =(int)( binary % 10);
	        if(rem==1)
	        {
	        	count++;
	        }
	        binary/=10;
	    }
		return count;
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

}
