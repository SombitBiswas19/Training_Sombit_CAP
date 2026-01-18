package array_basic;

import java.util.Scanner;

public class ProductofElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[5];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the "+i+" th element");
			arr[i]=sc.nextInt();
		}
		System.out.println("The product of the array elements is: "+sum(arr));
		
	}

	private static long sum(int[] arr) {
		long prod=1;
		for(int i=0;i<arr.length;i++)
		{
			prod*=arr[i];
		}
		return prod;
		
	}
}
