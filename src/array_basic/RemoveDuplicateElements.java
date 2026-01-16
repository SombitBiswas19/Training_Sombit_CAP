package array_basic;

import java.util.Scanner;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  integer array size:");
		int[] a = new int[sc.nextInt()];
		System.out.println(a.length);
		System.out.println("-----------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + i + " th element of Array");
			a[i] = sc.nextInt();
		}

		int[] c = remove_duplicate_elements(a);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

	private static int[] remove_duplicate_elements(int[] a) {
		if (a.length == 0) {
			return a;
		}
		int count = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				count++;
			}
		}
		int[] res = new int[count];
		res[0] = a[0];

		int j = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				res[j++] = a[i];
			}
		}

		return res;
	}
}
