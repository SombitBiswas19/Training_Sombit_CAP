package array_basic;

import java.util.Scanner;

public class frequencyOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Sorted integer array size:");
		int[] a = new int[sc.nextInt()];
		System.out.println(a.length);
		System.out.println("-----------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + i + " th element of Array");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the 2nd Sorted integer array size:");
		int[] b = new int[sc.nextInt()];
		System.out.println(b.length);
		System.out.println("-----------------");
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter the " + i + " th element of Array");
			b[i] = sc.nextInt();
		}
		
		/*
		 * int []c=; 
		 * for (int i = 0; i < c.length; i++) 
		 * { System.out.println(c[i]); }
		 */

	}

}
