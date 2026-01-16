package array_basic;

import java.util.Scanner;

public class ArrayElementOperations {
	public static int[] addElementInIndex(int[] arr, int ele, int index) {
		if (index < 0 || index > arr.length) {
			System.out.println("Invalid index");
			return arr;
		}
		int[] newArr = new int[arr.length + 1];
		int j = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (i == index) {
				newArr[i] = ele;
			} else {
				newArr[i] = arr[j++];
			}
		}
		return newArr;
	}

	public static int[] replaceElementInIndex(int[] arr, int ele, int index) {
		arr[index] = ele;
		return arr;
	}

	public static int[] removeElementFromIndex(int[] arr,int index) {
		if (index < 0 || index >= arr.length) {
			System.out.println("Invalid index");
			return arr;
		}
		int[] newArr = new int[arr.length - 1];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (i != index) {
				newArr[j++] = arr[i];
			}
		}
		return newArr;
	}

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
		System.out.println("Add Element");
		int[] c = addElementInIndex(a, 22, 1);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("Replace Element");
		a = replaceElementInIndex(a, 1, 0);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Remove Element");
		int[] b = removeElementFromIndex(a,1);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
