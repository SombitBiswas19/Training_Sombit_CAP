package array_basic;

import java.util.Scanner;

public class SecondLargestElement {
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
		System.out.println("Second Largest element: "+Secondlargestelement(arr));
	}

	private static int Secondlargestelement(int[] arr) {
		int max=arr[0],second_max=-1;
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++)
		{
			if (arr[i] > second_max && arr[i] != max) {
				second_max = arr[i];
            }
		}
		return second_max;
	}
}
