package array_basic;

import java.util.Scanner;

public class SumofElements {
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
		System.out.println("The sum of the array elements is: "+sum(arr));
		
	}

	private static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
		
	}
}
