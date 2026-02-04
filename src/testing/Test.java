package testing;

import java.util.Arrays;
import java.util.Collections;

public class Test {
//	 Test()
//	{
//		 interface s { // we can create interface inside constructor
//			
//		}
//	}
	 
	 public void m1()
	 {
		 class Alu{
			 
		 }
	 }
	 
	 public static int[] reverse(int[] arr)
	 {
		 int i=0,j=arr.length-1;
			while(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
			}
			return arr;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(Arrays.toString(reverse(arr)));
		
		System.out.println("=========================");
		
		int arr1[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				System.out.println(arr1[i][j]);
			}
		}
		System.out.println("=======================");
		
		remove_element_from_2d_array(arr1,2);
		System.out.println("=======================");
		
		System.out.println(smallest_number(arr1));
	}

	private static int smallest_number(int[][] arr1) {
		int min=arr1[0][0];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				if(arr1[i][j]<min) {
					min=arr1[i][j];
				}
			}
		}
		return min;
	}

	private static void remove_element_from_2d_array(int[][] arr1,int element) {
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				if(arr1[i][j]==element) {
					arr1[i][j]=Integer.MIN_VALUE;
				}
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				if(arr1[i][j]!=Integer.MIN_VALUE) {
				System.out.print(arr1[i][j]+ " ");}
				
			}
			System.out.println();
		}
		System.out.println("=======================");
	}

}
