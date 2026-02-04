package searching_and_sorting;

import java.util.Arrays;
import java.util.Collections;

public class PeakElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,8,6,3,0}; 
		
		peak_element_TC_n(arr);
		System.out.println(peak_element_TC_logn(arr));
		
		//Arrays.sor
		Collections.sort(null);

	}

	private static int peak_element_TC_logn(int[] arr) {
		int low=0,high=arr.length-1;
		while(low<high)
		{
			int mid=low+((high-low)/2);
			if(arr[mid]<arr[mid+1])
			{
				low=mid+1;
			}
			else {
				high=mid;
			}
		}
		return arr[low];
		
	}

	private static void peak_element_TC_n(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println(arr[i]); ////return 8 as output
				return;
			}
		}
		
	}

}
