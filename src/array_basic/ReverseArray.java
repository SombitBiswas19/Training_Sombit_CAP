package array_basic;

import java.util.Scanner;

public class ReverseArray {
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
		int i=0,j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
		
	}

}
