package searching_and_sorting;

import java.util.Arrays;

public class Wave_form_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 8};
		wavearray(arr);
	}

	private static void wavearray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i+=2)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}


}
