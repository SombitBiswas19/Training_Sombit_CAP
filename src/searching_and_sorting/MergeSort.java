package searching_and_sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,6,9,10,1,4,5,7};
		mergesort(arr1,0,arr1.length-1);
		System.out.println(Arrays.toString(arr1));

	}

	private static void mergesort(int[] arr,int start,int end) {
		if(start<end) {
		int mid=start+((end-start)/2);
		mergesort(arr,start,mid);
		mergesort(arr,mid+1,end);
		merge(arr,start,mid,end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1=mid-start+1;
		int n2=end-mid;
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=arr[i+start];
		}
		for(int i=0;i<n2;i++)
		{
			arr2[i]=arr[i+mid+1];
		}
		
		int i=0,j=0,k=start;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;k++;
			}
			else {
				arr[k]=arr2[j];
				j++;k++;
			}
		}
		while(i<n1)
		{
				arr[k]=arr1[i];
				i++;k++;
			
		}
		while(j<n2)
		{
				arr[k]=arr2[j];
				j++;k++;
			
		}
		
	}

}
