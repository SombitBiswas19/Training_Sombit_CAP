package searching_and_sorting;

import java.util.Arrays;

public class Sorting_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 0, 1, 2,0, 2 ,1};
		DNF(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void DNF(int[] arr) {
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;

		while (mid <= end) {
			if (arr[mid] == 0) {
				int temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				mid++;
				start++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int temp = arr[end];
				arr[end] = arr[mid];
				arr[mid] = temp;
				end--;
			}
		}

	}

}
