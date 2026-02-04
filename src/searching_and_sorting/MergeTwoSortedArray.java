package searching_and_sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,7};
		int[] arr2= {3,4,5,7,8,9};
		int[] arr3=mergetwosortedarray(arr1,arr2);
		System.out.println(Arrays.toString(arr3));

	}

	private static int[] mergetwosortedarray(int[] arr1, int[] arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		int[] arr3=new int[n1+n2];
		
		int i=0,j=0,k=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr3[k]=arr1[i];
				i++;k++;
			}
			else {
				arr3[k]=arr2[j];
				j++;k++;
			}
		}
		while(i<n1)
		{
				arr3[k]=arr1[i];
				i++;k++;
			
		}
		while(j<n2)
		{
				arr3[k]=arr2[j];
				j++;k++;
			
		}
		return arr3;
	}

}
