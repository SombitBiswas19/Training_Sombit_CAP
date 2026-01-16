package array_basic;

import java.util.Scanner;

public class DigitSum {
	
	public static int digitsum(int n)
	{
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer array size:");
		int[] a = new int[sc.nextInt()];
		System.out.println(a.length);
		System.out.println("-----------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + i + " th element of Array");
			a[i] = sc.nextInt();
		}
		System.out.println("Digitsum");
		for(int i=0;i<a.length;i++)
		{
			int sum=digitsum(a[i]);
			System.out.println(sum);
		}

	}

}
