package array_basic;

import java.util.Scanner;

public class Parameterized_passing {
	public static void sum_int_array(int[] a) {
		int sum = 0;

		System.out.println("Sum:");
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

		}
		System.out.println(sum);
	}

	public static int[] even_elements(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}

		}
		int[] b = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}

		}
		return b;
	}
	public static void reverse(int[] a) {
		int i=0,j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;j--;
		}
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
		sum_int_array(a);
		System.out.println("-----------------");
		int[] b = even_elements(a);
		System.out.println("Even elements are:");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("-------Reverse Array----------");
		reverse(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
