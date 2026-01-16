package array_basic;

import java.util.Scanner;

public class DuplicateElements {

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

		int count = duplicate_elements(a);
		System.out.println(count);

	}

	private static int duplicate_elements(int[] a) {
		int n = a.length, count = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			}
		}
		return count;
	}

}
