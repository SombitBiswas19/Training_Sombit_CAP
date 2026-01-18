package array_basic;

import java.util.Scanner;

public class Copyarray {
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
		int [] copyarray=arr;
		for(int i=0;i<n;i++)
		{
			System.out.print(copyarray[i]+" ");
		}
	}
}
