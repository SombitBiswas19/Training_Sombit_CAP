package array_basic;

import java.util.Scanner;

public class Biggest_Smallest {

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
		
		int [] c=biggestsmallest(a);
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		

	}

	private static int[] biggestsmallest(int[] a) {
		int n=a.length;
		int big=a[0],small=a[0];
		for(int i=0;i<n;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		return new int[] {big,small};
	}

}
