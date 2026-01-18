package array_basic;

import java.util.Scanner;

public class ReverseArrayUsingNewArray {
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
		arr=reverse(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] reverse(int[] arr) {
		System.out.println("The reverse array is:");
		int j=0;
		int [] newarr=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			newarr[j]=arr[i];
			j++;
		}
		return newarr;
	}

}
