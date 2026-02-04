package searching_and_sorting;

import java.util.Arrays;
import java.util.HashMap;

public class Count_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 6, 3, 0};
        int[] arr1 = {1};
        int[] arr2 = {};

        int[] arr4 = countsort(arr);
        System.out.println("Sorted arr: " + Arrays.toString(arr4)); 

        int[] arr5 = countsort(arr1);
        System.out.println("Sorted arr1: " + Arrays.toString(arr5));

        int[] arr6 = countsort(arr2);
        System.out.println("Sorted arr2: " + Arrays.toString(arr6));
        
        
    }

    private static int[] countsort(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return arr;
        }
        
        int max = arr[0]; //Find the maximum element to determine the range
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //Count array to store frequency of each element->The size is max + 1 because the range is 0 to max
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int[] ans = new int[n];
        int j = 0; 
        //Reconstruct the sorted array from the count array
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                ans[j] = i;
                j++;
                count[i]--;
            }
        }
        return ans;
    }
}
