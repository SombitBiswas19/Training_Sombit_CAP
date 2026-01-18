package array_basic;
import java.util.Scanner;

public class LeftRotateArray {

	public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1];
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int k = sc.nextInt();
        leftRotate(arr, k);

        for (int x : arr)
            System.out.print(x + " ");
        sc.close();
    }

}
