package array_basic;

import java.util.Scanner;

public class MergeTwoSortedArray {

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
		
		int []c=mergetwosortedarray(a,b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

	private static int[] mergetwosortedarray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

	    int i = 0, j = 0, k = 0;

	    while (j < a.length && k < b.length) {
	    	if(a[j]<b[k])
	    	{
	    		c[i++] = a[j++];
	    	}
	    	else
	    		c[i++] = b[k++];
	        
	    }
	    while (j < a.length) {
	        c[i++] = a[j++];
	    }
	    while (k < b.length) {
	        c[i++] = b[k++];
	    }

	    return c;
	}

}
