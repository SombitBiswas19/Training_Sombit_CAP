package searching_and_sorting;

import java.util.ArrayList;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 7, 13, 14, 19, 20 };
		System.out.println(binary_search_recur(a, 0, a.length - 1, 13));
		System.out.println(binary_search_loop(a,13));
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(13);
		list.add(14);
		list.add(19);
		list.add(20);
		System.out.println(binary_search_loop_arraylist(list, 13));
	}

	private static int binary_search_recur(int[] arr, int low, int high, int key) {

		if (low > high) {
			return -1;
		}
		int mid = low + ((high - low) / 2); // mid=high+low/2 for high+low it may exceed integer max.
		if (arr[mid] == key) {
			return mid;
		}
		if (key > arr[mid]) {
			return binary_search_recur(arr, mid + 1, high, key);
		} else {
			return binary_search_recur(arr, low, mid - 1, key);
		}
	}

	private static int binary_search_loop(int[] arr, int key) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2); // mid=high+low/2 for high+low it may exceed integer max.
			if (arr[mid] == key) {
				return mid;
			}
			if (key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	private static int binary_search_loop_arraylist(ArrayList<Integer> list, int key) {
		int low = 0, high = list.size() - 1;
		while (low <= high) {
			int mid = low + ((high - low) / 2); // mid=high+low/2 for high+low it may exceed integer max.
			if (list.get(mid) == key) {
				return mid;
			}
			if (key > list.get(mid)) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	//get method=> O(1), return type generic type and argument is integer type
	//indexOf method=> O(n) one type of linear search algorithm
	//add method-> Argument Generic type, Return type is boolean type. T.C:- Amortized T.c-> O(1)
	
}
