package array_basic;
import java.util.Scanner;
public class RightRotateArray {

	public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
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
        rightRotate(arr, k);
        
        for (int x : arr)
            System.out.print(x + " ");
    }

}
